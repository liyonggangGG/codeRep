package com.nlx.appliaction.httpapis.sms253.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.nlx.appliaction.common.utils.other.Constants;
import com.nlx.appliaction.common.utils.resp.AjaxResult;
import com.nlx.appliaction.httpapis.sms253.util.conf.UtilsProperties;
import com.nlx.appliaction.httpapis.sms253.util.domain.SmsRequest;
import com.nlx.appliaction.httpapis.sms253.util.domain.SmsResponse;

/**
 * 说明：短信接口类
 * 创建人：FH Q313596790
 * 修改时间：2013年2月22日
 * 
 * @version
 */
@Component
public class SmsUtil
{
	private static final Logger LOGGER = LoggerFactory.getLogger(SmsUtil.class);
	private static final String MESSAGEHEAD = "【茶易通】";
	
	@Autowired
	private UtilsProperties utilsProperties;
	
	/**
	 * 短信账号
	 */
	private static String smsAccount;
	/**
	 * 短信账号的密码
	 */
	private static String smsPassword;
	/**
	 * 短信URL
	 */
	private static String smsUrl;
	
    @PostConstruct
    public void setConfigValues() {
    	smsAccount = utilsProperties.getSmsAccount();
    	smsPassword = utilsProperties.getSmsPassword();
    	smsUrl = utilsProperties.getSmsUrl();
    }

	public static AjaxResult<String> sendSms(String phone, String message)
	{
		message = MESSAGEHEAD + message;
		AjaxResult<String> ajaxResult = new AjaxResult<>();
		ajaxResult.setMessage("发送短信成功");
		ajaxResult.setSuccess(true);
		ajaxResult.setCode(Constants.Success.DATA_SUCC);
		try
		{
			SmsRequest smsRequest = new SmsRequest(smsAccount, smsPassword, message,
					phone);
			String requestJson = JSON.toJSONString(smsRequest);
			String response = sendSmsByPost(smsUrl, requestJson);
			LOGGER.debug("短信发送：{}, 返回结果：{}", requestJson, response);
			SmsResponse smsResponse = JSON.parseObject(response, SmsResponse.class);

			if (!"0".equals(smsResponse.getCode()))
			{
				ajaxResult.setSuccess(false);
				ajaxResult.setMessage(smsResponse.getErrorMsg());
				ajaxResult.setCode(Constants.Error.SMS_ERROR);
			}
		} catch (Exception e)
		{
			LOGGER.error("发送短信失败!",e);
			ajaxResult.setSuccess(false);
			ajaxResult.setMessage("系统内部错误");
			ajaxResult.setCode(Constants.Error.SERVER_ERROR);
		}

		return ajaxResult;
	}

	public static String sendSmsByPost(String path, String postContent)
	{
		URL url = null;
		try
		{
			url = new URL(path);
			HttpURLConnection httpURLConnection = (HttpURLConnection) url
					.openConnection();
			httpURLConnection.setRequestMethod("POST");// 提交模式
			httpURLConnection.setConnectTimeout(10000);// 连接超时 单位毫秒
			httpURLConnection.setReadTimeout(2000);// 读取超时 单位毫秒
			// 发送POST请求必须设置如下两行
			httpURLConnection.setDoOutput(true);
			httpURLConnection.setDoInput(true);
			httpURLConnection.setRequestProperty("Charset", "UTF-8");
			httpURLConnection.setRequestProperty("Content-Type",
					"application/json");

			httpURLConnection.connect();
			OutputStream os = httpURLConnection.getOutputStream();
			os.write(postContent.getBytes("UTF-8"));
			os.flush();

			StringBuilder sb = new StringBuilder();
			int httpRspCode = httpURLConnection.getResponseCode();
			if (httpRspCode == HttpURLConnection.HTTP_OK)
			{
				// 开始获取数据
				BufferedReader br = new BufferedReader(new InputStreamReader(
						httpURLConnection.getInputStream(), "utf-8"));
				String line = null;
				while ((line = br.readLine()) != null)
				{
					sb.append(line);
				}
				br.close();
				return sb.toString();

			}

		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	public static String getFourRandom()
	{
		Random random = new Random();
		String fourRandom = random.nextInt(10000) + "";
		int randLength = fourRandom.length();
		if (randLength < 4)
		{
			for (int i = 1; i <= 4 - randLength; i++)
				fourRandom = "0" + fourRandom;
		}
		return fourRandom;
	}

	public static void main(String[] args)
	{	
		SmsUtil.smsAccount="N1212062";
		SmsUtil.smsPassword="gNOqJ3159H76cb";
		SmsUtil.smsUrl="http://smssh1.253.com/msg/send/json";
		
		sendSms("18623839482", "短信验证码:"+getFourRandom()+"，有效期15分钟，遵义茶叶交易中心及其员工绝不会向您索要验证码，请勿泄露。");
	}
}

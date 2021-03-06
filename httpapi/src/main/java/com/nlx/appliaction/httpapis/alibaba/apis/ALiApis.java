
/**
 * @标题: ALiSms.java
 * @包名： com.nlx.appliaction.httpapis.alibaba
 * @功能描述：TODO
 * @author： liyonggang
 * @创建时间： 2018年4月20日 下午3:20:09
 * @version v1.0
 */

package com.nlx.appliaction.httpapis.alibaba.apis;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.google.common.collect.Maps;
import com.nlx.appliaction.httpapis.alibaba.domain.RiskInformationResponse;
import com.nlx.appliaction.httpapis.alibaba.util.HttpUtils;

/**
 * @类描述 阿里api对接
 * @创建时间 2018年4月20日下午3:20:09
 * @author liyonggang
 */

public class ALiApis
{
    
    /**
     * @throws ClientException
     * @描述:阿里短信单个发送 需要导入依赖 <dependency> <groupId>com.aliyun</groupId>
     *              <artifactId>aliyun-java-sdk-core</artifactId>
     *              <version>3.2.8</version> 注：如提示报错，先升级基础包版，无法解决可联系技术支持
     *              </dependency> <dependency> <groupId>com.aliyun</groupId>
     *              <artifactId>aliyun-java-sdk-dysmsapi</artifactId>
     *              <version>1.1.0</version> </dependency>
     */
    public static SendSmsResponse sendSms(String phoneNumber,
        Map<String, String> params)
        throws ClientException
    {
        // 设置超时时间-可自行调整
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");
        // 初始化ascClient需要的几个参数
        final String product = "Dysmsapi";// 短信API产品名称（短信产品名固定，无需修改）
        final String domain = "dysmsapi.aliyuncs.com";// 短信API产品域名（接口地址固定，无需修改）
        // 替换成你的AK
        final String accessKeyId = "LTAIFHawrdKr0aK4";// 你的accessKeyId,参考本文档步骤2
        final String accessKeySecret = "2yjqpLG3A3JkkeOGn8qCjgxucwYImO";// 你的accessKeySecret，参考本文档步骤2
        // 初始化ascClient,暂时不支持多region（请勿修改）
        IClientProfile profile = DefaultProfile
            .getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
        DefaultProfile
            .addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
        IAcsClient acsClient = new DefaultAcsClient(profile);
        // 组装请求对象
        SendSmsRequest request = new SendSmsRequest();
        // 使用post提交
        request.setMethod(MethodType.POST);
        // 必填:待发送手机号。支持以逗号分隔的形式进行批量调用，批量上限为1000个手机号码,批量调用相对于单条调用及时性稍有延迟,验证码类型的短信推荐使用单条调用的方式
        request.setPhoneNumbers(phoneNumber);
        // 必填:短信签名-可在短信控制台中找到
        request.setSignName("mydesc画");
        // 必填:短信模板-可在短信控制台中找到
        request.setTemplateCode("SMS_81900004");
        // 可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
        // 友情提示:如果JSON中需要带换行符,请参照标准的JSON协议对换行符的要求,比如短信内容中包含\r\n的情况在JSON中需要表示成\\r\\n,否则会导致JSON在服务端解析失败
        request.setTemplateParam(JSON.toJSONString(params));
        // 可选-上行短信扩展码(扩展码字段控制在7位或以下，无特殊需求用户请忽略此字段)
        // request.setSmsUpExtendCode("90997");
        // 可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
        request.setOutId("yourOutId");
        // 请求失败这里会抛ClientException异常
        SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
        if (sendSmsResponse.getCode() != null
            && sendSmsResponse.getCode().equals("OK"))
        {
            // 请求成功
        }
        return sendSmsResponse;
    }
    
    /**
     * 
     * 阿里云个人风险信息综合和查询 接口
     * 
     * @return
     * @throws Exception
     */
    public static RiskInformationResponse riskInformationCheck(String bankCardNo,
        String idCard, String mobile, String name)
        throws Exception
    {
        String host = "http://xsblackhit.market.alicloudapi.com";
        String path = "/ws/black/compBQuery";
        String method = "POST";
        String appcode = "cc42e5c3a28b4073879f4441c7c401c5";
        Map<String, String> headers = Maps.newHashMap();
        // 最后在header中的格式(中间是英文空格)为Authorization:APPCODE
        // 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        // 根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/json; charset=UTF-8");
        Map<String, String> querys = Maps.newHashMap();
        querys.put("bankCardNo",
            StringUtils.isEmpty(bankCardNo) ? "bankCardNo" : bankCardNo);// 银行卡号,可不选
        querys.put("idCard", idCard);
        querys.put("mobile", mobile);
        querys.put("name", name);
        querys.put("sign",
            DigestUtils.md5Hex(
                "6tj4u" + new SimpleDateFormat("yyyyMMdd").format(new Date())));
        String bodys = "请输入查询参数";
        HttpResponse response =
            HttpUtils.doPost(host, path, method, headers, querys, bodys);
        return JSONObject.parseObject(
            EntityUtils.toString(response.getEntity()),
            RiskInformationResponse.class);
    }
}

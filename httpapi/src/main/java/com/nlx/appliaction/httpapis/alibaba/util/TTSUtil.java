package com.nlx.appliaction.httpapis.alibaba.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.alibaba.idst.nls.NlsClient;
import com.alibaba.idst.nls.NlsFuture;
import com.alibaba.idst.nls.event.NlsEvent;
import com.alibaba.idst.nls.event.NlsListener;
import com.alibaba.idst.nls.protocol.NlsRequest;
import com.alibaba.idst.nls.protocol.NlsResponse;
import com.nlx.appliaction.excetion.ValidateParaException;
import com.nlx.appliaction.httpapis.alibaba.conf.AiTTSConfig;

@Service
public class TTSUtil implements NlsListener
{
    private static final Logger log = LoggerFactory.getLogger(TTSUtil.class);
    
    @Autowired
    private AiTTSConfig aiTTSConfig;
    
    public OutputStream transFormMuisc(String ttsText, OutputStream out)
        throws ValidateParaException
    {
        String akId = aiTTSConfig.getAccessKeyID();
        String akSecret = aiTTSConfig.getAccessKeySecret();
        NlsClient client = new NlsClient();
        // 初始化NlsClient
        client.init();
        try
        {
            NlsRequest req = new NlsRequest();
            String appkey = "nls-service";
            req.setAppKey(appkey); // 设置语音文件格式
            req.setTtsRequest(ttsText); // 传入测试文本，返回语音结果
            req.setTtsEncodeType("wav");// 返回语音数据格式，支持pcm,wav.alaw
            req.setTtsVolume(100); // 音量大小默认50，阈值0-100
            req.setTtsSpeechRate(0); // 语速，阈值-500~500
            req.setTtsBackgroundMusic(1, 0);// 背景音乐编号,偏移量
            req.authorize(akId, akSecret); // 请替换为用户申请到的Access Key ID和Access Key
                                           // Secret
            NlsFuture future = client.createNlsFuture(req, this); // 实例化请求,传入请求和监听器
            byte[] data;
            while ((data = future.read()) != null)
            {
                out.write(data, 0, data.length);
            }
            future.await(10000); // 设置服务端结果返回的超时时间
        }
        catch (Exception e)
        {
            log.error("语音转换异常 error :{}", e);
            throw new ValidateParaException("语言转换异常");
        }
        finally
        {
            client.close();
        }
        return out;
    }
    
    @Override
    public void onMessageReceived(NlsEvent e)
    {
        NlsResponse response = e.getResponse();
        String result = "";
        int statusCode = response.getStatus_code();
        if (response.getTts_ret() != null)
        {
            result += "\nget tts result: statusCode=[" + statusCode + "], "
                + response.getTts_ret();
        }
        if (!StringUtils.isEmpty(result))
        {
            // 成功
        }
        else
        {
            // 失败
        }
    }
    
    @Override
    public void onOperationFailed(NlsEvent e)
    {
        // 识别失败的回调
        System.out.print("on operation failed: ");
        System.out.println(e.getErrorMessage());
    }
    
    @Override
    public void onChannelClosed(NlsEvent e)
    {
        // socket 连接关闭的回调
        System.out.println("on websocket closed.");
    }
    
    public static void main(String[] args)
        throws FileNotFoundException, ValidateParaException
    {
        new TTSUtil().transFormMuisc("测试语音转换",
            new FileOutputStream(new File("/test.wav")));
    }
}
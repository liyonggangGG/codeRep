package com.nlx.appliaction.httpapis.alibaba.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 阿里账户信息配置
 * 
 * @author Administrator
 *
 */
@Configuration
@ConfigurationProperties("alibaba")
public class AiTTSConfig
{
    
    private String AccessKeyID;
    
    private String AccessKeySecret;
    
    public String getAccessKeyID()
    {
        return AccessKeyID;
    }
    
    public void setAccessKeyID(String accessKeyID)
    {
        AccessKeyID = accessKeyID;
    }
    
    public String getAccessKeySecret()
    {
        return AccessKeySecret;
    }
    
    public void setAccessKeySecret(String accessKeySecret)
    {
        AccessKeySecret = accessKeySecret;
    }
}
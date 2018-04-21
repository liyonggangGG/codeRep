package com.nlx.appliaction.httpapis.sms253.util.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/**
 * 
*    
* 项目名称：tea-common-utils   
* 类名称：UtilsProperties   
* 类描述：工具类yml配置属性注入类 
* 创建人：qi_baijian   
* 创建时间：2018年3月24日 上午12:11:16   
* 修改人：qi_baijian   
* 修改时间：2018年3月24日 上午12:11:16   
* 修改备注：   
* @version    
*
 */
@Component
@ConfigurationProperties(prefix = "utils")
public class UtilsProperties {
	/**
	 * 短信账号
	 */
	private String smsAccount;
	/**
	 * 短信账号的密码
	 */
	private String smsPassword;
	/**
	 * 短信接口URL地址
	 */
	private String smsUrl;
	/**
	 * 文件上传服务基础路径
	 */
	private String uploadUrl;
	
	/**
	 * 临时文件存放路径
	 */
	private String tmpFilePath;
	
	public String getTmpFilePath()
    {
        return tmpFilePath;
    }
    public void setTmpFilePath(String tmpFilePath)
    {
        this.tmpFilePath = tmpFilePath;
    }
    public String getSmsAccount() {
		return smsAccount;
	}
	public void setSmsAccount(String smsAccount) {
		this.smsAccount = smsAccount;
	}
	public String getSmsPassword() {
		return smsPassword;
	}
	public void setSmsPassword(String smsPassword) {
		this.smsPassword = smsPassword;
	}
	public String getSmsUrl() {
		return smsUrl;
	}
	public void setSmsUrl(String smsUrl) {
		this.smsUrl = smsUrl;
	}
	public String getUploadUrl() {
		return uploadUrl;
	}
	public void setUploadUrl(String uploadUrl) {
		this.uploadUrl = uploadUrl;
	}
}

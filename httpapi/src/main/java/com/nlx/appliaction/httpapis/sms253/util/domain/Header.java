package com.nlx.appliaction.httpapis.sms253.util.domain;

public class Header {
	
	private String imei ;//手机imei号
	
	private String opTime ;//请求时间
	
	private String versionCode ; //应用版本号
	
	private String platform ;//平台
	
	private String osVersion ;//操作系统版本号
	
	private String etworkType ;//请求的网络类型
	
	private String token ;//登录用户的sessionId
	
	private String deviceId ;//设备号
	
	private String brand ;//手机品牌
	
	private String macaddress ;//mac地址
	
	private String model ;//手机系统版本
	
	private String screen ;//手机屏幕尽寸
	
	private String channelCode ;//发布渠道
	
	private String nonceStr ;//随机加密串
	
	private String sign ;//MD5签名串

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getOpTime() {
		return opTime;
	}

	public void setOpTime(String opTime) {
		this.opTime = opTime;
	}

	public String getVersionCode() {
		return versionCode;
	}

	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getEtworkType() {
		return etworkType;
	}

	public void setEtworkType(String etworkType) {
		this.etworkType = etworkType;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMacaddress() {
		return macaddress;
	}

	public void setMacaddress(String macaddress) {
		this.macaddress = macaddress;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getNonceStr() {
		return nonceStr;
	}

	public void setNonceStr(String nonceStr) {
		this.nonceStr = nonceStr;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}


}

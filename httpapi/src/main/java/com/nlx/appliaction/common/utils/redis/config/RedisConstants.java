package com.nlx.appliaction.common.utils.redis.config;

/**
 * 用来存放radis key常量
 * 
 * @author Chen Xiaoxiao
 * @date 2018年3月15日
 */
public interface RedisConstants {

    /** *********************** 登录注册相关  ************************** */
    /**
     * 用户登录信息key（此key为前半部分，完整key=USER_LOGIN_PREFIX+token）
     */
    public static final String USER_LOGIN_PREFIX = "USER_LOGIN_";

    /**
     * 用户登录信息用户id和token的key（此key为前半部分，完整key=USER_LOGIN_USERID_+userid）
     */
    public static final String USER_LOGIN_USERID_PREFIX = "USER_LOGIN_USERID_";
    
    /**
     * 茶市app注册验证码key。（完整key为：TMAPP_REG_VERIFY_CODE_KEY+设备号）
     */
    public static final String TMAPP_REG_VERIFY_CODE_KEY = "TMAPP_REG_VERIFY_CODE_KEY_";
    
    /**
     * 茶市app注册短信码key。（完整key为：TMAPP_REG_SMS_CODE_KEY+设备号）
     */
    public static final String TMAPP_REG_SMS_CODE_KEY = "SMS_TYPE_REG";

    /**
     * 茶市app注册短信码key。（完整key为：TMAPP_REG_SMS_CODE_KEY+设备号）
     */
    public static final String TMAPP_RESETPWD_SMS_CODE_KEY = "SMS_TYPE_RESETPWD";
    
    /**
     * 茶市app redis默认登录超时时间。//默认20天超时。
     */
    public static final int TMAPP_LOGIN_TIMEOUT_SECONDS = 60 * 60 * 24 * 20;
    
    /** *********************** 交易-行情相关 ************************** */
    
	/**
	 * 交易-智慧贸易列表数据
	 */
	public static final String JY_HZMY = "jy_hzmy";
	
	/**
     * 交易-在线茶商列表数据
     */
    public static final String JY_ZXCS = "jy_zxcs";
    
    /**
     * 交易-出口茶列表数据
     */
    public static final String JY_CKC = "jy_ckc";
    
    /**
     * 交易-现货挂牌列表数据
     */
    public static final String JY_XHGP = "jy_xhgp";
	
    /**
     * 交易-竞拍列表数据
     */
    public static final String JY_JP = "jy_jp";
    
    /**
     * 交易-自选列表数据
     */
    public static final String JY_ZX = "jy_zx";
    
    
    
    
	/** *********************** app相关  ************************** */
	/**
     * app茶市首页色块key
     */
    public static final String APP_CS_COLOR_BLOCK = "app_cs_color_block";
	
    /**
     * app茶城首页色块key
     */
    public static final String APP_CC_COLOR_BLOCK = "app_cc_color_block";
    
    /** *********************** 通用  ************************** */
    /**
     * 通用banner的key(格式为：通用_banner_数字(1:茶市app;2：茶城app;3:门户;4:茶市web;5:茶城web))_位置序号(1,2...)
     */
    public static final String TY_BANNER = "ty_banner_";
    
    /**
     * 通用资讯key(格式为：通用_资讯_资讯类型)
     * CJXW    财经新闻
     * CYJR    茶业金融
     * SCGC    市场观察
     * TJXW    推荐新闻
     * RDXW    热点新闻
     * ZXZX    最新资讯
     * ZXGG    中心公告
     * ZXDT    中心动态
     * CPZX    产品资讯
     * FXPL    分析评论
     * JMWZ    假冒网站
     * HYDT    行业动态
     * MTBD    媒体报道
     * 
     * MQFC    名企风采
     * GJFL    国家法律
     * XZFG    行政法规
     * SFJS    司法解释
     * GFWJ    规范文件
     * CJSJJ   茶交所简介
     * QYDSJ   企业大事记
     * ZCJY    总裁寄语
     * ZZJG    组织结构
     * LXFS    联系方式
     * RCZP    人才招聘
     * FLSM    法律声明
     * WZDT    网站地图
     * QYWH    企业文化
     * CPSY    产品溯源
     * JYJG    检验机构
     * BZTX    标准体系
     * JSFW    交收服务
     * RTFW    融通服务
     * HZJG    合作机构
     * CJWT    常见问题
     * 
     * RJXZ    软件下载
     * FWZX    服务中心
     * FLFG    法律法规
     * GYWM    关于我们
     * 
     * ZHWT    账户问题
     * JYWT    交易问题
     * CZZN    操作指南
     * 
     * SSSP    上市商品（茶市）
     * JYGZ    交易规则（茶市）
     * BZZX    帮助中心（茶市）
     * 
     * SYZX    所有资讯
     */
    public static final String TY_NEWS = "ty_news_";
    
    /**
     * 通用公告key(格式为：通用_公告)
     */
    public static final String TY_NOTICE = "ty_notice";
    
    /**
     * 通用app茶市版本号key
     */
    public static final String TY_APP_CS_VERSION = "ty_app_cs_version";
    
    /**
     * 通用app茶城版本号key
     */
    public static final String TY_APP_CC_VERSION = "ty_app_cc_version";
    
    /**
     * 通用上市商品key
     */
    public static final String TY_CS_SP = "ty_cs_sp";
    
    /**
     * 通用资讯点击量key(格式为：通用_资讯_点击量)
     */
    public static final String TY_ZX_DJL = "ty_zx_djl";
    
    /** *********************** 茶城  ************************** */
    /**
     * 茶城所有商品key(格式为：茶城_商品)
     */
    public static final String CC_GOODS = "cc_goods";
    
    /**
     * 茶城所有商品类型以及品牌key(格式为：茶城_商品类型和品牌)
     */
    public static final String CC_GOODS_TYPE_BRAND = "cc_goods_type_brand";
    
    /** *********************** 茶市  ************************** */
    public static final String CS_TRADE_GOODS = "cs_trade_goods";
    
    /**
     * WebSocket 相关
     */
    public static final String WEB_SOCKET_REDIS_KEY_PREFIX = "WEBSOCKET_";
    /**
     * WebSocket UserToken -> ChannelId  映射
     */
    public static final String WEB_SOCKET_REDIS_KEY_TOKEN_PREFIX = WEB_SOCKET_REDIS_KEY_PREFIX.concat("TOKEN_");
    
    /**
     * WebSocket Channel_Id -> ChannelId 映射
     */
    public static final String WEB_SOCKET_REDIS_KEY_CHANNELID_PREFIX = WEB_SOCKET_REDIS_KEY_PREFIX.concat("CHANNELID_");
    
    /**
     * WebSocket Channel_Id -> UserId 映射
     */
    public static final String WEB_SOCKET_REDIS_KEY_CHANNEL_ID_PREFIX = WEB_SOCKET_REDIS_KEY_PREFIX.concat("CHANNEL_ID_");
    
    /**
     * WebSocket UserId -> ChannelId 映射
     */
    public static final String WEB_SOCKET_REDIS_KEY_USERID_PREFIX = WEB_SOCKET_REDIS_KEY_PREFIX.concat("USERID_");
    
    /**
     * WebSocket Subscribe 订阅前缀，用于标识某一用户订阅了那些消息
     */
    public static final String WEB_SOCKET_REDIS_KEY_SUBSCRIBE_PREFIX = WEB_SOCKET_REDIS_KEY_PREFIX.concat("SUBSCRIBE_"); 
    
    /**
     * WebSocket Subscribe Kline k线订阅
     */
    public static final String WEB_SOCKET_REDIS_KEY_SUBSCRIBE_KLINE_PREFIX = WEB_SOCKET_REDIS_KEY_PREFIX.concat("SUBSCRIBE_KLINE_"); 
    
    /**
     * WebSocket Subscribe Kline Buy 5Level 看view 买5档订阅
     */
    public static final String WEB_SOCKET_REDIS_KEY_SUBSCRIBE_K_B_5LEVEL_PREFIX = WEB_SOCKET_REDIS_KEY_PREFIX.concat("SUBSCRIBE_K_B_5LEVEL_"); 
     
    /**
     * WebSocket Subscribe Kline Sell 5Level kview 卖5档订阅
     */
    public static final String WEB_SOCKET_REDIS_KEY_SUBSCRIBE_K_S_5LEVEL_PREFIX = WEB_SOCKET_REDIS_KEY_PREFIX.concat("SUBSCRIBE_K_S_5LEVEL_"); 
     
    /**
     * WebSocket Subscribe Sell 买五档订阅
     */
    public static final String WEB_SOCKET_REDIS_KEY_SUBSCRIBE_SELL_PREFIX = WEB_SOCKET_REDIS_KEY_PREFIX.concat("SUBSCRIBE_SELL_"); 
    
    /**
     * WebSocket Subscribe Buy 买五档订阅
     */
    public static final String WEB_SOCKET_REDIS_KEY_SUBSCRIBE_BUY_PREFIX = WEB_SOCKET_REDIS_KEY_PREFIX.concat("SUBSCRIBE_BUY_"); 
    
    
    /**
     * WebSocket Kline  监听k线
     */
    public static final String WEB_SOCKET_REDIS_KEY_KLINE_PREFIX = WEB_SOCKET_REDIS_KEY_PREFIX.concat("KLINE_"); 
    

    /**
     * WebSocket Sell 进入卖出页面订阅消息
     */
    public static final String WEB_SOCKET_REDIS_KEY_SELL_PREFIX = WEB_SOCKET_REDIS_KEY_PREFIX.concat("SELL_"); 
    
    /**
     * WebSocket Buy 进入买入界面 订阅消息
     */
    public static final String WEB_SOCKET_REDIS_KEY_BUY_PREFIX = WEB_SOCKET_REDIS_KEY_PREFIX.concat("BUY_");
    
    /**
     * WebSocket K_Buy 进入Kview订阅买5档
     */
    public static final String WEB_SOCKET_REDIS_KEY_K_BUY_PREFIX = WEB_SOCKET_REDIS_KEY_PREFIX.concat("K_BUY_");
    
    /**
     * WebSocket K_Sell 进入Kview订阅卖5档
     */
    public static final String WEB_SOCKET_REDIS_KEY_K_SELL_PREFIX = WEB_SOCKET_REDIS_KEY_PREFIX.concat("K_SELL_");
    
    /**
     * WebSocket Proxy
     */
    public static final String WEB_SOCKET_REDIS_KEY_PROXY_PREFIX = WEB_SOCKET_REDIS_KEY_PREFIX.concat("PROXY_"); 
    
    /**
     * WebSocket RiseFallRanking 涨跌幅
     */
    public static final String WEB_SOCKET_REDIS_KEY_RISEFALL_PREFIX = WEB_SOCKET_REDIS_KEY_PREFIX.concat("RISEFALL_"); 
    
    
    /**
     * WebSocket WebScreen 屏幕通知 -> 屏幕通知ChannelId映射
     */
    public static final String WEB_SOCKET_REDIS_KEY_SCREEN_PREFIX = WEB_SOCKET_REDIS_KEY_PREFIX.concat("SCREEN_"); 
    
    /**
     * MD5 private key for android
     */
	public static final String SIGNATURE_PRIVATE_KEY_ANDORID ="MD5_PRIVATE_KEY_ANDROID";
}
package com.nlx.appliaction.common.utils.mq.amqp.constans;
/**
 * 
*    
* 类名称：RabbitMQConstants   
* 类描述： RabbitMQ 常量定义(exchanges,queues,topics...and so on) 
* 修改备注：   
 */
public class RabbitMQConstants {
	private RabbitMQConstants(){}
	/**
	 * TOPICS
	 */
	public static final String WEB_SOCKET_TOPIC= "web.socket.topic";
	/**
	 * QUEUES
	 */
	/**
	 * 用户登录信息变化MQ
	 */
	public static final String SOCKET_USER_LOGIN_QUEUE= "socket.user.login.queue";
	/**
	 * 用户资产变动MQ
	 */
	public static final String SOCKET_USER_ASSET_QUEUE = "socket.user.asset.queue";
	/**
	 * 交易Socket相关MQ（info服务->socket）
	 */
	public static final String SOCKET_TRADE_QUEUE = "socket.trade.queue";
	/**
	 * 大盘（info服务->socket）
	 */
	public static final String SOCKET_TRADE_INFO_QUEUE = "socket.trade.info.queue";
	/**
	 * 交易（交易算法->info 服务）
	 */
	public static final String TRADE_INFO_QUEUE = "trade.info.queue";
	
	/**
	 * 委托（交易算法->info 服务）
	 */
	public static final String TRADE_DEPUTED_QUEUE = "trade.deputed.queue";
	
	
	/**
	 * 大屏通知（cms-> screen ）
	 */
	public static final String INFO_NOTIFICATION_QUEUE = "info.notification.queue";
	
	
	/**
	 * EXCHANGES
	 */
	public static final String USER_ASSET_EXCHANGE = "user.asset";
	
	public static final String FANOUT_USER_ASSET_EXCHANGE = "fanout.user.asset";
	/**
	 * FANOUT EXCHANGES
	 */
	public static final String WEBSOCKET_INFONOTIFICATION_FANOUT_EXCHANGE = "ws.infonotification.fanout.exchange";
	
	public static final String WEBSOCKET_TRADEINFO_FANOUT_EXCHANGE = "ws.tradeinfo.fanout.exchange";
	
	public static final String WEBSOCKET_TRADE_FANOUT_EXCHANGE = "ws.trade.fanout.exchange";
	
	public static final String WEBSOCKET_USERASSET_FANOUT_EXCHANGE = "ws.userasset.fanout.exchange";
	
	public static final String WEBSOCKET_USERLOGIN_FANOUT_EXCHANGE = "ws.userlogin.fanout.exchange";
	
	
	/**
	 * ROUTING KEYS
	 */
	public static final String ROUTING_KEY_ALL = "*";
	
	public static final String USER_ASSET_ROUTING_KEY = "*.asset";
}

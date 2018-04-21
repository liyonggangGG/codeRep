package com.nlx.appliaction.common.utils.mq.amqp.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nlx.appliaction.common.utils.mq.amqp.constans.RabbitMQConstants;


/**
 * 
*    
* 项目名称：tea-user-service   
* 类名称：UserMqMessageSender   
* 类描述：   MQ消息发送类
* 创建人：GaoFeng   
* 创建时间：2018年4月17日 下午1:55:52   
* @version    
*
 */
@Component
public class UserMqMessageSender {
	private static Logger LOGGER = LoggerFactory.getLogger(UserMqMessageSender.class);
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	public <T> void send(T message) {
		LOGGER.info("receive message of TradeAccount, begin deal and send message...");
		try {
			this.rabbitTemplate.convertAndSend(RabbitMQConstants.WEBSOCKET_USERASSET_FANOUT_EXCHANGE,"", message);
			LOGGER.info("send message OK.");
		} catch(Exception e) {
			LOGGER.warn("send message to queue:{} failed!",RabbitMQConstants.SOCKET_USER_ASSET_QUEUE);
		}
	}
}

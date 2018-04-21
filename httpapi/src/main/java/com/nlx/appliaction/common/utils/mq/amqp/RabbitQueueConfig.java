package com.nlx.appliaction.common.utils.mq.amqp;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nlx.appliaction.common.utils.mq.amqp.constans.RabbitMQConstants;
@Configuration
public class RabbitQueueConfig{

	@Bean
    public Queue userLoginQueue() {
        return new Queue(RabbitMQConstants.SOCKET_USER_LOGIN_QUEUE);
    }
    
    @Bean
    public Queue userAssetQueue() {
        return new Queue(RabbitMQConstants.SOCKET_USER_ASSET_QUEUE);
    }
    
    @Bean
    public Queue tradeQueue() {
        return new Queue(RabbitMQConstants.SOCKET_TRADE_QUEUE);
    }
    
    @Bean
    public Queue tradeInfoQueue() {
        return new Queue(RabbitMQConstants.SOCKET_TRADE_INFO_QUEUE);
    }

    @Bean
    public Queue infoNotificationQueue() {
        return new Queue(RabbitMQConstants.INFO_NOTIFICATION_QUEUE);
    }
    
    @Bean
    FanoutExchange userLoginFanoutExchange() {
        return new FanoutExchange(RabbitMQConstants.WEBSOCKET_USERLOGIN_FANOUT_EXCHANGE);
    }
    
    @Bean
    Binding bindingExchangeUserLoginQueue(Queue userLoginQueue,FanoutExchange userLoginFanoutExchange) {
        return BindingBuilder.bind(userLoginQueue).to(userLoginFanoutExchange);
    }
    
    @Bean
    FanoutExchange userAssetQueueFanoutExchange() {
        return new FanoutExchange(RabbitMQConstants.WEBSOCKET_USERASSET_FANOUT_EXCHANGE);
    }
    
    @Bean
    Binding bindingExchangeUserAssetQueue(Queue userAssetQueue,FanoutExchange userAssetQueueFanoutExchange) {
        return BindingBuilder.bind(userAssetQueue).to(userAssetQueueFanoutExchange);
    }
    
    @Bean
    FanoutExchange tradeQueueFanoutExchange() {
        return new FanoutExchange(RabbitMQConstants.WEBSOCKET_TRADE_FANOUT_EXCHANGE);
    }
    
    @Bean
    Binding bindingExchangeTradeQueue(Queue tradeQueue,FanoutExchange tradeQueueFanoutExchange) {
        return BindingBuilder.bind(tradeQueue).to(tradeQueueFanoutExchange);
    }
    
    @Bean
    FanoutExchange tradeInfoQueueFanoutExchange() {
        return new FanoutExchange(RabbitMQConstants.WEBSOCKET_TRADEINFO_FANOUT_EXCHANGE);
    }
    
    @Bean
    Binding bindingExchangeTradeInfoQueue(Queue tradeInfoQueue,FanoutExchange tradeInfoQueueFanoutExchange) {
        return BindingBuilder.bind(tradeInfoQueue).to(tradeInfoQueueFanoutExchange);
    }
    
    @Bean
    FanoutExchange infoNotificationQueueFanoutExchange() {
        return new FanoutExchange(RabbitMQConstants.WEBSOCKET_INFONOTIFICATION_FANOUT_EXCHANGE);
    }
    
    @Bean
    Binding bindingExchangeInfoNotificationQueue(Queue infoNotificationQueue,FanoutExchange infoNotificationQueueFanoutExchange) {
        return BindingBuilder.bind(infoNotificationQueue).to(infoNotificationQueueFanoutExchange);
    }

}
package com.nlx.appliaction.common.utils.mq.amqp.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.nlx.appliaction.common.utils.other.DisruptorConstants;
import com.nlx.appliaction.common.utils.resp.AjaxResult;

/**
 * 更新行情
 * 
 * 项目名称：tea-info-service 类名称：TradeQueueListener 类描述： MQ消息监听类 创建人：gaofeng
 * 创建时间：2018年3月30日 修改备注：
 * 
 * @version
 *
 */
@Component
@RabbitListener(queues = DisruptorConstants.TRADE_NOW_QUEUE_NAME)
public class TradeNowReceiver
{
    
    @RabbitHandler
    public void onTradeNowMessage(AjaxResult<String> tradeNow)
    {
    }
    
}

/**
 * Project Name:tea-common-utils
 * File Name:DisruptorConstants.java
 * Package Name:com.newlixon.common.utils
 * Date:2018年3月28日下午5:03:36
 * Copyright (c) 2018, All Rights Reserved.
 *
*/

package com.nlx.appliaction.common.utils.other;

/**
 * ClassName:DisruptorConstants <br/>
 * Function: 交易相关常量. <br/>
 * Date: 2018年3月28日 下午5:03:36 <br/>
 * 
 * @version
 * @since JDK 1.8
 * @see
 */
public class DisruptorConstants
{
    //大盘CODE
    public static final String TRADE_MARKET_CODE="000000";
    // 委托消息队列
    public static final String TRADE_DEPUTED_QUEUE_NAME = "TRADE_DEPUTED_QUEUE";

    // 分时线信息
    public static final String TRADE_DAY_LINE = "TRADE_DAY_LINE";

    // 商品挂牌信息队列
    public static final String TRADE_NOW_QUEUE_NAME = "TRADE_NOW_QUEUE_NAME";

    // 买单成交消息
    public static final String TRADE_RECORD_BUY_QUEUE_NAME = "TRADE_RECORD_BUY_QUEUE_NAME";

    // 卖单成交消息
    public static final String TRADE_RECORD_SELL_QUEUE_NAME = "TRADE_RECORD_SELL_QUEUE_NAME";

    // 商品挂牌消息
    public static final String TRADE_NOW_MESSAGE = "TRADE_NOW_MESSAGE";

    // 茶市交易时间当前开闭市
    public static final String TRADE_DEPUTED_TRADE_TIME_REDIS_STATUS = "TRADE_DEPUTED_TRADE_TIME_REDIS_STATUS";

    // 茶市交易开市状态
    public static final String TRADE_DEPUTED_TRADE_TIME_OPEN_STATUS = "1";

    // 挂牌已审核通过,未开始交易
    public static final String TRADE_GOODS_LISTING_STATUS_UNOPEN = "2";

    // 挂牌开始交易
    public static final String TRADE_GOODS_LISTING_STATUS_OPEN = "5";

    // 挂牌开始交易
    public static final String TRADE_GOODS_LISTING_STATUS_EXPIRE = "4";

    // 涨停百分比
    public static final Integer MAX_UP_PER = 10;

    // 跌停百分比
    public static final Integer MAX_DOWN_PER = 10;

    // 上市
    public static final String TRADE_NOW_STATUS_OPEN = "1";

    // 退市
    public static final String TRADE_NOW_STATUS_EXPIRE = "0";

    /**
     * ClassName: Message <br/>
     * Function: 交易信息消息. <br/>
     */
    public class Message
    {
        // 更新大盘所有信息
        public static final String TRADE_NOW_ALL_UPDATE = "TRADE_NOW_ALL_UPDATE";
    }

}

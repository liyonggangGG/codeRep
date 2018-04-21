package com.nlx.appliaction.common.utils.other;

/**
 * <p>
 * ****************************************************************************
 * </p>
 * <p>
 * <b>Copyright © 2010-2017 soho team All Rights Reserved<b>
 * </p>
 * <ul style="margin:15px;">
 * <li>Description : 系统常量</li>
 * <li>Version : 1.0</li>
 * <li>Creation : 2017年07月05日</li>
 * <li>Author : 杜超</li>
 * </ul>
 * <p>
 * ****************************************************************************
 * </p>
 */
public interface Constants
{

	
	public class Event
	{


	}
	
	public class Success 
	{
		public static final String DATA_SUCC = "0";
	}

	public class Error
	{

		// 用户不存在，或信息错误
		public static final String USER_NOT_EXIST = "0401";

		// 数据成功
		public static final String DATA_SUCCESS = "0200";

		// 服务器内部错误
		public static final String SERVER_ERROR = "0500";

		// 存在子集
		public static final String HAVE_SUBSET = "3001";

		// 存在人员
		public static final String HAVE_MEMBER = "3002";

		// 短信发送失败
		public static final String SMS_ERROR = "1001";

		// 手机号已经存在
		public static final String PHONE_EXIST = "2001";

		// 处理流程不存在
		public static final String PROCESS_NOT_EXIST = "2101";

		// 上报事件不存在
		public static final String REPORT_NOT_EXIST = "2106";

		// 事件已经关闭
		public static final String EVENT_PROESS_CLOSED = "2017";

		// 邮箱已经存在
		public static final String EMAIL_EXIST = "2002";

		// 身份证号已经存在
		public static final String IDNUMBER_EXIST = "2003";

		// 工作号已经存在
		public static final String FUZZENUMBER_EXIST = "2004";

		// 该机构名称已存在
		public static final String ORGNAME_EXIST = "2005";

		// 商铺营业执照号已经存在
		public static final String MERNUMBER_EXIST = "2006";

		public static final String ORG_WITHOUT_MEMBER = "2105";

		// 已经点过赞
		public static final String LIKE_ERROR = "4001";

		// 点赞保存积分错误
		public static final String LIKE_JF_ERROR = "4002";

		// 资讯已收藏
		public static final String NEWS_ALREADY_ERROR = "4003";

		// 资讯类型已订阅
		public static final String NEWS_TYPE_ALREADY_ERROR = "4004";

		// 取消点赞
		public static final String LIKE_CANCEL = "4005";

		// 参数错误
		public static final String PARAM_ERROR = "5000";

		public static final String FILE_TOO_MANY = "3101";

		/**
		 * 已在使用,无法删除
		 */
		public static final String ALREADY_IN_USE = "3201";

		public static final String STATUS_ERROR = "6001";

		public static final String QUESTION_ALREADY_ERROR = "7001";

		// 办事中心无法删除和禁用
		public static final String SERVICE_CENTER_CANT_OPERATE = "2012";

		// 审核中心无法删除和禁用
		public static final String AUDIT_CENTER_CANT_OPERATE = "2013";

		public static final String ALREADY_BE_MERCHANT = "3014";

		public static final String EVENTTYPE_NAME_EXIST = "3015";

		public static final String REGION_NAME_EXIST = "3016";

		/**
		 * 错误返回码：服务器内部错误
		 */
		public static final String ERR_CODE_500 = "500";

		/**
		 * 错误返回码：校验错误。
		 */
		public static final String ERR_CODE_100 = "100";

		/**
		 * 错误返回码：token失效
		 */
		public static final String ERR_CODE_401 = "401";
		/**
		 * 错误返回码：请求失效,逻辑错误
		 */
		public static final String ERR_CODE_400 = "400";
		
		/**
		 * 描述：未开户
		 */
		public static final String ACCOUNT_NOT_OPEN = "0701";
		    
		/**
		 * 描述：未绑定身份证号
		 */
		public static final String ACCOUNT_WITHOUT_IDCARD = "0702";
		
		/**
		 * 描述：未绑定银行卡
		 */
		public static final String ACCOUNT_WITHOUT_BANK = "0703";
		
		
		/**
		 * 商品已申请挂牌
		 */
		public static final String GOODS_ALREADY_APPLY = "1002";
		
		public static final String OVER_INCOME = "1010";
		
		public static final String ACCOUNT_NOT_EXSIST = "1011";
		
		/**
		 * 描述：商品不存在
		 */
		public static final String GOODS_NOT_EXISTS = "1003";
		/**
		 * 描述：资金不为0
		 */
		public static final String CAPITAL_NOT_ZERO="1004";
		/**
		 * 描述：持仓数不为0
		 */
		public static final String POSITION_NOT_ZERO="1005";
		/**
		 * 描述：用户已绑定银行卡
		 */
		public static final String USER_COUSTOMER="1006";
		/**
		 * 用户已经实名
		 */
		public static final String USER_REGISTRATION="1007";
		/**
		 * 手机号码或验证码或设备识别号为空！
		 */
		public static final String TELEPHONE_NULL="1008";
		/**
		 * 验证码获取失败，请重新获取！
		 */
		public static final String VERIFICATION_NULL="1009";
		/**
		 * "验证码不正确！
		 */
		public static final String VERIFICATION_ERROR="1020";
		/**
		 * 用户已开户！
		 */
		public static final String ACCOUNT_OPEND="1021";
		/**
		 * 请输入有效的身份证号！
		 */
		public static final String USER_CARD="1022";
		/**
		 * 请输入交易密码
		 */
		public static final String USE_PASSWORD="1023";
		/**
		 * 两次输入的密码不一致
		 */
		public static final String PASSWORD_TWO="1024";
		/**
		 * 银行卡号已被占用
		 */
		public static final String Account_TWO="1024";
	}
	//绑卡状态
    public class BankCard{
    	//绑定状态
    	public static final String BANK_BIND = "BIND";
    	//解绑状态
    	public static final String BANK_UNBAND = "UNBIND";
    }
	//绑卡限制字数模块
    public class AddBank{
    	//校验绑卡人姓名
    	public static final String BANK_LENTH = "1025";
    	//校验看户行字数状态
    	public static final String BANK_KAIHU = "1026";
    	//校验银行卡号状态
    	public static final String BANK_ACCOUNT = "1027";
    	//校验实名认证的姓名字数
    	public static final String REAL_NAME = "1028";
    	//校验交易密码长度的字数
    	public static final String PASS_LENTH = "1028";
    }
	
	
	
	
	public class Status // 商家状态
	{

	}
	public class Sms // 短信
	{
		public static final String CHECK_CODE = "短信验证码:#{CODE}，有效期15分钟，遵义茶叶交易中心及其员工绝不会向您索要验证码，请勿泄露。";
//		//短信类型注册、重置密码
//		public static final String TYPE_REG = "SMS_TYPE_REG";
//		public static final String TYPE_RESETPWD = "SMS_TYPE_RESETPWD";
		
	}

	/**
	 * 系统角色常量
	 * 
	 * @author Chen Xiaoxiao
	 * @date 2018年3月14日
	 */
	public class SysRole
	{
		//茶市买家角色
		public static final String R_TEA_MARKET_BUY = "R_TEA_MARKET_BUY";
		//茶市卖家角色
		public static final String R_TEA_MARKET_SELL = "R_TEA_MARKET_SELL";
		//茶城买家角色
		public static final String R_TEA_B2C_BUY = "R_TEA_B2C_BUY";
		//茶城卖家角色
		public static final String R_TEA_B2C_SELL = "R_TEA_B2C_SELL";
	}
	
	/**
	 * 系统来源
	 * 
	 * @author Chen Xiaoxiao
	 * @date 2018年4月3日
	 */
	public class SysNames
	{
		//茶市系统标识
		public static final String TEA_MARKET = "TEA_MARKET";
		//茶城系统标识 
		public static final String TEA_B2C = "TEA_B2C";
		//环境检测系统标识
		public static final String TEA_ENV = "TEA_ENV";
		//CMS后台
		public static final String TEA_CMS = "TEA_CMS";
		
	}
	
	/**
	 * 广告表常量信息
	 * 
	 * @author Chen Xiaoxiao
	 * @date 2018年3月16日
	 */
	public class MD5
	{
		public static final String MD5_KEY = "NLX@2008$888";
	}
	
    public class AuditType
    {
        /**
         * 用户注册审核
         */
        public static final String USER_REG_AUDIT = "USER_REG";

        /**
         * 描述：开户审核
         */
        public static final String OPEN_ACCOUNT_AUDIT = "OPEN_ACCOUNT";

        /**
         * 描述：公司上市
         */
        public static final String COM_LIST_AUDIT = "COM_LIST";

        /**
         * 描述：商品挂牌
         */
        public static final String GOODS_LIST_AUDIT = "GOODS_LIST";

        /**
         * 描述：取消银行绑定
         */
        public static final String CANCEL_BANK_AUDIT = "CANCEL_BANK";

        /**
         * 描述：交割审核
         */
        public static final String DELIVERY_GOODS_AUDIT = "DELIVERY_GOODS";
    }
    
    /**
     * 交易相关常量定义
     * 
     * @author Chen Xiaoxiao
     * @date 2018年3月24日
     */
    public class Trade {
    	//委托类型：申购
    	public static final String TRADE_DEPUTED_TYPE_PREBUY = "PREBUY";
    	//委托类型：个人卖出
    	public static final String TRADE_DEPUTED_TYPE_SELL = "SELL";
    	//委托类型：茶企卖出
    	public static final String TRADE_DEPUTED_TYPE_COMSELL = "COMSELL";
    	//委托类型：买入
    	public static final String TRADE_DEPUTED_TYPE_BUY = "BUY";
    	//委托状态：废单
    	public static final String TRADE_DEPUTED_STATUS_INVALID = "0";
    	//委托状态：挂单
    	public static final String TRADE_DEPUTED_STATUS_RESERVE = "1";
    	//委托状态：成交
    	public static final String TRADE_DEPUTED_STATUS_DEAL = "2";
    	//委托状态：撤销
    	public static final String TRADE_DEPUTED_STATUS_CANCEL = "3";
    	//委托状态：删除
    	public static final String TRADE_DEPUTED_STATUS_DELETE = "4";
    	//限制交易日期。
    	public static final int TRADE_LIMIT_DAYS = 5;
    	
    	//1分钟
    	public static final String TRADE_DAY_RECORD_TYPE_1MIN = "1min";
    	//5分钟
    	public static final String TRADE_DAY_RECORD_TYPE_5MIN = "5min";
    	//10分钟
    	public static final String TRADE_DAY_RECORD_TYPE_10MIN = "10min";
    	//15分钟
    	public static final String TRADE_DAY_RECORD_TYPE_15MIN = "15min";
    	//30分钟
    	public static final String TRADE_DAY_RECORD_TYPE_30MIN = "30min";
    	//1小时
    	public static final String TRADE_DAY_RECORD_TYPE_1HOUR = "1hour";
    	//12小时
    	public static final String TRADE_DAY_RECORD_TYPE_12HOUR = "12hour";
    	//1日
    	public static final String TRADE_DAY_RECORD_TYPE_1DAY = "1day";
    	//3日
    	public static final String TRADE_DAY_RECORD_TYPE_3DAY = "3day";
    	//1周
    	public static final String TRADE_DAY_RECORD_TYPE_1WEEK = "1week";
    	//1月
    	public static final String TRADE_DAY_RECORD_TYPE_1MONTH = "1month";
    	//半年
    	public static final String TRADE_DAY_RECORD_TYPE_6MONTH = "6month";
    	//1年
    	public static final String TRADE_DAY_RECORD_TYPE_1YEAR = "1year";
    	//10年
    	public static final String TRADE_DAY_RECORD_TYPE_10YEAR = "10year";
    	
    }
    
    /**
     * 
    *    
    * 项目名称：tea-common-utils   
    * 类名称：Screen   
    * 类描述：   大屏相关
    * 创建人：qi_baijian   
    * 创建时间：2018年4月4日 上午9:40:56   
    * 修改人：qi_baijian   
    * 修改时间：2018年4月4日 上午9:40:56   
    * 修改备注：   
    * @version    
    *
     */
    public class Screen{
    	
    	private Screen() {}
    	/**
    	 * 用于大屏监听WebSocket消息 注册鉴权
    	 */
    	public static final String WEB_SOCKET_TOKEN_PREFIX = "web_";
    }
    
    /**
     * 交割状态
     * @author Administrator
     *
     */
    public class Delivery{
    	/**
    	 * 无效
    	 */
    	public static final String TRADE_DELIVERY_STATUS_WX ="0";
    	/**
    	 * 申请
    	 */
    	public static final String TRADE_DELIVERY_STATUS_SQ = "1";
    	/**
    	 * 通过
    	 */
    	public static final String TRADE_DELIVERY_STATUS_TG = "2";
    	/**
    	 * 驳回
    	 */
    	public static final String TRADE_DELIVERY_STATUS_BH = "3";
    	/**
    	 * 删除
    	 */
    	public static final String TRADE_DELIVERY_STATUS_SC = "4";
    }
}

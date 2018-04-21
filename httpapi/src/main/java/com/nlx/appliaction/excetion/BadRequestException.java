package com.nlx.appliaction.excetion;

/**
 * 请求参数错误。
 * 
 * @author gaofeng
 * @date 2018年3月20日
 */
public class BadRequestException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BadRequestException() {
		super();
	}
	
	public BadRequestException(String mess) {
		super(mess);
	}
	
}

package com.nlx.appliaction.excetion;

/**
 * 参数校验异常类。
 * 
 * @author Chen Xiaoxiao
 * @date 2018年3月17日
 */
public class ValidateParaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValidateParaException() {
		super();
	}
	
	public ValidateParaException(String mess) {
		super(mess);
	}
	
}

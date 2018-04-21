package com.nlx.appliaction.common.utils.other;

import java.security.MessageDigest;

/**
 * MD5工具类
 * 
 * @author Chen Xiaoxiao
 * @date 2018年3月20日
 */
public class MD5Util {
	public static String md5(String source) {
		
		StringBuffer sb = new StringBuffer(32);
			
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] array = md.digest(source.getBytes("utf-8"));
			for (int i = 0; i < array.length; i++) {
				sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).toUpperCase().substring(1, 3));
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
			
		return sb.toString();
	}
}

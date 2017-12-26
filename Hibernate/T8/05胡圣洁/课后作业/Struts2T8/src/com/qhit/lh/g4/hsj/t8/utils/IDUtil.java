/**
 * 
 */
package com.qhit.lh.g4.hsj.t8.utils;

import java.util.UUID;

/**
 * @author 胡圣洁
 * TODO
 * 2017年12月8日下午10:19:20
 */
public class IDUtil {
	public static String getUUid(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}

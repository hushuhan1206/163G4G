/**
 * 
 */
package com.qhit.lh.g4.jer.sbm.utils;

import java.util.UUID;

/**
 * @author 偏晓阳
 * 2017年12月8日下午4:51:53
 * TODO
 */
public class IDUtil {
	
	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

}

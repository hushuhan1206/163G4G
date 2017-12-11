/**
 * 
 */
package com.qhit.lh.g4.xjl.struts2_sbm.utils;

import java.util.UUID;

/**
 * @author 许金来
 * 2017年11月17日
 */
public class IDUtil {
	
	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

}

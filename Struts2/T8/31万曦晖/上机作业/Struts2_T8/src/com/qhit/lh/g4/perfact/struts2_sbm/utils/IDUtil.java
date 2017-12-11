/**
 * 
 */
package com.qhit.lh.g4.perfact.struts2_sbm.utils;

import java.util.UUID;

/**
 * @author 万曦晖
 * 2017年11月17日
 */
public class IDUtil {
	
	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

}

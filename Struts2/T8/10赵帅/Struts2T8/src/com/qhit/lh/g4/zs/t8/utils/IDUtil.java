package com.qhit.lh.g4.zs.t8.utils;

import java.util.UUID;

public class IDUtil {

	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

}

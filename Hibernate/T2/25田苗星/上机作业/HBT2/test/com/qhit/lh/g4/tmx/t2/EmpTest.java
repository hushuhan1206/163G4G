package com.qhit.lh.g4.tmx.t2;
import org.junit.Test;

import com.qhit.lh.g4.tmx.t2.bean.Emp;
import com.qhit.lh.g4.tmx.t2.bean.UserInfo;
import com.qhit.lh.g4.tmx.t2.service.BaseService;
import com.qhit.lh.g4.tmx.t2.service.impl.BaseServiceImpl;

public class EmpTest {

	 private BaseService baseService = new BaseServiceImpl(); 

	private UserInfo userinfo;

	@Test
	public void add() {
		//基本信息录入
		Emp emp = new Emp();
		emp.setEname("李梦阳");
		emp.setEsex("M");
		emp.setBirthday("2011-02-07");
		emp.setEid(1);
		//分配账户信息
		UserInfo userInofo = new UserInfo();
		userInofo.setUname("lmy");
		userInofo.setUpwd("123456");
		//账户表和员工表是一对一关系
		emp.setUserinfo(userinfo);
		userinfo.setEmp(emp);
		//添加员工病分配账户
		baseService.add(emp);
		
		
	}

}

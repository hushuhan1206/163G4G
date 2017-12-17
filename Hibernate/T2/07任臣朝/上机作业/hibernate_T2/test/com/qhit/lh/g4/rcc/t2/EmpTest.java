package com.qhit.lh.g4.rcc.t2;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.rcc.t2.bean.Emp;
import com.qhit.lh.g4.rcc.t2.bean.UserInfo;
import com.qhit.lh.g4.rcc.t2.service.BaseService;
import com.qhit.lh.g4.rcc.t2.service.impl.BaseServiceImpl;

public class EmpTest {

	private BaseService baseService = new BaseServiceImpl();
	@Test
	public void add() {
		//录入信息
		Emp emp= new Emp();
		emp.setEmpName("爱上孤独");
		emp.setEmpName("M");
		emp.setBirthday("2017-12-14");
		emp.setDeptId(1);
		//分配账户信息
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("asgd");
		userInfo.setPassword("123456");
		//员工和账户一对一
		emp.setUserInfo(userInfo);
		userInfo.setEmp(emp);
		//添加员工分配账户
		baseService.add(emp);

	}
	public void delete() {
		Emp emp= new Emp();
		emp.setEid(2);

		UserInfo userInfo = new UserInfo();
		userInfo.setUserId(2);

		//员工和账户一对一
		emp.setUserInfo(userInfo);
		userInfo.setEmp(emp);

		baseService.delete(emp);
	}
	public void update() {

		Emp emp= new Emp();
		emp.setEid(3);
		emp.setEmpName("奴剑士");
		emp.setEmpName("M");
		emp.setBirthday("2017-12-14");
		emp.setDeptId(1);
		//分配账户信息
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId(3);
		userInfo.setUserName("njs");
		userInfo.setPassword("123456");
		//员工和账户一对一
		emp.setUserInfo(userInfo);
		userInfo.setEmp(emp);
		
		baseService.update(emp);
	}
	public void query() {
		List<Object> list = baseService.queryAll("from emp");
		for (Object object : list){
			Emp emp = (Emp) object;
			System.out.println(emp.toString());
		}

	}


}

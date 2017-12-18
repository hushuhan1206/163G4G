package com.qhit.lh.g4.hsj.t02;


import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.hsj.t02.bean.Emp;
import com.qhit.lh.g4.hsj.t02.bean.UserInfo;
import com.qhit.lh.g4.hsj.t02.service.BaseService;
import com.qhit.lh.g4.hsj.t02.service.impl.BaseServiceImpl;


public class EmpText {
	private BaseService baseService =new BaseServiceImpl();
	@Test
	public void add() {
		Emp emp = new Emp();
		//录入基本信息
		emp.setEmpName("张三");
		emp.setEmpSex("M");
		emp.setBirthday("2017-12-12");
		emp.setDeptId(1);
		//分配账户信息
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("zs");
		userInfo.setPassword("123456");
		//员工表和账户表是一对一关系
		emp.setUserInfo(userInfo);
		userInfo.setEmp(emp);
		//添加员工并分配账户
		baseService.add(emp);
	}

	@Test
	public void delete() {
		Emp emp = new Emp();
		emp.setEid(1);
		//员工表和账户表一对一应关系
		UserInfo userInfo = new UserInfo();
		userInfo.setEmp(emp);

		baseService.delete(emp);
	}
	@Test
	public void update() {
		//录入基本信息
		Emp emp = new Emp();
		emp.setEid(1);
		emp.setEmpName("李四");
		emp.setEmpSex("M");
		emp.setBirthday("2017-04-12");
		emp.setDeptId(1);
		//分配账户信息
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("ls");
		userInfo.setPassword("654321");
		//员工表和账户表是一对一关系
		emp.setUserInfo(userInfo);
		userInfo.setEmp(emp);
		baseService.update(emp);
	}
	@Test
	public void queryAll() {
		List<Object> list = baseService.queryAll("from emp");
		for (Object object : list) {
			Emp emp = (Emp) object;
			System.out.println(emp.toString());
		}
	}

}

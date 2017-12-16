package com.qhit.lh.g4.perfact.t02;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.g4.perfact.t02.bean.Emp;
import com.qhit.lh.g4.perfact.t02.bean.UserInfo;
import com.qhit.lh.g4.perfact.t02.service.BaseService;
import com.qhit.lh.g4.perfact.t02.service.impl.BaseServiceImpl;

public class EmpTest {
	private BaseService baseService = new BaseServiceImpl();
	public void add(){
		Emp emp = new Emp();
		emp.setEmpName("Alice");
		emp.setBrithday("2017-5-8");
		emp.setEmpSex("M");
		emp.setDeptid(1);
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUsername("alice");
		userInfo.setUserpwd("123456");
		
		emp.setUserInfo(userInfo);
		userInfo.setEmp(emp);
		baseService.add(emp);
	}
	public void delete(){
		Emp emp = new Emp();
		emp.setEid(3);
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId(3);
		emp.setUserInfo(userInfo);
		userInfo.setEmp(emp);
		baseService.delete(emp);
	}
	public void update(){
		Emp emp = new Emp();
		emp.setEmpName("Alinden");
		emp.setBrithday("2017-4-8");
		emp.setEmpSex("Y");
		emp.setDeptid(1);
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId(4);
		userInfo.setUsername("Alinden");
		userInfo.setUserpwd("123456");
		
		emp.setUserInfo(userInfo);
		userInfo.setEmp(emp);
	}
	public void query(){
		
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}

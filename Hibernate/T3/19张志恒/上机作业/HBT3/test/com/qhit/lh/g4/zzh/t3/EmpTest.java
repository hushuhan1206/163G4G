package com.qhit.lh.g4.zzh.t3;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.zzh.t3.bean.Emp;
import com.qhit.lh.g4.zzh.t3.bean.UserInfo;
import com.qhit.lh.g4.zzh.t3.service.BaseService;
import com.qhit.lh.g4.zzh.t3.service.impl.BaseServiceImpl;

public class EmpTest {
	private BaseService baseService = new BaseServiceImpl();
	@Test
	public void add(){
		Emp emp = new Emp();
		emp.setEname("张");
		emp.setSex("M");
		emp.setAge(12);
		emp.setDid(1);
		
		UserInfo userinfo = new UserInfo();
		userinfo.setUname("zhang");
		userinfo.setPassword("123456");
		
		userinfo.setEmp(emp);
		emp.setUserinfo(userinfo);
		
		baseService.add(emp);
		
	}
	
	@Test
	public void delete(){
		Emp emp = new Emp();
		emp.setEid(2);
		UserInfo userinfo = new UserInfo();
		userinfo.setUid(2);
		userinfo.setEmp(emp);
		emp.setUserinfo(userinfo);
		baseService.delete(emp);
	}
	
	@Test
	public void update(){
		Emp emp = new Emp();
		emp.setEid(3);
		emp.setEname("timi");
		emp.setSex("f");
		emp.setAge(12);
		
		UserInfo userinfo = new UserInfo();
		userinfo.setUid(3);
		userinfo.setUname("timi");
		userinfo.setPassword("123456");
		
		userinfo.setEmp(emp);
		emp.setUserinfo(userinfo);
		
		baseService.update(emp);
	}
	
	@Test
	public void query(){
		List<Object> emps = baseService.queryAll("from Emp");
		for (Object object : emps) {
			Emp emp = (Emp) object;
			System.out.println(emp.toString());
		}
	}
}

package com.qhit.lh.g4.xm.t2.test;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.xm.t2.bean.Emp;
import com.qhit.lh.g4.xm.t2.bean.UserInfo;
import com.qhit.lh.g4.xm.t2.service.BaseService;
import com.qhit.lh.g4.xm.t2.service.impl.BaseServiceImpl;

public class EmpTest {
	private BaseService baseService = new BaseServiceImpl();
	//增
	@Test
	public void add(){
		//添加emp员工信息
		Emp emp = new Emp();
		emp.setEname("tom");
		emp.setSex("男");
		emp.setAge(20);
		//分配账户和密码
		UserInfo userInfo = new UserInfo();
		userInfo.setUname("t123");
		userInfo.setPassword("123456");
		//一对一关系
		emp.setUserInfo(userInfo);
		userInfo.setEmp(emp);
		
		baseService.add(emp);
	};
	//删
	public void delete(){
		Emp emp = new Emp();
		emp.setEid(1);
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUid(1);
		
		emp.setUserInfo(userInfo);
		userInfo.setEmp(emp);
		baseService.delete(emp);
	};
	//改
	public void update(){
		Emp emp = new Emp();
		emp.setEid(1);
		emp.setEname("jack");
		emp.setSex("男");
		emp.setAge(20);
		//分配账户和密码
		UserInfo userInfo = new UserInfo();
		userInfo.setUid(1);
		userInfo.setUname("j123");
		userInfo.setPassword("123456");
		//一对一关系
		emp.setUserInfo(userInfo);
		userInfo.setEmp(emp);
		
		baseService.update(emp);
	};
	//查
	public void query(){
		List<Object> list = baseService.queryAll("from Emp");
		for (Object object : list) {
			Emp emp = (Emp) object;
			System.out.println(emp.toString());
		}
	};
}

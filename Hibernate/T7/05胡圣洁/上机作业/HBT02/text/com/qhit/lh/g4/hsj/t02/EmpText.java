package com.qhit.lh.g4.hsj.t02;


import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.hsj.t02.bean.Dept;
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
		//分配到某个部门
	    Dept dept = (Dept) baseService.getObjectById(Dept.class, 1);
	    emp.setDept(dept);
		//添加员工并分配账户
		baseService.add(emp);
	}

	@Test
	public void delete() {
		Emp emp = (Emp) baseService.getObjectById(Emp.class,3);
		baseService.delete(emp);
	}
	@Test
	public void update() {
		Emp emp1 = (Emp) baseService.getObjectById(Emp.class,3);
		Emp emp2 = (Emp) baseService.getObjectById(Emp.class,3);
		
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 3);
		
		emp1.setDept(dept);
		emp2.setDept(dept);
		baseService.update(emp1);
		baseService.update(emp2);
	}
	@Test
	public void queryAll() {
		List<Object> list = baseService.queryAll("from emp");
		for (Object object : list) {
			Emp emp = (Emp) object;
			System.out.println(emp.toString());
		}
	}
	@Test
	public void getEmpByName(){
		List<Emp> result = baseService.getEmpByName("李%");
		
		for (Emp emp : result) {
			System.out.println(emp.getEid()+":"+emp.getEmpName());
		}
	}

}

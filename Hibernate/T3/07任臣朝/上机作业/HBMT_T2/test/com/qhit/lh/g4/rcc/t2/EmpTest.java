package com.qhit.lh.g4.rcc.t2;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.rcc.t2.bean.Dept;
import com.qhit.lh.g4.rcc.t2.bean.Emp;
import com.qhit.lh.g4.rcc.t2.bean.UserInfo;
import com.qhit.lh.g4.rcc.t2.service.BaseService;
import com.qhit.lh.g4.rcc.t2.service.impl.BaseServiceImpl;

public class EmpTest {

	private BaseService baseService = new BaseServiceImpl();
	private Dept BaseService;
	@Test
	public void add() {
		//录入信息
		Emp emp= new Emp();
		emp.setEmpName("爱上孤独");
		emp.setEmpName("M");
		emp.setBirthday("2017-12-14");
		//分配账户信息
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("asgd");
		userInfo.setPassword("123456");
		//员工和账户一对一
		emp.setUserInfo(userInfo);
		userInfo.setEmp(emp);
		//分配到某个部门
		Dept dept = (Dept) baseService.getObjectById(Dept.class,1);
		//员工多对一关联
		emp.setDept(dept);
		//操作
		baseService.add(emp);


	}
	public void delete() {
		Emp emp = (Emp) baseService.getObjectById(Emp.class,3);
		baseService.delete(emp);
	}
	public void update() {

		Emp emp = (Emp) baseService.getObjectById(Emp.class,4);
		emp.setEmpName("奴剑士");
		//当前员工所属部门
		Dept dept = (Dept) baseService.getObjectById(Dept.class,3);
		emp.setDept(dept);
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

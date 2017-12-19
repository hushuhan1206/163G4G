package com.qhit.lh.g4.djh.t2;


import org.junit.Test;

import com.qhit.lh.g4.djh.t2.bean.Dept;
import com.qhit.lh.g4.djh.t2.bean.Emp;
import com.qhit.lh.g4.djh.t2.bean.Userinfo;
import com.qhit.lh.g4.djh.t2.service.BaseService;
import com.qhit.lh.g4.djh.t2.service.impl.BaseServiceImpl;

public class DeptTest {
	private BaseService baseService = new BaseServiceImpl();
	@Test
	public void add() {
		//添加部门
		Dept dept = new Dept();
		dept.setDname("技术部");
		dept.setDaddress("清华IT");
		//调员工去新部门
		Emp emp1 = (Emp) baseService.getObjectById(Emp.class, 1);
		dept.getEmps().add(emp1);
		//添加新员工到新部门
		Emp emp2 = new Emp();
		emp2.setEname("赵六");
		emp2.setSex("男");
		emp2.setBirth("2000-2-2");
		//为新员工分配账户
		Userinfo userinfo = new Userinfo();
		userinfo.setUname("zl");
		userinfo.setUpswd("123123");
		//添加关联
		emp2.setUserinfo(userinfo);
		userinfo.setEmp(emp2);
		
		emp1.setDept(dept);
		emp2.setDept(dept);
		
		dept.getEmps().add(emp2);
		
		baseService.add(dept);
	}
	@Test
	public void delete() {
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 2);
		
		baseService.delete(dept);
	}
	@Test
	public void update() {
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 1);
		
		dept.setDaddress("南海");
		baseService.update(dept);
	}
	@Test
	public void query() {
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 2);
		for(Emp emp : dept.getEmps()){
			System.out.println(dept.getDname()+":"+emp.getEname());
		}
	}

}

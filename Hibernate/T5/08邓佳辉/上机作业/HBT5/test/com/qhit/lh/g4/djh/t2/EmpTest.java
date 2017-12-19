package com.qhit.lh.g4.djh.t2;

import java.util.List;
import org.junit.Test;
import com.qhit.lh.g4.djh.t2.bean.Dept;
import com.qhit.lh.g4.djh.t2.bean.Emp;
import com.qhit.lh.g4.djh.t2.bean.Userinfo;
import com.qhit.lh.g4.djh.t2.service.BaseService;
import com.qhit.lh.g4.djh.t2.service.impl.BaseServiceImpl;

public class EmpTest {
	private BaseService baseService = new BaseServiceImpl();

	@Test
	public void add() {
		
		Emp emp = new Emp();
		emp.setEname("张三");
		emp.setSex("男");
		emp.setBirth("1999-2-22");
		emp.setDeptid(new Integer(1));

		Userinfo userinfo = new Userinfo();
		userinfo.setUname("zhangsan");
		userinfo.setUpswd("123456");
		
		userinfo.setEmp(emp);
		emp.setUserinfo(userinfo);
		
		Dept dept = new Dept();
		dept = (Dept) baseService.getObjectById(Dept.class, 1);
		
		emp.setDept(dept);

		baseService.add(emp);

	}

	@Test
	public void update() {
		Emp emp = (Emp) baseService.getObjectById(Emp.class, 1);
		emp.setEname("王五");
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 2);
		emp.setDept(dept);
		baseService.update(emp);

	}

	@Test
	public void delete() {
		Emp emp = (Emp) baseService.getObjectById(Emp.class, 1);
		baseService.delete(emp);
	}
	
	@Test
	public void queryAll(){
		List<Object> emps = baseService.queryAll("from Emp");
		for (Object object : emps) {
			Emp emp= (Emp) object;
			System.out.println(emp.toString());
		}
	}
}

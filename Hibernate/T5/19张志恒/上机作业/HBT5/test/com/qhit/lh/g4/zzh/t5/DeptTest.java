package com.qhit.lh.g4.zzh.t5;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.zzh.t5.bean.Dept;
import com.qhit.lh.g4.zzh.t5.bean.Emp;
import com.qhit.lh.g4.zzh.t5.bean.UserInfo;
import com.qhit.lh.g4.zzh.t5.service.BaseService;
import com.qhit.lh.g4.zzh.t5.service.impl.BaseServiceImpl;

public class DeptTest {
	private BaseService baseService = new BaseServiceImpl();
	@Test
	public void add(){
		Emp emp = new Emp();
		Dept dept = new Dept();
		//老员工
		Emp emp2 = (Emp) baseService.getObjectById(Emp.class, 1);
		dept.getEmps().add(emp2);
		//招聘新员工
		emp.setEname("张");
		emp.setSex("M");
		emp.setAge(12);
		emp.setDid(1);
		//分配账户
		UserInfo userinfo = new UserInfo();
		userinfo.setUname("zhang");
		userinfo.setPassword("123456");
		//1-1关联
		userinfo.setEmp(emp);
		emp.setUserinfo(userinfo);
		//n-1关联
		emp.setDept(dept);
		//1-n关联
		dept.getEmps().add(emp);
		baseService.add(dept);

	}

	@Test
	public void delete(){
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 2);

		baseService.delete(dept);
	}

	@Test
	public void update(){
Dept dept = (Dept) baseService.getObjectById(Dept.class, 1);
		dept.setAddress("南海");
		baseService.update(dept);
	}

	@Test
	public void query(){
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 2);
		for(Emp emp : dept.getEmps()){
			System.out.println(dept.getDname()+":"+emp.getEname());
		}
	}
}

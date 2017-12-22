package com.qhit.lh.g4.chen.t7;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.chen.t7.bean.Dept;
import com.qhit.lh.g4.chen.t7.bean.Emp;
import com.qhit.lh.g4.chen.t7.bean.UserInfo;
import com.qhit.lh.g4.chen.t7.service.BaseService;
import com.qhit.lh.g4.chen.t7.service.impl.BaseServiceImpl;


public class EmpTest {
	private BaseService baseService = new BaseServiceImpl();
	
	@Test
	public void add(){
		Emp emp = new Emp();
		emp.setEname("张三");
		emp.setSex("m");
		emp.setBirthday("2001-1-14");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUname("zs");
		userInfo.setPassword("123456");

		emp.setUserinfo(userInfo);
		userInfo.setEmp(emp);
		
		Dept dept = (Dept) baseService.getObjectById(dept class, 1);
		emp.setDept(dept);
		baseService.add(emp);
}

	
	@Test
	public void delete(){
		Emp emp = (Emp) baseService.getObjectById(Emp class, 14);
		baseService.delete(emp);
	}

	
	@Test
	public void update(){
		Emp emp = (Emp) baseService.getObjectById(Emp class, 15);
		emp.setEname("张三");
		Dept dept = (Dept) baseService.getObjectById(Emp class, 4);
		emp.setDept(dept);
		baseService.update(emp);
	}

	@Test
	public void query(){
			List<Object> list = baseService.queryAll("from Emp");
			for(Object object : list){
				Emp emp = (Emp) object;
				System.out.println(emp.toString());
			}
	}

	@Test
	public void getEmpByName(){
			List<Emp> result = baseService.getEmpByName();
			for(Emp emp : result){
				System.out.println(emp.getEid()+":"+emp.getEname());
			}
	}
	
	
}

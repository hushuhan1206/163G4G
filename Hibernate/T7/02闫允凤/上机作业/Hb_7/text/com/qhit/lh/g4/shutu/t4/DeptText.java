package com.qhit.lh.g4.shutu.t4;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.g4.shutu.t4.been.Dept;
import com.qhit.lh.g4.shutu.t4.been.Emp;
import com.qhit.lh.g4.shutu.t4.been.UserInfo;
import com.qhit.lh.g4.shutu.t4.service.BaseService;
import com.qhit.lh.g4.shutu.t4.service.impl.BaseServiceImpl;

public class DeptText {
	private BaseService baseService =new BaseServiceImpl();
	
	@Test
	public void add() {
		//新建部门
		Dept dept = new Dept();
		dept.setDeptName("前尘");
		dept.setDeptAdress("后市");
		//有员工，从老员工调
		Emp emp1 = (Emp) baseService.getObjectById(Emp.class,3);
		dept.getEmps().add(emp1);
		//有员工，招聘新员工
		Emp emp2 = new Emp();
		//录入基本信息
		emp2.setEmpName("haha");
		emp2.setEmpSex("m");
		emp2.setBirthday("2017-12-15");
		//分配账户
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("ll");
		userInfo.setPassword("123456");
		//关联
		emp1.setUserInfo(userInfo);
		userInfo.setEmp(emp1);
		
		
		dept.getEmps().add(emp2);
		//n-1关联 交给多方进行维护 （inverse='true'）
		
		emp2.setDept(dept);
		//n-1关联 交给多方进行维护 （inverse='true'）
		
		baseService.add(dept);
	}
	
	@Test
	public void delete() {
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 6);
		baseService.delete(dept);
	}
	
	@Test
	public void update() {
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 3);
		dept.setDeptAdress("中国cnl");
		baseService.update(dept);
	}
	
	@Test
	public void query() {
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 3);
		for (Emp emp : dept.getEmps()) {
			System.out.println(dept.getDeptName()+":"+emp.getEmpName());
		}
	}

}

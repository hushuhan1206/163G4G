package com.qhit.lh.g4.wcx.t7;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.g4.wcx.t7.bean.Dept;
import com.qhit.lh.g4.wcx.t7.bean.Emp;
import com.qhit.lh.g4.wcx.t7.bean.UserInfo;
import com.qhit.lh.g4.wcx.t7.service.BaseService;
import com.qhit.lh.g4.wcx.t7.service.impl.BaseServiceImpl;

public class DeptText {
	private BaseService baseService =new BaseServiceImpl();
	
	@Test
	public void add() {
		//新建部门
		Dept dept = new Dept();
		dept.setDeptName("王五");
		dept.setDeptAdress("北京");
		//有员工，从老员工调
		Emp emp1 = (Emp) baseService.getObjectById(Emp.class,3);
		dept.getEmps().add(emp1);
		//有员工，招聘新员工
		Emp emp2 = new Emp();
		//录入基本信息
		emp2.setEmpName("一一");
		emp2.setEmpSex("F");
		emp2.setBirthday("2017-12-15");
		//分配账户
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("ll");
		userInfo.setPassword("123456");
		//关联
		emp1.setUserInfo(userInfo);
		userInfo.setEmp(emp1);
		
		emp2.setDept(dept);
		dept.getEmps().add(emp2);
		
		emp2.setDept(dept);
		
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
		dept.setDeptAdress("东南");
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

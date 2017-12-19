package com.qhit.lh.g4.jer.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.g4.jer.t5.bean.Dpt;
import com.qhit.lh.g4.jer.t5.bean.Emp;
import com.qhit.lh.g4.jer.t5.bean.UserInfo;
import com.qhit.lh.g4.jer.t5.service.UserService;
import com.qhit.lh.g4.jer.t5.service.impl.UserServiceImpl;

/**
 * @author 偏晓阳
 * 2017年12月19日上午11:09:16
 * TODO
 */
public class Dpt_Test {
	
	private UserService userService = new UserServiceImpl();
	
	@Test
	//增
	public void add() {
		//新建部门
		Dpt dpt = new Dpt();
		dpt.setDname("外交部");
		dpt.setDadd("北京");
		//没有员工
		
		//有员工：1.从老员工去调
		Emp emp1 = (Emp) userService.getObjectById(Emp.class, 5);
		dpt.getEmps().add(emp1);
		//有员工：2.招聘新员工
		Emp emp2 = new Emp();
		emp2.setEmpName("老干妈");
		emp2.setEmpSex(1);
		emp2.setBirthday("2017-12-16");
		//新员工分配账户
		UserInfo user = new UserInfo();
		user.setUserName("lgm");
		user.setPwd("123456");
		//1-1关联
		emp2.setUserInfo(user);
		user.setEmp(emp2);
		//n-1关联,交给多方进行外键维护（inverse="true"）
		emp2.setDpt(dpt);
		//1-n关联,交给一方进行外键维护（inverse="false"）
		dpt.getEmps().add(emp2);
	}
	
	@Test
	//删
	public void delete() {
		Dpt dpt = (Dpt) userService.getObjectById(Dpt.class, 4);
		userService.delete(dpt);
	}
	
	@Test
	//改
	public void update() {
		Dpt dpt = (Dpt) userService.getObjectById(Dpt.class, 8);
		dpt.setDadd("中国韩国村");
		userService.update(dpt);
	}
	
	@Test
	//查
	public void query() {
		Dpt dpt = (Dpt) userService.getObjectById(Dpt.class, 8);
		for (Emp emp : dpt.getEmps()) {
			System.out.println(dpt.getDname()+ ":" + emp.getEmpName());
		}
	}

}

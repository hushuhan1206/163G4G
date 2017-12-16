package com.qhit.lh.g4.jer.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.jer.t4.bean.Dpt;
import com.qhit.lh.g4.jer.t4.bean.Emp;
import com.qhit.lh.g4.jer.t4.bean.UserInfo;
import com.qhit.lh.g4.jer.t4.service.UserService;
import com.qhit.lh.g4.jer.t4.service.impl.UserServiceImpl;

/**
 * @author 偏晓阳
 * 2017年12月13日下午5:26:24
 * TODO
 */
public class EmpTest {
	
	private UserService userService = new UserServiceImpl();
	@Test
	public void add() {
		Emp emp = new Emp();
		emp.setEmpName("二狗子");
		emp.setEmpSex(0);
		emp.setBirthday("2017-12-13");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("egz");
		userInfo.setPwd("123456");
		
		emp.setUserInfo(userInfo);
		userInfo.setEmp(emp);
		
		Dpt dpt = (Dpt) userService.getObjectById(Emp.class, 2);
		emp.setDpt(dpt);
		
		userService.add(emp);
		
	}
	
	public void update() {
		Emp emp = (Emp) userService.getObjectById(Emp.class, 3);
		emp.setEmpName("李狗蛋");
		
		Dpt dpt = (Dpt) userService.getObjectById(Dpt.class, 2);
		emp.setDpt(dpt);
		userService.update(emp);
	}
	
	public void delete() {
		
		Emp emp = (Emp) userService.getObjectById(Emp.class, 1);
		userService.delete(emp);
	}
	
	public void query() {
		List<Object> list = userService.queryAll("form Emp");
		for(Object object: list){
				Emp emp = (Emp) object;
				System.out.println(emp.toString());
		}
	}

}

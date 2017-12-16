package com.qhit.lh.g4.chx.text;

import java.util.List;

import com.qhit.lh.g4.chx.t2.bean.Emp;
import com.qhit.lh.g4.chx.t2.bean.UserInfo;
import com.qhit.lh.g4.chx.t2.service.UserService;
import com.qhit.lh.g4.chx.t2.service.impl.UserServiceImpl;

/**
 * @author chx
 * TODO
 * 2017年12月12日下午5:04:29
 */
public class UserText {
	private UserService userService = new UserServiceImpl();
	public void add(){
		Emp emp = new Emp();
		emp.setEmpName("张三");
		emp.setEmpSex(0);
		emp.setBirthday("2017-12-12");
//		分配账户信息
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("egz");
		userInfo.setPassword("123456");
		emp.setUserInfo(userInfo);
		userInfo.setEmp(emp);
		userService.add(emp);
	}
	
	public void delete(){
		Emp emp = new Emp();
		emp.setEid(1);
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId(1);
		
		emp.setUserInfo(userInfo);
		userInfo.setEmp(emp);
		userService.delete(emp);
	}
	
	public void query(){
		List<Object> list = userService.queryAll("fromStr");
		for (Object object : list) {
			Emp emp = (Emp)object;
			System.out.println(emp.toString());
		}
	}
	
	public void update(){
		Emp emp = new Emp();
		emp.setEid(1);
		emp.setEmpName("李四");
		emp.setEmpSex(1);
		emp.setBirthday("2017-12-12");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId(1);
		userInfo.setUserName("lgd");
		userInfo.setPassword("123456");
		
		emp.setUserInfo(userInfo);
		userInfo.setEmp(emp);
		
		userService.update(emp);
	}
}

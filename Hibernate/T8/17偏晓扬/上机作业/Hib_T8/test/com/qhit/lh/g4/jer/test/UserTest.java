package com.qhit.lh.g4.jer.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.jer.t8.bean.UserInfo;
import com.qhit.lh.g4.jer.t8.service.UserService;
import com.qhit.lh.g4.jer.t8.service.impl.UserServiceImpl;

public class UserTest {
	
	private UserService userService = new UserServiceImpl();
	@Test
	public void login() {
		UserInfo user = new UserInfo();
		user.setUserName("egz");
		user.setPwd("123456");
		
		List<UserInfo> users = userService.login(user);
		
		if(users != null && users.size() > 0){
			System.out.println("成功");
		}else {
			System.out.println("失败");
		}
	}

}

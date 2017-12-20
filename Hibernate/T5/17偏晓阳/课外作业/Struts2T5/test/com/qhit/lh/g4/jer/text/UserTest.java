package com.qhit.lh.g4.jer.text;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.g4.jer.t5.bean.User;
import com.qhit.lh.g4.jer.t5.service.UserService;
import com.qhit.lh.g4.jer.t5.service.impl.UserServiceImpl;

/**
 * @author 偏晓阳
 * 2017年12月19日下午3:32:39
 * TODO
 */
public class UserTest {
	private UserService userService = new UserServiceImpl();
	@Test
	public void add() {
		User user = new User();
		user.setName("二狗子");
		user.setSex(1);
		user.setBirthday("2017-12-19");
		user.setPassword("123456");
		userService.addUser(user);
	}

}

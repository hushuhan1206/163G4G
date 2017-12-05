package com.jer.ssm.user.service.impl;

import com.jer.ssm.user.service.UserService;
import com.jer.ssm.user.bean.User;
import com.jer.ssm.user.dao.impl.UserDaoImpl;

public class UserServiceImpl implements UserService{
	@Override
	public User doLogin(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return new UserDaoImpl().doLogin(userName, userPassword);
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return new UserDaoImpl().addUser(user);
	}

}

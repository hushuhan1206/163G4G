package com.zhy.T4.service.impl;

import com.zhy.T4.bean.User;
import com.zhy.T4.dao.impl.UserDaoImpl;
import com.zhy.T4.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public int add(User user) {
		// TODO Auto-generated method stub
		return new UserDaoImpl().add(user);
	}

}

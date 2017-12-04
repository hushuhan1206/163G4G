package com.fjl.t04.service.impl;

import com.fjl.t04.bean.User;
import com.fjl.t04.dao.impl.UserDaoImpl;
import com.fjl.t04.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public int add(User user) {
		// TODO Auto-generated method stub
		return new UserDaoImpl().add(user);
	}

}

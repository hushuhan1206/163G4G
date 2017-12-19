package com.qhit.lh.g4.syw.t4.service.impl;

import com.qhit.lh.g4.syw.t4.bean.User;
import com.qhit.lh.g4.syw.t4.dao.impl.UserDaoImpl;
import com.qhit.lh.g4.syw.t4.service.UserService;

public class UserServiceImpl implements UserService {

	public int add1(User user) {
		// TODO Auto-generated method stub
		return new UserDaoImpl().add(user);
	}

	@Override
	public int add(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}

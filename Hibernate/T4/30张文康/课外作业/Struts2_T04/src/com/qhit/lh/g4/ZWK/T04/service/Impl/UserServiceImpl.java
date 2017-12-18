package com.qhit.lh.g4.ZWK.T04.service.Impl;

import com.qhit.lh.g4.ZWK.T04.bean.User;
import com.qhit.lh.g4.ZWK.T04.dao.Impl.UserDaoImpl;
import com.qhit.lh.g4.ZWK.T04.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return new UserDaoImpl().addUser(user);
	}

}

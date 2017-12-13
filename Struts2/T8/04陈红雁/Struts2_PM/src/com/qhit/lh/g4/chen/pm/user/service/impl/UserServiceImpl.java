package com.qhit.lh.g4.chen.pm.user.service.impl;

import com.qhit.lh.g4.chen.pm.user.bean.User;
import com.qhit.lh.g4.chen.pm.user.dao.impl.UserDaoImpl;


/**
 * @author 陈红雁
 * 2017年12月8日下午5:32:11
 *TODO
 */
public class UserServiceImpl {
	
	public User doLogin(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return new UserDaoImpl().doLogin(userName, userPassword);
	}

	public int addUser(User user) {
		// TODO Auto-generated method stub
		return new UserDaoImpl().addUser(user);
	}

}

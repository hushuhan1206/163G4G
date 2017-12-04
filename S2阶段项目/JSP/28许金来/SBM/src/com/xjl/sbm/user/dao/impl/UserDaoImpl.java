package com.xjl.sbm.user.dao.impl;
import com.xjl.sbm.user.bean.User;
import com.xjl.sbm.user.dao.UserDao;

public class UserDaoImpl implements UserDao {

	@Override
	public User doLogin(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return new UserDaoImpl().doLogin(userName, userPassword);
	}

}

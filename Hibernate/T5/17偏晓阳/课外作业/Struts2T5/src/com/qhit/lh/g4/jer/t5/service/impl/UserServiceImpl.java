package com.qhit.lh.g4.jer.t5.service.impl;

import java.util.List;

import com.qhit.lh.g4.jer.t5.bean.User;
import com.qhit.lh.g4.jer.t5.dao.UserDao;
import com.qhit.lh.g4.jer.t5.dao.impl.UserDaoImpl;
import com.qhit.lh.g4.jer.t5.service.UserService;

public class UserServiceImpl implements UserService {
	private  UserDao userDao = new UserDaoImpl();
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.updateUser(user);
	}

	@Override
	public void deleteUser(int uid) {
		// TODO Auto-generated method stub
	    userDao.deleteUser(uid);
	}

	@Override
	public List<User> queryAllUser(String fromStr) {
		// TODO Auto-generated method stub
		return userDao.queryAllUser(fromStr);
	}

}

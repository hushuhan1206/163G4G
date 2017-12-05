package com.hsj.t05.service.impl;

import java.util.List;

import com.hsj.t05.bean.User;
import com.hsj.t05.dao.impl.UserDaoImpl;
import com.hsj.t05.service.UserService;

public class UserServiceImpl implements UserService {

	private  UserDaoImpl userDaoImpl =new UserDaoImpl();
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDaoImpl.addUser(user);
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userDaoImpl.updateUser(user);
	}

	@Override
	public int deleteUser(int uid) {
		// TODO Auto-generated method stub
		return userDaoImpl.deleteUser(uid);
	}

	@Override
	public List<User> queryAllUser() {
		// TODO Auto-generated method stub
		return userDaoImpl.queryAllUser();
	}

	@Override
	public User querySingleUser(int uid) {
		// TODO Auto-generated method stub
		return userDaoImpl.querySingleUser(uid);
	}

}

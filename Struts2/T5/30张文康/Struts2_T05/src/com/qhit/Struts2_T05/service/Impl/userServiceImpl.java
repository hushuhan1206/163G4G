package com.qhit.Struts2_T05.service.Impl;

import java.util.List;

import com.qhit.Struts2_T05.bean.User;
import com.qhit.Struts2_T05.dao.Impl.userDaoImpl;
import com.qhit.Struts2_T05.service.userService;

public class userServiceImpl implements userService {

	@Override
	public List getAlls(User user) {
		// TODO Auto-generated method stub
		return new userDaoImpl().getAlls(user);
	}

	@Override
	public int delete(int uid) {
		// TODO Auto-generated method stub
		return new userDaoImpl().delete(uid);
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return new userDaoImpl().addUser(user);
	}

	@Override
	public User getUser(int uid) {
		// TODO Auto-generated method stub
		return new userDaoImpl().getUser(uid);
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return new userDaoImpl().update(user);
	}

	@Override
	public List All() {
		// TODO Auto-generated method stub
		return new userDaoImpl().All();
	}

}

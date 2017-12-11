package com.qhit.lh.g4.ZWK.T01.service.Impl;

import java.util.List;

import com.qhit.lh.g4.ZWK.T01.bean.User;
import com.qhit.lh.g4.ZWK.T01.dao.impl.UserDaoImpl;
import com.qhit.lh.g4.ZWK.T01.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDaoImpl udi = new UserDaoImpl();
	
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		udi.add(obj);
	}

	@Override
	public void delete(Object arg0) {
		// TODO Auto-generated method stub
		udi.delete(arg0);
	}

	@Override
	public User getUser( int id) {
		// TODO Auto-generated method stub
		return udi.getUser(id);
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		udi.update(obj);
	}

	@Override
	public List<Object> getList(String str) {
		// TODO Auto-generated method stub
		return udi.getList(str);
	}

	
}

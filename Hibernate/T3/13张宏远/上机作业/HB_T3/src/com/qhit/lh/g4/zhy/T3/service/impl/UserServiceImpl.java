package com.qhit.lh.g4.zhy.T3.service.impl;

import java.util.List;

import com.qhit.lh.g4.zhy.T3.dao.UserDao;
import com.qhit.lh.g4.zhy.T3.dao.impl.UserDaoImpl;
import com.qhit.lh.g4.zhy.T3.service.UserService;


/**
 * @author 张宏远
 * 2017年12月13日下午9:25:56
 * TODO
 */
public class UserServiceImpl implements UserService{
	private UserDao userDao = new UserDaoImpl();

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		userDao.add(obj);
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		userDao.update(obj);
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		userDao.delete(obj);
	}

	@Override
	public List<Object> queryAll(String fromStr) {
		// TODO Auto-generated method stub
		return userDao.queryAll(fromStr);
	}

	@Override
	public Object getObjectById(Class clazz, int id) {
		// TODO Auto-generated method stub
		return userDao.getObjectById(clazz, id);
	}
	
}

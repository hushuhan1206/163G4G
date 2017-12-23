package com.qhit.lh.g4.jer.t8.service.impl;

import java.util.List;

import com.qhit.lh.g4.jer.t8.bean.Emp;
import com.qhit.lh.g4.jer.t8.bean.UserInfo;
import com.qhit.lh.g4.jer.t8.dao.UserDao;
import com.qhit.lh.g4.jer.t8.dao.impl.UserDaoImpl;
import com.qhit.lh.g4.jer.t8.service.UserService;

/**
 * @author 偏晓阳
 * 2017年12月20日下午5:14:13
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

	@Override
	public List<Emp> getEmpByName(String name) {
		// TODO Auto-generated method stub
		return userDao.getEmpByName(name);
	}

	@Override
	public List<UserInfo> login(UserInfo user) {
		// TODO Auto-generated method stub
		return (List<UserInfo>) userDao.login(user);
	}
	
}

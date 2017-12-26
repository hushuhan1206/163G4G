package com.qhit.lh.g4.hsj.t05.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.hsj.t05.dao.BaseDao;
import com.qhit.lh.g4.hsj.t05.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.hsj.t05.service.BaseService;
import com.qhit.lh.g4.hsj.t05.utils.HibernateSessionFactory;

public class BaseServiceImpl implements BaseService {

	private BaseDao baseDao = new BaseDaoImpl();

	@Override
	public void addUser(Object obj) {
		// TODO Auto-generated method stub
		baseDao.addUser(obj);
	}

	@Override
	public void deleteUser(Object obj) {
		// TODO Auto-generated method stub
		baseDao.deleteUser(obj);
	}

	@Override
	public void updateUser(Object obj) {
		// TODO Auto-generated method stub
		baseDao.updateUser(obj);
	}

	@Override
	public List<Object> queryAllUser(String fromStr) {
		// TODO Auto-generated method stub
		return baseDao.queryAllUser(fromStr);
	}

	@Override
	public Object getObjectById(Class clazz, int id) {
		// TODO Auto-generated method stub
		return baseDao.getObjectById(clazz,id);
	}

}

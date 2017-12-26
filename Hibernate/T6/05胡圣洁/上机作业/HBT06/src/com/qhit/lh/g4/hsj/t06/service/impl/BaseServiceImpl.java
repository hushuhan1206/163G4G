package com.qhit.lh.g4.hsj.t06.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.hsj.t06.dao.BaseDao;
import com.qhit.lh.g4.hsj.t06.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.hsj.t06.service.BaseService;
import com.qhit.lh.g4.hsj.t06.utils.HibernateSessionFactory;

public class BaseServiceImpl implements BaseService {

	private BaseDao baseDao = new BaseDaoImpl();

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		baseDao.add(obj);
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		baseDao.delete(obj);
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		baseDao.update(obj);
	}

	@Override
	public List<Object> queryAll(String fromStr) {
		// TODO Auto-generated method stub
		return baseDao.queryAll(fromStr);
	}

	@Override
	public Object getObjectById(Class clazz, int id) {
		// TODO Auto-generated method stub
		return baseDao.getObjectById(clazz,id);
	}

}

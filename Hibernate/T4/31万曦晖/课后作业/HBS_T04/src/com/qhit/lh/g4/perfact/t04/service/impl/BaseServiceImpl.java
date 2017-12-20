package com.qhit.lh.g4.perfact.t04.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.perfact.t04.dao.BaseDao;
import com.qhit.lh.g4.perfact.t04.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.perfact.t04.service.BaseService;
import com.qhit.lh.g4.perfact.t04.util.HibernateSessionFactory;

public class BaseServiceImpl implements BaseService{
	private BaseDao basedao =new BaseDaoImpl();
	@Override
	public void add(Object object) {
		// TODO Auto-generated method stub
		basedao.add(object);
	}

	@Override
	public void delete(Object object) {
		// TODO Auto-generated method stub
		basedao.delete(object);
	}

	@Override
	public void update(Object object) {
		// TODO Auto-generated method stub
		basedao.update(object);
	}

	@Override
	public Object getObjectById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return basedao.getObjectById(clazz, id);
	}

	@Override
	public List<Object> queryAll(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

}

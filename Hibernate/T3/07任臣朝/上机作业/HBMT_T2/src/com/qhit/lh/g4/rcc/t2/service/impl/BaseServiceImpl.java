package com.qhit.lh.g4.rcc.t2.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import org.apache.catalina.User;

import com.qhit.lh.g4.rcc.t2.bean.Emp;
import com.qhit.lh.g4.rcc.t2.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.rcc.t2.service.BaseService;
import com.qhit.lh.g4.rcc.t2.dao.BaseDao;


public class BaseServiceImpl implements BaseService {

	private BaseDaoImpl baseDao = new BaseDaoImpl();
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		baseDao.add(user);

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		baseDao.update(user);

	}

	@Override
	public void delete(Use user) {
		// TODO Auto-generated method stub
		baseDao.delete(user);
		
	}

	@Override
	public Object getObjectById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getObjects(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Emp emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Object> queryAll(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getObjectById(Class clazz, int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

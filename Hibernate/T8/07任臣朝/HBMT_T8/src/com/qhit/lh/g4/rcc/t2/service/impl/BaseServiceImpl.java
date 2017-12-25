package com.qhit.lh.g4.rcc.t2.service.impl;


import java.util.List;

import com.qhit.lh.g4.rcc.t2.bean.Emp;
import com.qhit.lh.g4.rcc.t2.bean.Role;
import com.qhit.lh.g4.rcc.t2.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.rcc.t2.service.BaseService;


public class BaseServiceImpl implements BaseService {

	private BaseDaoImpl baseDao = new BaseDaoImpl();

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		baseDao.add(obj);
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		baseDao.update(obj);
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		baseDao.delete(obj);
	}

	@Override
	public List<Object> queryall(String tableName) {
		// TODO Auto-generated method stub
		return baseDao.queryall(tableName);
	}

	@Override
	public Object getObjectById(Class clazz, int id) {
		// TODO Auto-generated method stub
		return baseDao.getObjectById(clazz, id);
	}

	@Override
	public void getEmpByName() {
		// TODO Auto-generated method stub
		
	}




}

package com.qhit.lh.g4.lmy.t6.service.impl;

import java.io.Serializable;
import java.util.List;



import com.qhit.lh.g4.lmy.t6.dao.BaseDao;
import com.qhit.lh.g4.lmy.t6.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.lmy.t6.service.BaseService;

public class BaseServiceImpl implements BaseService {
	private BaseDao userDao = new BaseDaoImpl();
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
	public List<Object> query(String fromStr) {
		// TODO Auto-generated method stub
		return userDao.query(fromStr);
	}


	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.perfact.t6.service.DaseService#getObjectById(java.lang.Class, java.io.Serializable)
	 */
	@Override
	public Object getObjectById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return userDao.getObjectById(clazz, id);
	}
}

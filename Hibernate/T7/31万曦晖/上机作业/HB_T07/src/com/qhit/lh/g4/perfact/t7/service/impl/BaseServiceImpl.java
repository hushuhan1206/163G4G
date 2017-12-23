/**
 * 
 */
package com.qhit.lh.g4.perfact.t7.service.impl;

import java.io.Serializable;
import java.util.List;

import com.qhit.lh.g4.perfact.t7.bean.Dept;
import com.qhit.lh.g4.perfact.t7.bean.Emp;
import com.qhit.lh.g4.perfact.t7.dao.DaseDao;
import com.qhit.lh.g4.perfact.t7.service.DaseService;
import com.qhit.lh.g4.perfact.t7.dao.impl.DaseDaoImpl;

/**
 * @author 万曦晖
 *TODO
 *2017年12月20日下午4:50:40
 */
public class BaseServiceImpl implements DaseService{
	private DaseDao userDao = new DaseDaoImpl();

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

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.perfact.t7.service.DaseService#GetEmpByName(java.lang.String)
	 */
	@Override
	public List<Emp> getEmpByName(String name) {
		// TODO Auto-generated method stub
		return userDao.getEmpByName(name);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.perfact.t7.service.DaseService#getObjects(java.lang.Object)
	 */
	@Override
	public List<Dept> getObjects(Object object) {
		// TODO Auto-generated method stub
		return userDao.getObjects(object);
	}

}

/**
 * 
 */
package com.qhit.lh.g4.sea.t6.service.impl;

import java.io.Serializable;
import java.util.List;

import com.qhit.lh.g4.sea.t6.dao.BaseDao;
import com.qhit.lh.g4.sea.t6.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.sea.t6.service.BaseService;

/**
 * @author 李海洋
 *TODO
 *2017年12月14日上午10:06:29
 */
public class BaseServiceImpl implements BaseService {
	private BaseDao baseDao = new BaseDaoImpl();
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.t6.service.BaseService#add(java.lang.Object)
	 */
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		baseDao.add(obj);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.t6.service.BaseService#delete(java.lang.Object)
	 */
	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		baseDao.delete(obj);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.t6.service.BaseService#update(java.lang.Object)
	 */
	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		baseDao.update(obj);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.t6.service.BaseService#getObjectById(java.lang.Class, java.io.Serializable)
	 */
	@Override
	public Object getObjectById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return baseDao.getObjectById(clazz, id);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.t6.service.BaseService#getObjects(java.lang.String)
	 */
	@Override
	public List getObjects(String hql) {
		// TODO Auto-generated method stub
		return baseDao.getObjects(hql);
	}

}

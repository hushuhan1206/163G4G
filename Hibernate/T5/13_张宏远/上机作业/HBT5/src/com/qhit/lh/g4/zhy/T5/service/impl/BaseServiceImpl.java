/**
 * 
 */
package com.qhit.lh.g4.zhy.T5.service.impl;

import java.util.List;

import com.qhit.lh.g4.zhy.T5.dao.BaseDao;
import com.qhit.lh.g4.zhy.T5.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.zhy.T5.service.BaseService;



/**
 * @author 张宏远
 *2017-12-19下午9:05:46
 * TODO
 */
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
	public List<Object> queryAll(String tableName) {
		// TODO Auto-generated method stub
		return baseDao.queryAll(tableName);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.zhy.T5.service.BaseService#getObjectById(java.lang.Class, int)
	 */
	@Override
	public Object getObjectById(Class clazz, int id) {
		// TODO Auto-generated method stub
		return baseDao.getObjectById(clazz, id);
	}

}

/**
 * 
 */
package com.xjl.t4.service.impl;

import java.util.List;

import com.xjl.t4.dao.BaseDao;
import com.xjl.t4.dao.impl.BaseDaoImpl;
import com.xjl.t4.service.BaseService;

/**
 * @author 许金来
 *2017-12-12下午5:16:38
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

}

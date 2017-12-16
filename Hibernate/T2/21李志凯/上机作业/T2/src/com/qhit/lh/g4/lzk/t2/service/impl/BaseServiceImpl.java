/**
 * 
 */
package com.qhit.lh.g4.lzk.t2.service.impl;

import java.util.List;

import com.qhit.lh.g4.lzk.t2.dao.BaseDao;
import com.qhit.lh.g4.lzk.t2.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.lzk.t2.service.BaseService;

/**
 * @author 李志凯
 * TODO
 * 2017年12月12日下午3:02:57
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
	public List<Object> queryAll(String fromStr) {
		// TODO Auto-generated method stub
		return baseDao.queryAll(fromStr);
	}

}

/**
 * 
 */
package com.qhit.lh.g4.perfact.t5.service.impl;

import java.io.Serializable;
import java.util.List;

import com.qhit.lh.g4.perfact.t5.bean.TUser;
import com.qhit.lh.g4.perfact.t5.dao.BaseDao;
import com.qhit.lh.g4.perfact.t5.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.perfact.t5.service.BaseService;

/**
 * @author 万曦晖
 *TODO
 *2017年12月23日上午10:44:15
 */
public class BaseServiceImpl implements BaseService {


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
	public List<TUser> queryAll(String sql) {
		// TODO Auto-generated method stub
		return basedao.queryAll(sql);
	}


}

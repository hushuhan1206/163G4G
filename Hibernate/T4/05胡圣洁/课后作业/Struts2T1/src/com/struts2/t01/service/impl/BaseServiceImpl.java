package com.struts2.t01.service.impl;

import com.struts2.t01.dao.BaseDao;
import com.struts2.t01.dao.impl.BaseDaoImpl;
import com.struts2.t01.service.BaseService;

public class BaseServiceImpl implements BaseService {
	private BaseDao baseDao = new BaseDaoImpl();
	@Override
	public int add(Object obj) {
		// TODO Auto-generated method stub
		return baseDao.add(obj);
	}

}

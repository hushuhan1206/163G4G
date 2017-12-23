package com.qhit.lh.g4.zzh.t7.service.impl;

import java.util.List;

import com.qhit.lh.g4.zzh.t7.bean.Dept;
import com.qhit.lh.g4.zzh.t7.bean.Emp;
import com.qhit.lh.g4.zzh.t7.dao.BaseDao;
import com.qhit.lh.g4.zzh.t7.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.zzh.t7.service.BaseService;


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
	public Object getObjectById(Class clazz, int id) {
		// TODO Auto-generated method stub
		return baseDao.getObjectById(clazz, id);
	}

	@Override
	public List<Object> queryAll(String fromStr) {
		// TODO Auto-generated method stub
		return baseDao.queryAll(fromStr);
	}

	@Override
	public List<Emp> getEmpByName(String name) {
		// TODO Auto-generated method stub
		return baseDao.getEmpByName(name);
	}

	@Override
	public List<Emp> getEmp(String name) {
		// TODO Auto-generated method stub
		return baseDao.getEmp(name);
	}

	@Override
	public List<Dept> getDept(String name) {
		// TODO Auto-generated method stub
		return baseDao.getDept(name);
	}

	@Override
	public List<Object[]> getCount() {
		// TODO Auto-generated method stub
		return baseDao.getCount();
	}

}

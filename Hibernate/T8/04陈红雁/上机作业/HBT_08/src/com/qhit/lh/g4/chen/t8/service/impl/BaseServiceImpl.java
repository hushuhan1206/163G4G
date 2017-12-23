package com.qhit.lh.g4.chen.t8.service.impl;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.qhit.lh.g4.chen.t8.bean.Dept;
import com.qhit.lh.g4.chen.t8.bean.Emp;
import com.qhit.lh.g4.chen.t8.bean.UserInfo;
import com.qhit.lh.g4.chen.t8.dao.BaseDao;
import com.qhit.lh.g4.chen.t8.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.chen.t8.service.BaseService;
import com.qhit.lh.g4.chen.t8.utils.HibernateSessionFactory;
/**
 * @author 陈红雁
 * 2017年12月23日上午9:31:41
 * TODO
 */
public class BaseServiceImpl implements BaseService{
	private BaseDao baseDao =  (BaseDao) new BaseDaoImpl();

	@Override
	public void add(Object obj){

	}

	@Override
	public void delete(Object obj){

	}

	@Override
	public void update(Object obj){

	}
	
	public Object getObjectById(Class clazz,int id){
		Session session = HibernateSessionFactory.getSession();
		org.hibernate.Transaction tx = session.beginTransaction();
		Object obj = session.get(clazz,id);
		tx.commit();
		HibernateSessionFactory.closeSession(); 
		return obj;

	}

	@Override
	public List<Object> queryAll(String fromStr) {
		// TODO Auto-generated method stub
		return baseDao.queryAll(fromStr);
	}
	public Object getObjectById1(Class clazz, int id) {
		// TODO Auto-generated method stub
		return ((BaseServiceImpl) baseDao).getObjectById(clazz, id);
	}

	@Override
	public List<Emp> getEmpByName(){

		return baseDao.getEmpByName();
	}

	@Override
	public List<UserInfo> login(UserInfo user) {
		// TODO Auto-generated method stub
		return null;
	};



}

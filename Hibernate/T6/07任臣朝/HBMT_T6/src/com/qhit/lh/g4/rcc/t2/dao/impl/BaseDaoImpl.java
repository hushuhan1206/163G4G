package com.qhit.lh.g4.rcc.t2.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.rcc.t2.dao.BaseDao;
import com.qhit.lh.g4.rcc.t2.utils.HibernateSessionFactory;


public  class BaseDaoImpl implements BaseDao{
	//添加
	public void add(Object obj) {
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		session.save(obj);	
		
		tx.commit();
		
		HibernateSessionFactory.closeSession();
	}
	
	public void update(Object obj) {
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		
		session.update(obj);
		tx.commit();
		
		HibernateSessionFactory.closeSession();
		
	}
	


	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		
		session.delete(obj);
		tx.commit();
		
		HibernateSessionFactory.closeSession();
	}

	@Override
	public Object getObjectById(Class clazz, int id) {
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		
		Object obj = session.get(clazz, id);
		tx.commit();
		
		HibernateSessionFactory.closeSession();
		return obj;
	}
		
	

	@Override
	public List<Object> queryall(String tableName) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery(tableName);
		List<Object> list = query.list();
		tx.commit();
		
		HibernateSessionFactory.closeSession();
		return list;
	}
	

}

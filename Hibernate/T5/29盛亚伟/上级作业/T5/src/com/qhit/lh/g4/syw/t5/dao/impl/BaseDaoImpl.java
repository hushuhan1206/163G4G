package com.qhit.lh.g4.syw.t5.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.syw.t5.dao.BaseDao;
import com.qhit.lh.g4.syw.t5.utils.HibernateSessionFactory;


public class BaseDaoImpl implements BaseDao {
	
	private  Session session =HibernateSessionFactory.getSession();
	private  Transaction tx=session.beginTransaction();
	
	public void add(Object obj) {
		session.save(obj);
		tx.commit();
		HibernateSessionFactory.closeSession();
	}

	public void delete(Object obj) {
		session.delete(obj);
		tx.commit();
		HibernateSessionFactory.closeSession();
	}

	public void update(Object obj) {
		session.update(obj);
		tx.commit();
		HibernateSessionFactory.closeSession();
	}

	public List<Object> queryAll(String  tableName) {
		List<Object> list = new ArrayList<Object>();
		list = session.createQuery(tableName).list();
		tx.commit();
		HibernateSessionFactory.closeSession();
		return list;
	}

	@Override
	public Object getObjectById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getObjectById(Class class1, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}

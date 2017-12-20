package com.qhit.lh.g4.zs.t3.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.zs.t3.dao.BaseDao;
import com.qhit.lh.g4.zs.t3.util.HibernateSessionFactory;

public class BaseDaoImpl implements BaseDao {
	
	private Session session =HibernateSessionFactory.getSession();
	private Transaction tx=session.beginTransaction();
	private List<Object> list=new ArrayList<Object>();

	@Override
	public void add(Object object) {
		// TODO Auto-generated method stub
		
		session.save(object);
		tx.commit();
		HibernateSessionFactory.closeSession();
	}

	@Override
	public void delete(Object object) {
		// TODO Auto-generated method stub
		
		session.delete(object);
		tx.commit();
		HibernateSessionFactory.closeSession();
	}

	@Override
	public void update(Object object) {
		// TODO Auto-generated method stub
		
		session.update(object);
		tx.commit();
		HibernateSessionFactory.closeSession();
	}

	@Override
	public Object getObjectById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		Object object=session.get(clazz, id);
		return object;
	}

	@Override
	public List<Object> queryAll(String sql) {
		// TODO Auto-generated method stub
		
		list=session.createQuery(sql).list();
		tx.commit();
		HibernateSessionFactory.closeSession();
		return list;
	}

}

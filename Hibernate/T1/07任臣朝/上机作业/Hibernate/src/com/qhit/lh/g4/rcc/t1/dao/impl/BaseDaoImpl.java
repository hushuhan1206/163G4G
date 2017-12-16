package com.qhit.lh.g4.rcc.t1.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javassist.runtime.Desc;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.rcc.t1.bean.user;
import com.qhit.lh.g4.rcc.t1.dao.BaseDao;
import com.qhit.lh.g4.rcc.t1.util.HibernateSessionFactory;

public  class BaseDaoImpl implements BaseDao{
	//添加
	public void add(Object obj) {
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		session.save(obj);	
		
		tx.commit();
		
		HibernateSessionFactory.closeSession();
	}
	 public Object getObjectById(Class clazz,Serializable id) {
		 Session session = HibernateSessionFactory.getSession();
		 Transaction tx = session.beginTransaction();
		 Object obj = null;
		 obj = session.get(clazz, id);
		 tx.commit();
		 
		 HibernateSessionFactory.closeSession();
		 return obj;
	 }
	@Override
	public void update(Object obj) {
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		Desc dept = (Desc)session.get(Desc.class,new Integer(1));
		session.update(dept);
		tx.commit();
		
		HibernateSessionFactory.closeSession();
		
	}
	@Override
	//删除
	public void delete(Object obj) {
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		Desc dept=(Desc)session.get(Desc.class,new Integer(1));
		
		session.delete(dept);
		tx.commit();
		
		HibernateSessionFactory.closeSession();
		
	}
	@Override
	//查询
	public List getObjects(String hql) {
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		List result = new ArrayList();
		result = session.createQuery(hql).list();
		tx.commit();
		
		HibernateSessionFactory.closeSession();
		return result;
	}
	@Override
	public void add(user user) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(user user) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(user user) {
		// TODO Auto-generated method stub
		
	}

}

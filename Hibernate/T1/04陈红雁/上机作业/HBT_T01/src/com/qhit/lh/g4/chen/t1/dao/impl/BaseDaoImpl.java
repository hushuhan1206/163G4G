package com.qhit.lh.g4.chen.t1.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.chen.t1.bean.User;
import com.qhit.lh.g4.chen.t1.utils.HibernateSessionFactory;

public class BaseDaoImpl {
	private Serializable id;

	public void addUser(){
		User user = new User();
		user.setName("chen");
		user.setPassword("123456");
		user.setBirthday("2015-05-01");
		user.setSex('m');
		user.setIsable("1");
		Session session = HibernateSessionFactory.getSession();
		Transaction tx =session.beginTransaction();
		session.save(user);
		tx.commit();
		HibernateSessionFactory.closeSession();
	}
	
	public void delete(Object obj) {
		Session session = HibernateSessionFactory.getSession();
		Transaction tx =session.beginTransaction();
		session.update(obj);
		tx.commit();
		HibernateSessionFactory.closeSession();
	}
	
	
	public void update() {
		Session session = HibernateSessionFactory.getSession();
		Transaction tx =session.beginTransaction();
		Object obj = session.get(getClass(), id);
		session.update(obj);
		tx.commit();
		HibernateSessionFactory.closeSession();
	}
	
public List<Object> queryAll(String fromStr) throws Exception {
		
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = (Transaction) session.beginTransaction();
		Query query = session.createQuery(fromStr);
		List<Object> list = query.list();
		tx.commit();
		HibernateSessionFactory.closeSession();
		return list;
	}

}

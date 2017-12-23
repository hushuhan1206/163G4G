/**
 * 
 */
package com.qhit.lh.g4.perfact.t5.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.perfact.t5.bean.TUser;
import com.qhit.lh.g4.perfact.t5.dao.BaseDao;
import com.qhit.lh.g4.perfact.t5.util.HibernateSessionFactory;

/**
 * @author 万曦晖
 *TODO
 *2017年12月23日上午10:46:24
 */
public class BaseDaoImpl implements BaseDao{
	private List<TUser> list = new ArrayList<TUser>();


	@Override
	public void add(Object object) {
		// TODO Auto-generated method stub
		Session session =HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		session.save(object);
		tx.commit();
		session.close();
	}

	@Override
	public void delete(Object object) {
		// TODO Auto-generated method stub
		Session session =HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		session.delete(object);
		tx.commit();
		session.close();
	}

	@Override
	public void update(Object object) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		session.update(object);
		tx.commit();
		session.close();
	}

	@Override
	public List<TUser> queryAll(String sql) {
		// TODO Auto-generated method stub
		Session session =HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		list=session.createQuery(sql).list();
		tx.commit();
		session.close();
		return list;
	}

	@Override
	public Object getObjectById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		Session session =HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		Object object=session.get(clazz, id);
		session.close();
		return object;
	}
}

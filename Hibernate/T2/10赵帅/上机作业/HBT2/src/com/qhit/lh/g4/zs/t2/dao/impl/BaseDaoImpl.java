package com.qhit.lh.g4.zs.t2.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.zs.t2.dao.BaseDao;
import com.qhit.lh.g4.zs.t2.util.HibernateSessionFactory;



public class BaseDaoImpl implements BaseDao {

	@Override
	public void add(Object obj) {
		// 获取session对象
		Session session = HibernateSessionFactory.getSession();
		// 开启事物
		Transaction tx = session.beginTransaction();
		// 操作对象
		session.save(obj);
		// 提交事物
		tx.commit();
		// 关闭session
		HibernateSessionFactory.closeSession();
	}

	@Override
	public void update(Object obj,int id) {
		// 获取session对象
		Session session = HibernateSessionFactory.getSession();
		// 开启事物
		Transaction tx = session.beginTransaction();
		// 操作对象
		session.update(obj);
		// 提交事物
		tx.commit();
		// 关闭session
		HibernateSessionFactory.closeSession();
	}

	@Override
	public void delete(Object obj) {
		// 获取session对象
		Session session = HibernateSessionFactory.getSession();
		// 开启事物
		Transaction tx = session.beginTransaction();
		// 操作对象
		session.delete(obj);
		// 提交事物
		tx.commit();
		// 关闭session
		HibernateSessionFactory.closeSession();
		
	}

	@Override
	public List<Object> queryall(String fromStr) {
		// 获取session对象
		Session session = HibernateSessionFactory.getSession();
		// 开启事物
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery(fromStr);
		// 操作对象
		List<Object> list = query.list();
		// 提交事物
		tx.commit();
		// 关闭session
		HibernateSessionFactory.closeSession();
		return list;
	}

}

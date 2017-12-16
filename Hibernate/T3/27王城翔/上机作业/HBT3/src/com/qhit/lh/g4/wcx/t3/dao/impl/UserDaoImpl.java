package com.qhit.lh.g4.wcx.t3.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.wcx.t3.dao.UserDao;
import com.qhit.lh.g4.wcx.t3.utils.HibernateSessionFactory;

/**
 * @author 王城翔
 * 2017年12月14日下午3:00:58
 * TODO
 */
public class UserDaoImpl implements UserDao {

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
        //获取session对象
		Session session = HibernateSessionFactory.getSession();
        //开启 Hibernate事务
		Transaction tx = session.beginTransaction();
        //操作对象
		session.save(obj);
        //提交事务
		tx.commit();
        //关闭session
		HibernateSessionFactory.closeSession();			
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
        //获取session对象
		Session session = HibernateSessionFactory.getSession();
        //开启 Hibernate事务
		Transaction tx = session.beginTransaction();
        //操作对象
		obj = session.get(obj.getClass(), session);
		session.save(obj);
        //提交事务
		tx.commit();
        //关闭session
		HibernateSessionFactory.closeSession();			
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
        //获取session对象
		Session session = HibernateSessionFactory.getSession();
        //开启 Hibernate事务
		Transaction tx = session.beginTransaction();
        //操作对象
		session.save(obj);
        //提交事务
		tx.commit();
        //关闭session
		HibernateSessionFactory.closeSession();			
	}

	@Override
	public List<Object> queryAll(String fromStr) {
		// TODO Auto-generated method stub
        //获取session对象
		Session session = HibernateSessionFactory.getSession();
        //开启 Hibernate事务
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery(fromStr);
        //查询
		List<Object> list = query.list();
        //提交事务
		tx.commit();
        //关闭session
		HibernateSessionFactory.closeSession();	
		return null;
	}

	@Override
	public Object getObjectById(Class clazz, int id) {
		// TODO Auto-generated method stub
        //获取session对象
		Session session = HibernateSessionFactory.getSession();
        //开启 Hibernate事务
		Transaction tx = session.beginTransaction();
        //操作对象
		Object obj = session.get(clazz,id);
        //提交事务
		tx.commit();
        //关闭session
		HibernateSessionFactory.closeSession();
		return obj;
	}

}

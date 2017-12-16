package com.qhit.lh.g4.chx.t1.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.chx.t1.dao.BaseDao;
import com.qhit.lh.g4.chx.t1.utils.HibernateSessionFactory;

/**
 * @author chx
 *
 */
public class BaseDaoImpl implements BaseDao {

	@Override
	/**
	 *增 
	 **/
	public void add(Object obj){
		// TODO Auto-generated method stub
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//开启 Hibernate事务
		Transaction tx = (Transaction) session.beginTransaction();
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
		Transaction tx = (Transaction) session.beginTransaction();
		//操作对象
		obj = session.get(obj.getClass(), session);
		session.update(obj);
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
		session.delete(obj);
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

}

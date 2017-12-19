package com.qhit.lh.g4.zzh.t5.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.zzh.t5.dao.BaseDao;
import com.qhit.lh.g4.zzh.t5.utils.HibernateSessionFactory;


public class BaseDaoImpl implements BaseDao {
	//获取session对象
	private  Session session =HibernateSessionFactory.getSession();
	//开启 Hibernate事务
	private  Transaction tx=session.beginTransaction();
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		//操作对象
		session.save(obj);
		//提交事务
		tx.commit();
		//关闭session
		HibernateSessionFactory.closeSession();
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		//操作对象
		session.delete(obj);
		//提交事务
		tx.commit();
		//关闭session
		HibernateSessionFactory.closeSession();		
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		//操作对象
		session.update(obj);
		//提交事务
		tx.commit();
		//关闭session
		HibernateSessionFactory.closeSession();	
	}

	@Override
	public Object getObjectById(Class clazz, int id) {
		// TODO Auto-generated method stub
		Object obj = session.get(clazz, id);
		tx.commit();
		HibernateSessionFactory.closeSession();
		return obj;
	}

	@Override
	public List<Object> queryAll(String fromStr) {
		// TODO Auto-generated method stub
		Query query = session.createQuery(fromStr);
		//查询
		List<Object> list = query.list();
		//提交事务
		tx.commit();
		//关闭session
		HibernateSessionFactory.closeSession();	
		return list;
	}

}

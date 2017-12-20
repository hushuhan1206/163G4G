package com.qhit.lh.g4.jer.t5.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.jer.t5.bean.User;
import com.qhit.lh.g4.jer.t5.dao.UserDao;
import com.qhit.lh.g4.jer.t5.utils.DBManager;
import com.qhit.lh.g4.jer.t5.utils.HibernateSessionFactory;

public class UserDaoImpl implements UserDao {
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//开启 Hibernate事务
		Transaction tx = session.beginTransaction();
		//操作对象
		session.save(user);
		//提交事务
		tx.commit();
		//关闭session
		HibernateSessionFactory.closeSession();	
	}
	
	@Override
	public void updateUser(Object obj) {
		// TODO Auto-generated method stub
        //获取session对象
		Session session = HibernateSessionFactory.getSession();
        //开启 Hibernate事务
		Transaction tx = (Transaction) session.beginTransaction();
        //操作对象
		obj = session.get(obj.getClass(), session);
		session.save(obj);
        //提交事务
		tx.commit();
        //关闭session
		HibernateSessionFactory.closeSession();	
	}
	
	@Override
	public void deleteUser(int uid) {
		// TODO Auto-generated method stub
        //获取session对象
		Session session = HibernateSessionFactory.getSession();
        //开启 Hibernate事务
		Transaction tx = session.beginTransaction();
        //操作对象
		session.save(uid);
        //提交事务
		tx.commit();
        //关闭session
		HibernateSessionFactory.closeSession();		
	}
	@Override
	public List<User> queryAllUser(String fromStr) {
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

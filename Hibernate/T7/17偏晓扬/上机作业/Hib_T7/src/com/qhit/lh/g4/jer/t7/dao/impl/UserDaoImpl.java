package com.qhit.lh.g4.jer.t7.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.jer.t7.bean.Emp;
import com.qhit.lh.g4.jer.t7.bean.UserInfo;
import com.qhit.lh.g4.jer.t7.dao.UserDao;
import com.qhit.lh.g4.jer.t7.utils.HibernateSessionFactory;

/**
 * @author 偏晓阳
 * 2017年12月20日下午5:13:50
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

	@Override
	public List<Emp> getEmpByName(String name) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();	
		
		String hql = "select emp from Emp emp where emp.empName like ?";
		Query query = session.createQuery(hql);
		query.setString(0, name);
		
		return query.list();
	}

	@Override
	public UserInfo login(UserInfo user) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hql = "select user from UserInfo user where user.userNmae = :name and user.pwd = :pwd";
		Query query = session.createQuery(hql);
		query.setString("name", user.getUserName());
		query.setString("pwd", user.getPwd());
		List<UserInfo> result = query.list();
		return result.get(0);
	}

}

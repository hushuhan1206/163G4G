/**
 * 
 */
package com.qhit.lh.g4.ZWK.T01.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.ZWK.T01.bean.User;
import com.qhit.lh.g4.ZWK.T01.dao.UserDao;
import com.qhit.lh.g4.ZWK.T01.utils.HibernateSessionFactory;

/**
 * @author ZWK
 *2017年12月9日上午11:29:21
 *TODO
 */
public class UserDaoImpl implements UserDao {

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.ZWK.T01.dao.UserDao#add()
	 */
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//Hibernate是以事物驱动的ORM框架，所以需要创建事件对象
		Transaction tx = session.beginTransaction();
		//添加（保存）数据对象
		session.save(obj);
		//事物对象提交
		tx.commit();
		//销毁session对象
		HibernateSessionFactory.closeSession();
	}

	@Override
	public void delete(Object arg0) {
		// TODO Auto-generated method stub
		//获取session对象
				Session session = HibernateSessionFactory.getSession();
				//Hibernate是以事物驱动的ORM框架，所以需要创建事件对象
				Transaction tx = session.beginTransaction();
				//删除数据对象
				session.delete(arg0);
				//事物对象提交
				tx.commit();
				//销毁session对象
				HibernateSessionFactory.closeSession();
			
	}

	@Override
	public User getUser( int id) {
		// TODO Auto-generated method stub
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//Hibernate是以事物驱动的ORM框架，所以需要创建事件对象
		Transaction tx = session.beginTransaction();
		//获取数据对象
		Object obj =  session.get( User.class, id);
		//事物对象提交
		tx.commit();
		//销毁session对象
		HibernateSessionFactory.closeSession();
		return (User) obj;
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//Hibernate是以事物驱动的ORM框架，所以需要创建事件对象
		Transaction tx = session.beginTransaction();
		//更新数据对象
		session.update(obj);
		//事物对象提交
		tx.commit();
		//销毁session对象
		HibernateSessionFactory.closeSession();
		
	}

	@Override
	public List<Object> getList(String str) {
		// TODO Auto-generated method stub
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//Hibernate是以事物驱动的ORM框架，所以需要创建事件对象
		Transaction tx = session.beginTransaction();
		//获取所有数据对象
		List<Object> list = new ArrayList<Object>();
		Query query = session.createQuery(str);
		list = query.list();
		//事物对象提交
		tx.commit();
		//销毁session对象
		HibernateSessionFactory.closeSession();
		return list;
	}

	
	
}

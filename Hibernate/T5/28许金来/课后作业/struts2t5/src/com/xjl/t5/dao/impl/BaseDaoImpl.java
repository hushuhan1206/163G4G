/**
 * 
 */
package com.xjl.t5.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xjl.t5.dao.BaseDao;
import com.xjl.t5.utils.HibernateSessionFactory;


/**
 * @author 许金来
 *2017-12-12下午4:55:32
 * TODO
 */
public class BaseDaoImpl implements BaseDao {

	private BaseDao baseDao = new BaseDaoImpl();
	

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		//2,先获取session对象
		Session session = HibernateSessionFactory.getSession();
		//3,Hibernate是以事务驱动的ORM框架，需要开启事务
		Transaction ts = session.beginTransaction();
		//4,操作对象-->完成数据的CRUD
		session.save(obj);
		//5,提交事务
		ts.commit();
		//6,关闭session，释放资源
		HibernateSessionFactory.closeSession();
	}


	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		//2,先获取session对象
		Session session = HibernateSessionFactory.getSession();
		//3,Hibernate是以事务驱动的ORM框架，需要开启事务
		Transaction ts = session.beginTransaction();
		//4,操作对象-->完成数据的CRUD
		session.delete(obj);
		//5,提交事务
		ts.commit();
		//6,关闭session，释放资源
		HibernateSessionFactory.closeSession();
	}


	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		//2,先获取session对象
		Session session = HibernateSessionFactory.getSession();
		//3,Hibernate是以事务驱动的ORM框架，需要开启事务
		Transaction ts = session.beginTransaction();
		//4,操作对象-->完成数据的CRUD
		session.update(obj);
		//5,提交事务
		ts.commit();
		//6,关闭session，释放资源
		HibernateSessionFactory.closeSession();
	}


	@Override
	public List<Object> queryAll(String tableName) {
		// TODO Auto-generated method stub
		//2,先获取session对象
		Session session = HibernateSessionFactory.getSession();
		//3,Hibernate是以事务驱动的ORM框架，需要开启事务
		Transaction ts = session.beginTransaction();
		Query query = session.createQuery(tableName);
		//4,查询
		List<Object> list = query.list();
		//5,提交事务
		ts.commit();
		//6,关闭session，释放资源
		HibernateSessionFactory.closeSession();
		return list;
		
	}

}

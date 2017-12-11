package com.qhit.lh.g4.hsj.t01.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.hsj.t01.bean.User;
import com.qhit.lh.g4.hsj.t01.dao.BaseDao;
import com.qhit.lh.g4.hsj.t01.utils.HibernateSessionFactory;

public class BaseDaoImpl implements BaseDao {

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		 Session session = HibernateSessionFactory.getSession();
		  //hibernate是以事务驱动的ORM框架，需要开启事务
		  Transaction tx =  session.beginTransaction();
		  //操作对象，完成数据的CRUD
		  session.save(obj);
		  //提交事务
		  tx.commit();
		  //关闭session，释放资源
		  HibernateSessionFactory.closeSession();
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.hsj.t01.dao.BaseDao#update(java.lang.Object, int)
	 */
	@Override
	public void update(Object obj, int id) {
		// TODO Auto-generated method stub
		  Session session = HibernateSessionFactory.getSession();
		  //hibernate是以事务驱动的ORM框架，需要开启事务
		  Transaction tx =  session.beginTransaction();
		  //操作对象，完成数据的CRUD
		  session.update(obj);
		  //提交事务
		  tx.commit();
		  //关闭session，释放资源
		  HibernateSessionFactory.closeSession();
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.hsj.t01.dao.BaseDao#delete(com.qhit.lh.g4.hsj.t01.bean.User)
	 */
	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.hsj.t01.dao.BaseDao#queryAll(java.lang.String)
	 */
	@Override
	public List<Object> queryAll(String fromStr) {
		// TODO Auto-generated method stub
		return null;
	}



	
}

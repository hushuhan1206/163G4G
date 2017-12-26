package com.struts2.t01.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.struts2.t01.dao.BaseDao;
import com.struts2.t01.utils.HibernateSessionFactory;

public class BaseDaoImpl implements BaseDao {

	@Override
	public int add(Object obj) {
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
		return 0;
	}

}

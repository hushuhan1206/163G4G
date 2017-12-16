package com.qhit.lh.g4.jer.chen.dao.impl;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.jer.chen.bean.User;
import com.qhit.lh.g4.jer.chen.dao.UserDao;
import com.qhit.lh.g4.jer.chen.utils.HibernateSessionFactory;

/**
 * @author 偏晓扬
 * TODO
 * 2017年12月15日下午7:21:24
 */
public class UserDaoImpl implements UserDao {
	@Override
	public void add(User user) {
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

}

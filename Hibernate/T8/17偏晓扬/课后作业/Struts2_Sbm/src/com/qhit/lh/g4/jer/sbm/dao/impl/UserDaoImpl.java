/**
 * 
 */
package com.qhit.lh.g4.jer.sbm.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.jer.sbm.bean.User;
import com.qhit.lh.g4.jer.sbm.dao.UserDao;
import com.qhit.lh.g4.jer.sbm.utils.HibernateSessionFactory;

/**
 * @author 偏晓阳
 * 2017年12月8日下午5:55:24
 * TODO
 */
public class UserDaoImpl implements UserDao {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private User user = null;

	@Override
	public User doLogin(String userName, String userPassword) {
		
		return null;
	}

	@Override
	public void addUser(User user) {
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		HibernateSessionFactory.closeSession();	
	}

	@Override
	public List<User> getAllUser(String fromStr) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery(fromStr);
		List<Object> list = query.list();
		tx.commit();
		HibernateSessionFactory.closeSession();	
		return null;
	}

}

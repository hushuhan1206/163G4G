package com.qhit.lh.g4.chen.t1;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.qhit.lh.g4.chen.t1.bean.User;
import com.qhit.lh.g4.chen.t1.utils.HibernateSessionFactory;

public class UserTest {

	private Session baseDao;

	public void addUser() throws Exception, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException{
		User user = new User();
		user.setName("chen");
		user.setPassword("123456");
		user.setBirthday("2015-05-01");
		user.setSex('m');
		user.setIsable("1");
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = (Transaction) session.beginTransaction();
		session.save(user);
		tx.commit();
		HibernateSessionFactory.closeSession();
	}
	
	
	public void deleteUser(){
		User user = new User();
		user.setUid(1);
	
		baseDao.delete(user);
	}
	
	
	
	public void updateUser(){
		User user = new User();
		user.setUid(1);
		user.setName("aa");
		user.setPassword("123");
		user.setBirthday("2005-08-01");
		user.setSex('f');
		user.setIsable("1");
		
		baseDao.update(user);
	}
	
}

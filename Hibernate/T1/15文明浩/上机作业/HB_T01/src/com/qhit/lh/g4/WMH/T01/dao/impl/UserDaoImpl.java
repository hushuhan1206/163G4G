/**
 * 
 */
package com.qhit.lh.g4.WMH.T01.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.WMH.T01.dao.UserDao;
import com.qhit.lh.g4.WMH.T01.utils.HibernateSessionFactory;

/**
 * @author WMH
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
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		session.save(obj);
		tx.commit();
		HibernateSessionFactory.closeSession();

	}

	
	
}

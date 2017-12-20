/**
 * 
 */
package com.qhit.lh.g4.WMH.HB_T02.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.WMH.HB_T02.dao.BaseDao;
import com.qhit.lh.g4.WMH.HB_T02.utils.HibernateSessionFactory;

/**
 * @author WMH
 *2017年12月12日下午3:17:15
 *TODO
 */
public class BaseDaoImpl implements BaseDao {

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.ZWK.HB_T02.dao.BaseDao#add(java.lang.Object)
	 */
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		//通过session工厂类获取session对象
		Session session = HibernateSessionFactory.getSession();
		//获取事物类
		Transaction tx = session.beginTransaction();
		//保存数据
		session.save(obj);
		//提交事件
		tx.commit();
		//关闭session
		HibernateSessionFactory.closeSession();
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.ZWK.HB_T02.dao.BaseDao#delete(java.lang.Object)
	 */
	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		//通过session工厂类获取session对象
		Session session = HibernateSessionFactory.getSession();
		//获取事物类
		Transaction tx = session.beginTransaction();
		//删除数据
		session.delete(obj);
		//提交事件
		tx.commit();
		//关闭session
		HibernateSessionFactory.closeSession();
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.ZWK.HB_T02.dao.BaseDao#update(java.lang.Object)
	 */
	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		//通过session工厂类获取session对象
		Session session = HibernateSessionFactory.getSession();
		//获取事物类
		Transaction tx = session.beginTransaction();
		//更新数据
		session.update(obj);
		//提交事件
		tx.commit();
		//关闭session
		HibernateSessionFactory.closeSession();
	}

	
}

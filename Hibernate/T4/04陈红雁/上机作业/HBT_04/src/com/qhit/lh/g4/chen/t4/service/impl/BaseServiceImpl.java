package com.qhit.lh.g4.chen.t4.service.impl;

import javax.transaction.Transaction;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.mapping.List;

import com.qhit.lh.g4.chen.t4.bean.Dept;
import com.qhit.lh.g4.chen.t4.dao.BaseDao;
import com.qhit.lh.g4.chen.t4.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.chen.t4.service.BaseService;
import com.qhit.lh.g4.chen.t4.utils.HibernateSessionFactory;

public abstract class BaseServiceImpl implements BaseService{
	private BaseDao baseDao =  (BaseDao) new BaseDaoImpl();
	
	public void add(Object obj){
		
	}
	
   public void delete(Object obj){
		
	}

   public void update(Object obj){
	
}
   public Object getObjectById(Class clazz,int id){
	   Session session = HibernateSessionFactory.getSession();
	   org.hibernate.Transaction tx = session.beginTransaction();
	   Object obj = session.get(clazz,id);
	   tx.commit();
	   HibernateSessionFactory.closeSession(); 
	   return obj;
	    
		
   }

@Override
public List queryAll(String fromStr) {
	// TODO Auto-generated method stub
	return null;
}

public <T> Object getObjectById(Dept dept, int id) {
	// TODO Auto-generated method stub
	return null;
}



	

}

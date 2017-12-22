package com.qhit.lh.g4.chen.t7.dao.impl;

import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Query;
import org.hibernate.Session;

import com.qhit.lh.g4.chen.t7.bean.Emp;
import com.qhit.lh.g4.chen.t7.bean.UserInfo;
import com.qhit.lh.g4.chen.t7.utils.HibernateSessionFactory;


public class BaseDaoImpl {

	public void addUser(){
		
	}
	
	public Object getobObjectById(Class clazz, int id){
		//先获取对象
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = (Transaction) session.beginTransaction();
		//查询
		Object obj = session.get(clazz, id);
		//提交事务
		try {
			tx.commit();
		} catch (SecurityException | RollbackException
				| HeuristicMixedException | HeuristicRollbackException
				| SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//关闭session,释放资源
		HibernateSessionFactory.closeSession();
		return obj;
		
	}
	
	public List<Emp> getEmpByName(){
		Session session = HibernateSessionFactory.getSession();
		String hql = "select emp from Emp emp where emp.empName like :name ";
		Query query = session.createQuery(hql);
		String name = null;
		query.setString("name", name);
		return query.list();
	} 
	
	public List<UserInfo> login(){
		Session session = HibernateSessionFactory.getSession();
		String hql = "select user from UserInfo user where user.userName = ? and user.password = :pwd";
		Query query = session.createQuery(hql);
		query.setString("name", UserInfo.getUname());
		query.setString("pwd", UserInfo.getUname());
		
		return query.list();
	}
	
}

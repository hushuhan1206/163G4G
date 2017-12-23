package com.qhit.lh.g4.zzh.t7.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.qhit.lh.g4.zzh.t7.bean.Dept;
import com.qhit.lh.g4.zzh.t7.bean.Emp;
import com.qhit.lh.g4.zzh.t7.dao.BaseDao;
import com.qhit.lh.g4.zzh.t7.util.HibernateSessionFactory;


public class BaseDaoImpl implements BaseDao {
	//获取session对象
	private  Session session =HibernateSessionFactory.getSession();
	//开启 Hibernate事务
	private  Transaction tx=session.beginTransaction();
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		//操作对象
		session.save(obj);
		//提交事务
		tx.commit();
		//关闭session
		HibernateSessionFactory.closeSession();
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		//操作对象
		session.delete(obj);
		//提交事务
		tx.commit();
		//关闭session
		HibernateSessionFactory.closeSession();		
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		//操作对象
		session.update(obj);
		//提交事务
		tx.commit();
		//关闭session
		HibernateSessionFactory.closeSession();	
	}

	@Override
	public Object getObjectById(Class clazz, int id) {
		// TODO Auto-generated method stub
		Object obj = session.get(clazz, id);
		tx.commit();
		HibernateSessionFactory.closeSession();
		return obj;
	}

	@Override
	public List<Object> queryAll(String fromStr) {
		// TODO Auto-generated method stub
		Query query = session.createQuery(fromStr);
		//查询
		List<Object> list = query.list();
		//提交事务
		tx.commit();
		//关闭session
		HibernateSessionFactory.closeSession();	
		return list;
	}

	@Override
	public List<Emp> getEmpByName(String name) {
		// TODO Auto-generated method stub
		String hql = "select e from Emp e where e.ename like:name";
		Query query = session.createQuery(hql);
		query.setString("name", name);
		return query.list();
	}
	@Test
	public List<Emp> getEmp(String name) {
		// TODO Auto-generated method stub
		String hql = "select new Emp(e.ename,e.sex,e.age) from Emp e where e.ename like ?";
		Query query = session.createQuery(hql);
		query.setString(0, name);
		return query.list();
	}

	@Override
	public List<Dept> getDept(String name) {
		// TODO Auto-generated method stub
		String hql = "select distinct d from Dept d join fetch d.emps where d.dname = ?";
		Query query = session.createQuery(hql);
		query.setString(0, name);
		return query.list();
	}

	@Override
	public List<Object[]> getCount() {
		String hql = "select d.dname,count(e) from Dept d left join d.emps e group by d.dname";
		Query query = session.createQuery(hql);
		
		return query.list();
	}
}

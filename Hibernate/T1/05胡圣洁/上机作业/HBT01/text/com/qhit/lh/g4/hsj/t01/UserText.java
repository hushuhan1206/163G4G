package com.qhit.lh.g4.hsj.t01;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;




import com.qhit.lh.g4.hsj.t01.bean.User;
import com.qhit.lh.g4.hsj.t01.dao.BaseDao;
import com.qhit.lh.g4.hsj.t01.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.hsj.t01.utils.HibernateSessionFactory;

public class UserText {
	private BaseDao baseDao = new BaseDaoImpl();
	
	@Test 
	public void addUser(){
		//声明并实例化user对象
		User user = new User();
		user.setName("jack");
		user.setPassword("123456");
		user.setBirthday("2017-08-16");
		user.setSex(1);
		user.setIsable("是");
		baseDao.add(user);
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//hibernate是以事务驱动的ORM框架，需要开启事务
		Transaction tx =  session.beginTransaction();
		//操作对象，完成数据的CRUD
		session.save(user);
		//提交事务
		tx.commit();
		//关闭session，释放资源
		HibernateSessionFactory.closeSession();
	}
	@Test
	public void updateUser(){
		User user = new User();
		user.setName("tom");
		user.setPassword("100678");
		baseDao.update(user, 1);
      }
	@Test
	public void deleteUser(){
		User user = new User();
		user.setUid(2);
		baseDao.delete(user);
	}
	@Test
	public void queryAll(){
		List<Object> list = baseDao.queryAll("fromStr");
		for (Object obj : list) {
			User user = (User) obj;
			System.out.println(user.toString());
		}
	}
}

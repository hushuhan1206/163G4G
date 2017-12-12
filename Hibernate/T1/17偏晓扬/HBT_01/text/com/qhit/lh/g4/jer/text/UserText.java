package com.qhit.lh.g4.jer.text;

import static org.junit.Assert.*;

import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.qhit.lh.g4.jer.t1.bean.User;
import com.qhit.lh.g4.jer.t1.dao.UserDao;
import com.qhit.lh.g4.jer.t1.dao.impl.UserDaoImpl;
import com.qhit.lh.g4.jer.t1.utils.HibernateSessionFactory;


/**
 * @author 偏晓阳
 * 2017年12月9日上午10:36:57
 * TODO
 */
public class UserText {
	
	User user = new User();
	UserDao userDao = new UserDaoImpl();
	/**
	 * 添加用户测试
	 * @throws SystemException 
	 * @throws HeuristicRollbackException 
	 * @throws HeuristicMixedException 
	 * @throws RollbackException 
	 * @throws SecurityException 
	 */
	@Test
	public void addUser() {
		//声明实例化User对象
		user.setName("二狗子");
		user.setPassword("123456");
		user.setSex(0);
		user.setBirthday("2017-12-9");
		user.setIsable("1");
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
	
	public void update(){
		user.setUid(1);
		user.setName("李狗蛋");
		user.setPassword("123456");
		user.setSex(0);
		user.setBirthday("2017-12-9");
		user.setIsable("1");
		
		userDao.update(user);
        //获取session对象
	}
	
	public void deleteUser(){
		user.setUid(1);
		user.setName("李狗蛋");
		
		userDao.delete(user);
	}
	
	public void querAll(){
		List<Object> list = userDao.queryAll("from 	User");
		for (Object obj : list) {
			user = (User) obj;
			System.out.println(user.toString());
		}
	}
}

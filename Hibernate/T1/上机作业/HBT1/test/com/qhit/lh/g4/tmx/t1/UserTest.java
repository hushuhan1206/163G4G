package com.qhit.lh.g4.tmx.t1;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.qhit.lh.g4.tmx.t1.bean.User;
import com.qhit.lh.g4.tmx.t1.utils.HibernateSessionFactory;

public class UserTest {

	@Test
	public void addUser(){
		//声明实例化User对象
		User user = new User();
		user.setUname("xia");
		user.setUpwd("123456");
		user.setBirthday("2000-5-05");
		user.setSex("M");
		user.setEnable(1);
		//2,获取session对象
		Session session = (Session) HibernateSessionFactory.getSession();
		//3,开启事务
		Transaction ts = session.beginTransaction();
		//4,操作对象-->完成数据的CRUD
		session.save(user);
		//5,提交事务
		ts.commit();
		//6,关闭session释放资源
		HibernateSessionFactory.closeSession();
		
	}
}

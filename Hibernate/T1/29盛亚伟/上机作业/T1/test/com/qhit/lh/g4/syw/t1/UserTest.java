package com.qhit.lh.g4.syw.t1;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.qhit.lh.g4.syw.t1.bean.User;
import com.qhit.lh.g4.syw.t1.dao.BaseDao;
import com.qhit.lh.g4.syw.t1.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.syw.t1.utils.HibernateSessionFactory;

public class UserTest {
	private BaseDao baseDao=new BaseDaoImpl();
	//���user����
@Test
public void  add(){
	User user =new User();
	user.setUname("jack");
	user.setUpwd("123456");
	baseDao.add(user);
	
}
	//�޸�user����
@Test
public void update(){
User user =new User();
user.setuId(2);
user.setUname("jackjava");
user.setUpwd("123456");
baseDao.update(user);
}	
	//��ѯuser����
@Test
public void queryAll(){

	List<Object> users = baseDao.queryAll("from User");
	for (Object object : users) {
		User user = (User) object;
		System.out.println(user.toString());
	}
	
}
	//ɾ��user����
@Test
public void delete(){
	User user =new User();
	user.setuId(2);
	baseDao.delete(user);
	
}	
	
}

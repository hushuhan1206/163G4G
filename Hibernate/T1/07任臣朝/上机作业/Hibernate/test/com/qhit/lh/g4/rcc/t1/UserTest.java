package com.qhit.lh.g4.rcc.t1;

import java.util.List;

import org.apache.catalina.User;

import com.qhit.lh.g4.rcc.t1.bean.user;
import com.qhit.lh.g4.rcc.t1.dao.BaseDao;
import com.qhit.lh.g4.rcc.t1.dao.impl.BaseDaoImpl;

public class UserTest {
	private BaseDao baseDao=new BaseDaoImpl();
	//添加
	public void add(){
		user user=new user();
		user.setUname("rcc");
		user.setUpwd("123456");
		baseDao.add(user);
	}
	//修改
	public void update(){
		user user =new user();
		user.setOid(2);
		user.setUname("jackjava");
		user.setUpwd("123456");
		baseDao.update(user);
	}
	//查询
	public void queryAll(){

		List<Object> users = baseDao.getObjects("from User");
		for (Object object : users) {
			User user = (User) object;
			System.out.println(user.toString());
		}
	}
		//删除
		public void delete(){
			user user = new user();
			user.setOid(2);
			baseDao.delete(user);

		}
	}

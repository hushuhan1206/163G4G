/**
 * 
 */
package com.qhit.lh.g4.xjl.t1;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.qhit.lh.g4.xjl.t1.bean.User;
import com.qhit.lh.g4.xjl.t1.dao.BaseDao;
import com.qhit.lh.g4.xjl.t1.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.xjl.t1.utils.HibernateSessionFactory;

/**
 * @author 许金来
 *2017年12月9日上午10:51:23
 *TODO
 */
public class UserTest {
	private BaseDao baseDao=new BaseDaoImpl();
	
	@Test
	public void addUser() {
		//1,声明实例化user对象
		User user = new User();
		user.setUname("张三");
		user.setUpwd("123456");
		user.setBirthday("1997-07-28");
		user.setSex("m");
		user.setAddress("漯河职业技术学院");
		
		
	}
	@Test
	public void update(){
	User user =new User();
	user.setId(2);
	user.setUname("jackjava");
	user.setUpwd("123456");
	user.setBirthday("2007-04-11");
	user.setSex("m");
	user.setAddress("大中国");
	baseDao.update(user, 0);
	}	
		
	@Test
	
	public void queryAll(){
		List<Object> list = baseDao.queryAll("from User");
		for(Object obj : list){
			User user = (User) obj;
			System.out.println(user.toString());
		}
		
	}

	@Test
	public void delete(){
		User user =new User();
		user.setId(2);
		baseDao.delete(user);
		
	}	

}

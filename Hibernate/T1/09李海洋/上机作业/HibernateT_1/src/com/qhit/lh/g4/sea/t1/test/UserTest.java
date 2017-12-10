/**
 * 
 */
package com.qhit.lh.g4.sea.t1.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.sea.t1.bean.User;
import com.qhit.lh.g4.sea.t1.dao.BaseDao;
import com.qhit.lh.g4.sea.t1.dao.impl.BaseDaoImpl;

/**
 * @author 李海洋
 *TODO
 *2017年12月10日上午10:05:46
 */
public class UserTest {
	private BaseDao baseDao = new BaseDaoImpl();
	private User user;
	@Test
	//添加测试
	public void addUser() {
		User user = new User("小七", "123456", "女", 25, "13025668899", "2366568", "奥斯卡石头");
		baseDao.addUser(user);
	}
	@Test
	//遍历查询测试
	public void getObjects(){
		List users = baseDao.getObjects("from User");
		for (Object object : users) {
			User user = (User) object;
			System.out.println(user.toString());
		}
	}
	@Test
	//删除测试
	public void delete(){
		user = new User();
		user.setUserId(1024);
		baseDao.deleteUser(user);
	}
	@Test
	//修改测试
	public void update(){
		user = new User();
		user.setUserId(1019);
		user.setUserName("惊蛰");
		user.setUserPassword("2699");
		user.setUserSex("女");
		user.setUserAge(23);
		user.setPhone("1368989999");
		user.setQQ("4568855");
		user.setAddress("就的撒");
		baseDao.updateUser(user);
	}
}

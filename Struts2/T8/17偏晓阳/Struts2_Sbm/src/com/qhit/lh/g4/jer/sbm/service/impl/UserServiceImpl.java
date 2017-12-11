/**
 * 
 */
package com.qhit.lh.g4.jer.sbm.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.qhit.lh.g4.jer.sbm.bean.User;
import com.qhit.lh.g4.jer.sbm.dao.UserDao;
import com.qhit.lh.g4.jer.sbm.dao.impl.UserDaoImpl;
import com.qhit.lh.g4.jer.sbm.service.UserService;



/**
 * @author 偏晓阳
 * 2017年12月8日下午5:46:33
 * TODO
 */
public class UserServiceImpl implements UserService {
	
	private UserDao userDao = new UserDaoImpl();
	
	@Override
	public User doLogin(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return userDao.doLogin(userName, userPassword);
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	@Override
	public List<User> getAllUser() throws SQLException {
		// TODO Auto-generated method stub
		return userDao.getAllUser();
	}


}

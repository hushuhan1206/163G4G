/**
 * 
 */
package com.zs.sbm.user.service.impl;

import com.zs.sbm.user.bean.User;
import com.zs.sbm.user.dao.impl.UserDaoImpl;
import com.zs.sbm.user.service.UserService;

/**
 * @author admin
 * 2017年11月11日
 */
public class UserServiceImpl implements UserService {

	@Override
	public User doLogin(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return new UserDaoImpl().doLogin(userName, userPassword);
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return new UserDaoImpl().addUser(user);
	}

}

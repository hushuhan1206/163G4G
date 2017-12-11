/**
 * 
 */
package com.qhit.lh.g4.hsj.sbm.user.service.impl;

import java.util.List;

import com.qhit.lh.g4.hsj.sbm.user.bean.User;
import com.qhit.lh.g4.hsj.sbm.user.dao.UserDao;
import com.qhit.lh.g4.hsj.sbm.user.dao.impl.UserDaoImpl;
import com.qhit.lh.g4.hsj.sbm.user.service.UserService;



/**
 * @author 胡圣洁
 * TODO
 * 2017年12月8日下午10:17:45
 */
public class UserServiceImpl implements UserService {
	 private UserDao userDao = new UserDaoImpl();
	@Override
	public User doLogin(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return new UserDaoImpl().doLogin(userName, userPassword);
	}
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.hsj.sbm.user.service.UserService#getAllUser()
	 */
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.hsj.sbm.user.service.UserService#addUser(com.qhit.lh.g4.hsj.sbm.user.bean.User)
	 */
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}

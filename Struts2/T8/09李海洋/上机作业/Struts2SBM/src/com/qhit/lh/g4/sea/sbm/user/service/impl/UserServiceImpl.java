/**
 * 
 */
package com.qhit.lh.g4.sea.sbm.user.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.qhit.lh.g4.sea.sbm.user.bean.User;
import com.qhit.lh.g4.sea.sbm.user.dao.impl.UserDaoImpl;
import com.qhit.lh.g4.sea.sbm.user.service.UserService;

/**
 * @author 李海洋
 *TODO
 *2017年12月8日下午5:10:22
 */
public class UserServiceImpl implements UserService {
	private UserDaoImpl userService = new UserDaoImpl();

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.sbm.user.service.UserService#doLogin(java.lang.String, java.lang.String)
	 */
	@Override
	public User doLogin(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return userService.doLogin(userName, userPassword);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.sbm.user.service.UserService#deleteUser(int)
	 */
	@Override
	public int deleteUser(int userId) {
		// TODO Auto-generated method stub
		return userService.deleteUser(userId);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.sbm.user.service.UserService#updateUser(com.qhit.lh.g4.sea.sbm.user.bean.User, int)
	 */
	@Override
	public int updateUser(User user, int userId) {
		// TODO Auto-generated method stub
		return userService.updateUser(user, userId);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.sbm.user.service.UserService#addUser(com.qhit.lh.g4.sea.sbm.user.bean.User)
	 */
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userService.addUser(user);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.sbm.user.service.UserService#getAll()
	 */
	@Override
	public List<User> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return userService.getAll();
	}

}

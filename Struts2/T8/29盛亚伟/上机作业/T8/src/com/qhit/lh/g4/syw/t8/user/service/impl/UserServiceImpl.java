package com.qhit.lh.g4.syw.t8.user.service.impl;

import java.util.List;

import com.qhit.lh.g4.syw.t8.user.bean.User;
import com.qhit.lh.g4.syw.t8.user.dao.impl.UserDaoImpl;
import com.qhit.lh.g4.syw.t8.user.service.UserService;

public class UserServiceImpl implements UserService {
		

	@Override
	public User doLogin(String userName, String userPassword) {
		return  new UserDaoImpl().doLogin(userName, userPassword);
	
	}
		// TODO Auto-generated method stub
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return new UserDaoImpl().addUser(user);
	}

	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return new UserDaoImpl().getUser();
	}
	@Override
	public int deleteUserById(int userId) {
		// TODO Auto-generated method stub
		return new UserDaoImpl().deleteUserById(userId);
	}
	@Override
	public int updateUser(int userId, String userName, String userSex,
			String userPassword, String address, int userAge, String telephone,
			int type) {
		// TODO Auto-generated method stub
		return new UserDaoImpl().updateUser(userId, userName, userSex, userPassword, address, userAge, telephone, type);
	}
	@Override
	public int updatePwd(int userId, String pwd) {
		// TODO Auto-generated method stub
		return new UserDaoImpl().updatePwd(userId, pwd) ;
	}
	@Override
	public User dologin(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User doRepswd(User user, String newpswd) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User doselectUser(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

}

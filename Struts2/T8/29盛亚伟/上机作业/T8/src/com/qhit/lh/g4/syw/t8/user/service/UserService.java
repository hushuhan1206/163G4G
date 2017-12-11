package com.qhit.lh.g4.syw.t8.user.service;

import java.util.List;

import com.qhit.lh.g4.syw.t8.user.bean.User;

public interface UserService {
	
	public User dologin(String userName,String userPassword);
	
	public User doRepswd(User user,String newpswd);
	
	public int addUser(User user);
	
	public User doselectUser(String userName);

	public List<User> getUser();

	User doLogin(String userName, String userPassword);

	int deleteUserById(int userId);

	int updateUser(int userId, String userName, String userSex,
			String userPassword, String address, int userAge, String telephone,
			int type);

	int updatePwd(int userId, String pwd);
}

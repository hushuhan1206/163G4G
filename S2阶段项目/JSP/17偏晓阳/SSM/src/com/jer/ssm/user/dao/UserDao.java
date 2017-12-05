package com.jer.ssm.user.dao;

import com.jer.ssm.user.bean.User;

public interface UserDao {
	public int addUser(User user);
	public User doLogin(String userName,String userPassword);

}

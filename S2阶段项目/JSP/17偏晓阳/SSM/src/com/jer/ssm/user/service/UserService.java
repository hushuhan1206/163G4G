package com.jer.ssm.user.service;

import com.jer.ssm.user.bean.User;

public interface UserService {
	public int addUser(User user);
	public User doLogin(String userName,String userPassword);

}

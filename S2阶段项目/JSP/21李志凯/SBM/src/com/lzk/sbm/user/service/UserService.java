package com.lzk.sbm.user.service;

import com.lzk.sbm.user.bean.User;

public interface UserService {
	
	public User dologin(String userName,String userPassword);
	
	public User doRepswd(User user,String newpswd);
	
	public int addUser(User user);
	
	public User doselectUser(String userName);
}

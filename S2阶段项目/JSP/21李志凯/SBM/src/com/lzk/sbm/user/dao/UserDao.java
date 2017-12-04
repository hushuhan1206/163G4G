package com.lzk.sbm.user.dao;

import com.lzk.sbm.user.bean.User;

public interface UserDao {
	
	public User dologin(String userName,String userPassword);
	
	public User doRepswd(User user,String newpswd);
	
	public int addUser(User user);
	
	public User doselectUser(String userName);
}

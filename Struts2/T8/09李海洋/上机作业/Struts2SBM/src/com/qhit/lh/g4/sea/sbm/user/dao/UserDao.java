package com.qhit.lh.g4.sea.sbm.user.dao;

import java.sql.SQLException;
import java.util.List;

import com.qhit.lh.g4.sea.sbm.user.bean.User;


public interface UserDao {

	public User doLogin(String userName, String userPassword);
	
	public int deleteUser(int userId);
	
	public int updateUser(User user,int userId);
	
	public int addUser(User user);
	
	public List<User> getAll() throws SQLException;
}

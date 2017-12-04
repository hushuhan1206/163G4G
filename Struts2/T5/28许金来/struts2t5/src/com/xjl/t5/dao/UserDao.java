package com.xjl.t5.dao;

import java.util.List;

import com.xjl.t5.bean.User;


public interface UserDao {

	
	public void addUser(User user);

	public List<User> allUser();

	public void delete(int id);


	public User getUpdate(int id);

	public void update(User user);
}

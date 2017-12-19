package com.qhit.lh.g4.jer.t5.dao;

import java.util.List;

import com.qhit.lh.g4.jer.t5.bean.User;

public interface UserDao {
	public void addUser(User user);
	public void updateUser(Object obj);
	public void deleteUser(int uid);
	public List<User> queryAllUser(String fromStr);
}

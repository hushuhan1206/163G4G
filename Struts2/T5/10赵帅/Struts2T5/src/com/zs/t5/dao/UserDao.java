package com.zs.t5.dao;


import com.zs.t5.bean.User;

public interface UserDao {
	public void add(User user);
	public void del(int id);
	public void update(User user);
	public void select(User user);

}

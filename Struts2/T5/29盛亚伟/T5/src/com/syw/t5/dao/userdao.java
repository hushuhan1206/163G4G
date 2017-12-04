package com.syw.t5.dao;

import java.util.List;

import com.syw.t5.bean.User;

public interface userdao {
	 	 public void addUser(User user);
	 	 public List<User> allUser();
	 	 public void del(int userId);
	 	 public User perUpdate(int userId);
	 	 public void update(User user);
		void addUser1(User user);
		void update1(User user);
}

package com.qhit.Struts2_T05.service;

import java.util.List;

import com.qhit.Struts2_T05.bean.User;

public interface userService {
	public List All ();
	public List getAlls (User user);
	public int delete(int uid);
	public int addUser(User user);
	public User getUser(int uid);
	public int update (User user);
}

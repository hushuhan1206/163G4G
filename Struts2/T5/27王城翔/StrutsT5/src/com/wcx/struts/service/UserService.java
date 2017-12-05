package com.wcx.struts.service;

import java.util.List;

import com.wcx.struts.bean.User;

public interface UserService {
public int addUser(User user);
public int updateUser(User user);
public int deleteUser(int uid);
public List<User> queryAllUser();
public User querySingleUser(int uid);
}

package com.qhit.lh.g4.jer.t5.service;

import java.util.List;

import com.qhit.lh.g4.jer.t5.bean.User;

public interface UserService {
public void addUser(User user);
public void updateUser(User user);
public void deleteUser(int uid);
public List<User> queryAllUser(String fromStr);
}

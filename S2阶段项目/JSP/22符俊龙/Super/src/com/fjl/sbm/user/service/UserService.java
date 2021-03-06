package com.fjl.sbm.user.service;

import java.util.List;

import com.fjl.sbm.user.bean.User;

public interface UserService {
public User doLogin(String userName ,String userPassword);
public int addUser(User user);
public List<User> getUser();
public int deleteUserById(int userId);
public int updatePwd(int userId,String pwd);
public int updateUser(int userId,String userName,String userSex,String userPassword,String address,int userAge,String telephone,int type);
}

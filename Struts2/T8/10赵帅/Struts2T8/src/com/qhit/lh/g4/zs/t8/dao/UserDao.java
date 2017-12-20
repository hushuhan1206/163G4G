package com.qhit.lh.g4.zs.t8.dao;

import java.util.List;

import com.qhit.lh.g4.zs.t8.bean.User;

public interface UserDao {
	public User doLogin(String userName ,String userPassword);
	public int addUser(User user);
	public List<User> getUser();
	public int updatePwd(int userId,String pwd);
	public int deleteUserById(int userId);
	public int updateUser(int userId,String userName,String userSex,String userPassword,String address,int userAge,String telephone,int type);
}



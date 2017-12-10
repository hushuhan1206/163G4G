package com.zs.t5.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zs.t5.bean.User;
import com.zs.t5.dao.impl.UserDaoImpl;

public class UserAction extends ActionSupport{
	//数据
	private UserDaoImpl userDaoImpl = new UserDaoImpl();
	private  User user;
	
	public String add() {
		userDaoImpl.add(user);
		return "useradd";
	}
	public String del() {
		userDaoImpl.del(user.getId());
		return "userdel";
	}
	public String update() {
		userDaoImpl.update(user);
		return "userupdate";
	}
	public String select() {
		userDaoImpl.select(user);
		return "userselect";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public UserDaoImpl getUserDaoImpl() {
		return userDaoImpl;
	}
	public void setUserDaoImpl(UserDaoImpl userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}
	

}

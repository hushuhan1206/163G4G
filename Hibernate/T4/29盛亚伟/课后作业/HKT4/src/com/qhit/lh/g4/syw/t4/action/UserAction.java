package com.qhit.lh.g4.syw.t4.action;

import com.qhit.lh.g4.syw.t4.bean.User;
import com.qhit.lh.g4.syw.t4.dao.impl.UserDaoImpl;
import com.qhit.lh.g4.syw.t4.service.UserService;


public class UserAction{
	private User user;
	UserService uService = (UserService) new UserDaoImpl();
	
	public String add() throws Exception {
		// TODO Auto-generated method stub
		int row = uService.add(user);
		if(row > 0){
			return "success";
		}else{
			return "error";
		}
	}
	
	public String delete() throws Exception {
		// TODO Auto-generated method stub
		return "success";
	}
	
	public String update() throws Exception {
		// TODO Auto-generated method stub
		return "success";
	}
	
	public String select() throws Exception {
		// TODO Auto-generated method stub
		return "success";
	}
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
}

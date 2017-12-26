package com.struts2.t01.action;

import com.struts2.t01.bean.User;
import com.struts2.t01.service.BaseService;
import com.struts2.t01.service.impl.BaseServiceImpl;

public class UserAction {
private User user;
	

	public String add() throws Exception {
		// TODO Auto-generated method stub
		BaseService uService = new BaseServiceImpl();
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

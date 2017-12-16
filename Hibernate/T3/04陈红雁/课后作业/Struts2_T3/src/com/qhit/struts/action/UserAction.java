package com.qhit.chen.action;

import com.opensymphony.xwork2.Action;
import com.qhit.chen.bean.User;

public class UserAction implements Action {
	private User user;

	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
		
}

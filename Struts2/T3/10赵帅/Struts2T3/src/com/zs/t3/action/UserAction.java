package com.zs.t3.action;

import java.util.Date;
import com.opensymphony.xwork2.Action;
import com.zs.t3.bean.User;


public class UserAction implements Action{
	private User user;
	private Date date;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		date = new Date();
		return Action.SUCCESS;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}

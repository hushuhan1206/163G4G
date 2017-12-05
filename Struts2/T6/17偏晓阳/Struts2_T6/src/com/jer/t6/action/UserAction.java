package com.jer.t6.action;

import java.util.regex.Pattern;

import com.jer.t6.bean.User;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public void validate(){
		Pattern pattern = Pattern.compile("^[A-Za-z][A-Za-z1-9_-]+$");
		if(!pattern.matcher(user.getName()).matches()) {
			super.addFieldError("name.error", getText("name.error"));
		}
		if("".equals(user.getName())) {
			super.addFieldError("name.empry", getText("name.empty"));
		}
		if("".equals(user.getPwd())) {
			super.addFieldError("pwd.empry", getText("pwd.empty"));
		}
	}
	
	public String toLogin(){
		
		return "tologin";
	}
	
	public String login(){
		
		return "loginSuccess";
	}
}

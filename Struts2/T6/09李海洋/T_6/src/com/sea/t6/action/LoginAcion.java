package com.sea.t6.action;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionSupport;
import com.sea.t6.bean.User;

public class LoginAcion extends ActionSupport {
	private User user;
	
	public void validate(){
		Pattern pattern = Pattern.compile("^[A-Za-z][A-Za-z1-9_-]+$");
		if(!pattern.matcher(user.getUname()).matches()) {
			super.addFieldError("uname.error", getText("uname.error"));
		}
	}
	
	public String Login() {

		return "success";
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}

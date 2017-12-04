package com.syw.t6.action;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionSupport;
import com.syw.t6.bean.User;

public class UserAction extends ActionSupport {
	private User user;
	
	public void validate() {
		Pattern pattern = Pattern.compile("^[A-Za-z][A-Za-z1-9_-]+$");
		if(!pattern.matcher(user.getUname()).matches()) {
			super.addFieldError("uname.error", getText("uname.error"));
		}
		if("".equals(user.getUname())) {
			super.addFieldError("uname.empry", getText("uname.empty"));
		}
		if("".equals(user.getUpwd())) {
			super.addFieldError("upwd.empry", getText("upwd.empty"));
		}
	}
public String toLogin() {
		
		return "tologin";
	}
	
	public String login() {
		
		return "loginSuccess";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

}

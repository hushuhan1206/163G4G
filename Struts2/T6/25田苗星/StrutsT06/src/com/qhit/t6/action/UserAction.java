package com.qhit.t6.action;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.t6.bean.User;

public class UserAction extends ActionSupport {
	
		private User user;
		
	public void validate(){
		
		Pattern pattern = Pattern.compile("^[A-Za-z][A-Za-z1-9_-]+$");
		if(!pattern.matcher(user.getUname()).matches()){
			super.addFieldError("uname.error", getText("uname.error"));
		}
		if("".equals(user.getUname())){
			super.addFieldError("uname.empry", getText("uname.empry"));
		}
		if("".equals(user.getUpwd())){
			super.addFieldError("upwd.empry", getText("upwd.empry"));
		}
	}
	
	public String toLogin(){
		return "toLogin";
	}
	public String login(){
		return "loginSuccess";
	}
	public User getUser(){
		return user;
	}
	public void setUser(User user){
		this.user = user;
	}
}

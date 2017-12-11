package com.qhit.lh.g4.jer.sbm.action;

import java.sql.SQLException;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g4.jer.sbm.bean.User;
import com.qhit.lh.g4.jer.sbm.service.UserService;
import com.qhit.lh.g4.jer.sbm.service.impl.UserServiceImpl;

/**
 * @author 偏晓阳
 * 2017年12月8日下午5:20:58
 * TODO
 */
public class UserAction extends ActionSupport {
	private User user;
	private UserService userService = new UserServiceImpl(); 
	private List<User> users;
	
	public String login(){
		user = userService.doLogin(user.getUserName(), user.getUserPassword());
		if (user != null) {
			ServletActionContext.getRequest().getSession().setAttribute("user",user);
		}else {
			super.addFieldError("loginFail", "账户密码错误！");
		}
		return "loginSuccess";
	}
	
	public String getAll() throws Exception{
		userService.getAllUser();
		return "";
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}

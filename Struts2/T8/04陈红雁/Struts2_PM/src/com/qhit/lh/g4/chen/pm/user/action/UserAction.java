package com.qhit.lh.g4.chen.pm.user.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g4.chen.pm.user.bean.User;
import com.qhit.lh.g4.chen.pm.user.service.UserService;
import com.qhit.lh.g4.chen.pm.user.service.impl.UserServiceImpl;



/**
 * @author 陈红雁
 * 2017年12月8日下午5:35:56
 *TODO
 */
public class UserAction extends ActionSupport{
	
	private UserService userService = (UserService) new UserServiceImpl();
	private User user;

	public String login(){
		user = userService.doLogin(user.getUserName(),user.getUserPassword());
		if(user != null){
			ServletActionContext.getRequest().getSession().setAttribute("user", user);
		}else{
			super.addFieldError("loginFail", "账户密码错误！");
		}
		return "loginSuccess";
	}
}

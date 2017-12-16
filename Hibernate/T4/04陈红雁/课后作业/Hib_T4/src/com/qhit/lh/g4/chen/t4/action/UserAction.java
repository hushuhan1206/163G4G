package com.qhit.lh.g4.chen.t4.action;

import javax.swing.Action;
import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g4.chen.t4.bean.User;
import com.qhit.lh.g4.chen.t4.service.UserService;
import com.qhit.lh.g4.chen.t4.service.impl.UserServiceImpl;

public class UserAction extends ActionSupport {

	private User user;
	UserService uService = new UserServiceImpl();
	
	public String add() throws Exception {
		int row = uService.add(user);
		if (row>0) {
			return "success";
		}else{
			return "error";			
		}
		
	}	
	
	
}

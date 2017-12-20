package com.qhit.lh.g4.perfact.t04.action;

import com.opensymphony.xwork2.Action;
import com.qhit.lh.g4.perfact.t04.bean.TUser;

public class UserAction implements Action{
	private String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String execute() throws Exception {
		return Action.SUCCESS;
		// TODO Auto-generated method stub
		
	}


}

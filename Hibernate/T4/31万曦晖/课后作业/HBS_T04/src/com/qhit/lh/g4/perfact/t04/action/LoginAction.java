package com.qhit.lh.g4.perfact.t04.action;

import com.opensymphony.xwork2.Action;
import com.qhit.lh.g4.perfact.t04.bean.TUser;

public class LoginAction implements Action{
	private TUser user;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(user.getName().equals("alice")&&user.getPassword().equals("123456")){
			//登陆成功
			return Action.SUCCESS;
		}else{
			return Action.ERROR;
		}
	}
	public TUser getUser() {
		return user;
	}
	public void setUser(TUser user) {
		this.user = user;
	}


}

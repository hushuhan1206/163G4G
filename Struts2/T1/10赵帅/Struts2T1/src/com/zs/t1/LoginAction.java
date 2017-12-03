package com.zs.t1;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action{

	private String name;
	

	@Override
	public String execute() throws Exception {
		
		return Action.SUCCESS;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}

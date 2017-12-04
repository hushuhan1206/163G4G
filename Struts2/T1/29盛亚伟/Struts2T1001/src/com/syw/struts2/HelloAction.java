package com.syw.struts2;

import com.opensymphony.xwork2.Action;

public class HelloAction implements Action {
	private String content;
	private String uname;
	
	

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public HelloAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		content = "您好，"+uname;
		return Action.SUCCESS;
	}

}

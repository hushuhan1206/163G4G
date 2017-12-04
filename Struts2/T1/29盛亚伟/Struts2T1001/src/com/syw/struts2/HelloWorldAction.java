package com.syw.struts2;

import com.opensymphony.xwork2.Action;

public class HelloWorldAction implements Action {
	private String content;
	
	
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public HelloWorldAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		content = "hello word!";
		
		return Action.SUCCESS;
	}

}

package com.qhit.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

// struts2Ĭ��ת��·��Ϊ WEB-INF/content/demo.jsp

@Results({	
	@Result(name="success",location="/demo.jsp",type="dispatcher")
	
})
// Hello + Action
public class HelloAction extends ActionSupport {	
	public String execute() throws Exception {
		// TODO Auto-generated method stub		
		System.out.println("=========================");
		return "success";
	}
	
}

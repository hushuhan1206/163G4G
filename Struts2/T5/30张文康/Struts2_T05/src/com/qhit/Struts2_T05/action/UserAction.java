package com.qhit.Struts2_T05.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.Struts2_T05.bean.User;
import com.qhit.Struts2_T05.service.Impl.userServiceImpl;

public class UserAction extends ActionSupport {
	private User user;
	private List<User> userList;
	private userServiceImpl usi = new userServiceImpl();

	public String  getAll() throws Exception{
		userList = usi.getAlls(user);
		if(userList != null ){
			return "listUser";
		}else{
			return "error";
		}
	}
	public String  All() throws Exception{
		userList = usi.All();
		if(userList != null ){
			return "all";
		}else{
			return "error";
		}
		
	}
	public String  Add() throws Exception{
		int row = usi.addUser(user);
		if(row > 0){
			return "add";
		}else{
			return "error";
		}	
	}
	public String  Update() throws Exception{
		int row = usi.update(user);
		if(row > 0){
			return "update";
		}else{
			return "error";
		}
	}
	public String  get() throws Exception{
		user = usi.getUser(user.getUid());
		if( user != null){
			return "getu";
		}else{
			return "error";
		}
		
	}
	public String  Delete() throws Exception{
		int row = usi.delete(user.getUid());
		if( row > 0){
			return "delete";
		}else{
			return "error";
		}
		
	}

	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
	
	
}

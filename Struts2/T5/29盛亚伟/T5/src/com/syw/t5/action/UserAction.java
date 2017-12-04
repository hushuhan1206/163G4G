package com.syw.t5.action;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.syw.t5.bean.User;

public class UserAction implements Action {

	private User userdao = new User();
 	private User user;
 	private List<User> userlist;
 
 	public String addUser() throws Exception{
 		if (user!=null) {
 			userdao.addUser(user);
 		}
 		return "tolist";
 	}
 	public String allUser() throws Exception{
 		userlist = userdao.allUser();
 		return "list";
 	}
 	public String del() throws Exception {
 		userdao.del(user.getUserId());
 		return "tolist";
 	}
 	public String perUpdate() throws Exception{
 		user = userdao.perUpdate(user.getUserId());
 		return "update";
 	}
 	public String update() throws Exception{
 		if (user!=null) {
 			userdao.update(user);
 		}
 		return "tolist";
 	}
 	public User getuserdao() {
 		return userdao;
 	}
 	public void setuserdao(User userdao) {
 		this.userdao = userdao;
 	}
 	public User getUser() {
 		return user;
 	}
 	public void setUser(User user) {
 		this.user = user;
 	}
 	public List<User> getUserlist() {
 		return userlist;
	}
 	public void setUserlist(List<User> userlist) {
 		this.userlist = userlist;
 	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
 } 



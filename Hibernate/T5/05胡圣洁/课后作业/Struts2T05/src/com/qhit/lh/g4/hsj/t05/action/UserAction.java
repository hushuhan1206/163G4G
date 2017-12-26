package com.qhit.lh.g4.hsj.t05.action;

import java.util.List;

import com.qhit.lh.g4.hsj.t05.bean.User;
import com.qhit.lh.g4.hsj.t05.service.BaseService;
import com.qhit.lh.g4.hsj.t05.service.impl.BaseServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private User user;
	private List<User> userlist;


	public List<User> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<User> userlist) {
		this.userlist = userlist;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public BaseService getBaseService() {
		return baseService;
	}

	public void setUserService(BaseService userService) {
		this.baseService = userService;
	}

	BaseService baseService =new BaseServiceImpl();


		public String add() throws Exception {
			// TODO Auto-generated method stub
			int row =baseService.addUser(user);
			if(row>0){
				return "addUser";
			}else{
				return "error";
			}
			
		}
		public String queryAll(){
			userlist=baseService.queryAllUser();
			if(userlist!=null){
				return "queryAllUser";
			}
			return "error";
			
		}
		public String update(){
			int row =baseService.updateUser(user);
			if(row>0){
			return "updateUser";
			}
			return "error";
			
		}
		public String delete(){
			int row=baseService.deleteUser(user.getUid());
			if(row>0){
				return "deleteUser";
			}
			return "error";
			
		}
		public String querySingle(){
			user=baseService.querySingleUser(user.getUid());
			if(user!=null){
				return "querySingleUser";
			}
			return "error";
			
		}

}

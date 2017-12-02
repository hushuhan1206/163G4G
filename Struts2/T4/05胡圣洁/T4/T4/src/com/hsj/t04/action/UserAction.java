package com.hsj.t04.action;

public class UserAction {
private User user;
	

	public String add() throws Exception {
		// TODO Auto-generated method stub
		UserService uService = new UserServiceImpl();
		int row = uService.add(user);
		if(row > 0){
			return "success";
		}else{
			return "error";
		}
	}

	public String delete() throws Exception {
		// TODO Auto-generated method stub
		return "success";
	}

	public String update() throws Exception {
		// TODO Auto-generated method stub
		return "success";
	}

	public String select() throws Exception {
		// TODO Auto-generated method stub
		return "success";
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}

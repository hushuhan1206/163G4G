package com.rcc.t5.action;

import java.util.List;

import com.rcc.t5.bean.User;
import com.rcc.t5.dao.UserDao;
import com.rcc.t5.dao.Impl.UserDaoImpl;
public class UserAction {
	
	private UserDaoImpl userdao = new UserDaoImpl();
	private List<User> userlist;
	
	private User userinfo;
	public String list() throws Exception{
		userlist = userdao.getAllUsers();
		return "list";
	}
	public String toUpdate() throws Exception{
		userinfo = userdao.getUserInfoById(userinfo.getId());
		return "update";
	}
	public String update() throws Exception{
		if(userinfo!=null){userdao.updateUser(userinfo);}
		return "tolist";
	}
	public String delete() throws Exception{
		userdao.daleteUser(userinfo);
		return "tolist";
	}
  
	public String add() throws Exception{
		if(userinfo!=null) {userdao.addUser(userinfo);}
		return "tolist";
	}
	
}

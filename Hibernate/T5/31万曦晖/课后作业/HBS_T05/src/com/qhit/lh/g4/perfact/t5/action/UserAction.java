/**
 * 
 */
package com.qhit.lh.g4.perfact.t5.action;

import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g4.perfact.t5.bean.TUser;
import com.qhit.lh.g4.perfact.t5.service.BaseService;
import com.qhit.lh.g4.perfact.t5.service.impl.BaseServiceImpl;

/**
 * @author 万曦晖
 *TODO
 *2017年12月23日上午10:40:08
 */
public class UserAction extends ActionSupport{
	private TUser user;
	private Date birthday;
	private List<TUser> userlist;



	public List<TUser> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<TUser> userlist) {
		this.userlist = userlist;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public TUser getUser() {
		return user;
	}

	public void setUser(TUser user) {
		this.user = user;
	}

	BaseService baseservice =new BaseServiceImpl();



	public String add() throws Exception {

		// TODO Auto-generated method stub
		if(user.getIsable()==null){
			user.setIsable("false");
		}
		user.setBirthday(birthday);
		baseservice.add(user);

		return "addUser";

	}

	public String queryAll(){

		userlist=baseservice.queryAll("from User");
		userlist=(List<TUser>)userlist;
		return "queryAllUser";
	}

	public String update(){
		if(user.getIsable()==null){
			user.setIsable("false");
		}
		user.setBirthday(birthday);
		baseservice.update(user);
		return "updateUser";

	}

	public String delete(){
		baseservice.delete(user);
		return "deleteUser";
	}

	public String querySingle(){
		user=(TUser) baseservice.getObjectById(TUser.class,user.getUid());
		return "querySingleUser";

	}
}
package com.qhit.lh.g4.syw.t4.bean;

import com.qhit.lh.g4.syw.t4.dao.impl.BaseDaoImpl;

/**
 * @author 盛亚伟
 *2017年12月15日上午9:54:50
 *TODO
 *账户信息类
 */
public class UserInfo {
	private int userId;
	private String userName;
	private String password;
	
	private Emp emp;
	//一对一关系对应的对象
	private UserInfo userInfo;
	//添加有参构造方法，无参构造方法和get，set方法

	public UserInfo(int userId, String userName, String password,
			UserInfo userInfo) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.userInfo = userInfo;
	}
	public UserInfo(int userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public static String getUid() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void setEmp(Emp emp) {
		// TODO Auto-generated method stub
		
	}
	public void setUpswd(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setDept(Emp emp2) {
		// TODO Auto-generated method stub
		
	}
	public BaseDaoImpl getEmps() {
		// TODO Auto-generated method stub
		return null;
	}
}

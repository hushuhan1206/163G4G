package com.qhit.lh.g4.wcx.t6.bean;

import java.util.HashSet;
import java.util.Set;

public class UserInfo {
	private int userId;
	private String userName;
	private String password;
	
	private Emp emp;
	//m-n
	private Set<Role> roles=new HashSet<>();

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public UserInfo(int userId, String userName, String password, Emp emp) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.emp = emp;
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

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
	
}

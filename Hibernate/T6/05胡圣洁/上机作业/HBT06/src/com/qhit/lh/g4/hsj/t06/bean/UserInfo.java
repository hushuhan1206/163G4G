package com.qhit.lh.g4.hsj.t06.bean;

import java.util.HashSet;
import java.util.Set;

public class UserInfo {
	private int userId;
	private String userName;
	private String password;

	private Set<Roles> roles = new HashSet<>();

	public UserInfo(int userId, String userName, String password,
			Set<Roles> roles) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.roles = roles;
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

	public Set<Roles> getRoles() {
		return roles;
	}

	public void setRoles(Set<Roles> roles) {
		this.roles = roles;
	}


}

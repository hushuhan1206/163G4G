package com.qhit.lh.g4.jer.t6.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * UserInfo entity. @author MyEclipse Persistence Tools
 */
/**
 * @author 偏晓阳
 * 2017年12月20日下午5:13:27
 * TODO
 */
public class UserInfo implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String userName;
	private String pwd;
	private Dpt dpt;
	private Emp emp;
	
	private Set<Role> roles = new HashSet<Role>();
	// Constructors

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	/** default constructor */
	public UserInfo() {
	}

	/** full constructor */
	public UserInfo(String userName, String pwd) {
		this.userName = userName;
		this.pwd = pwd;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Dpt getDpt() {
		return dpt;
	}

	public void setDpt(Dpt dpt) {
		this.dpt = dpt;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

}
package com.qhit.lh.g4.djh.t2.bean;

import java.util.HashSet;
import java.util.Set;

public class Userinfo {
	private int uid;
	private String uname;
	private String upswd;

	private Emp emp;
	//添加多对多关系对象
	private Set<Role> roles = new HashSet<>();

	public Userinfo(int uid, String uname, String upswd) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upswd = upswd;
	}

	public Userinfo(int uid, String uname, String upswd, Emp emp) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upswd = upswd;
		this.emp = emp;
	}

	public Userinfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpswd() {
		return upswd;
	}

	public void setUpswd(String upswd) {
		this.upswd = upswd;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}



}

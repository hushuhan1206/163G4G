package com.qhit.lh.g4.djh.t2.bean;

import java.util.HashSet;
import java.util.Set;

public class Role {
	private int rid;
	private String rName;
	private String memo;
	//添加多对多关系对象
	private Set<Userinfo> users = new HashSet<>();


	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(int rid, String rName, String memo) {
		super();
		this.rid = rid;
		this.rName = rName;
		this.memo = memo;
	}
	public Role(int rid, String rName, String memo, Set<Userinfo> users) {
		super();
		this.rid = rid;
		this.rName = rName;
		this.memo = memo;
		this.users = users;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Set<Userinfo> getUsers() {
		return users;
	}
	public void setUsers(Set<Userinfo> users) {
		this.users = users;
	}


}

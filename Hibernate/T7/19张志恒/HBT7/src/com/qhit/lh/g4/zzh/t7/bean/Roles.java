package com.qhit.lh.g4.zzh.t7.bean;

import java.util.HashSet;
import java.util.Set;

public class Roles {
	private int rid;
	private String roleName;
	private String memo;
	
	private Set<UserInfo> users = new HashSet<UserInfo>();

	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Roles(int rid, String roleName, String memo) {
		super();
		this.rid = rid;
		this.roleName = roleName;
		this.memo = memo;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Set<UserInfo> getUsers() {
		return users;
	}

	public void setUsers(Set<UserInfo> users) {
		this.users = users;
	}
}

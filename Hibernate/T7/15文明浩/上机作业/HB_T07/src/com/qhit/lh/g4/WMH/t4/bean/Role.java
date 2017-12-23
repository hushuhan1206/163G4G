package com.qhit.lh.g4.WMH.t4.bean;

import java.util.HashSet;
import java.util.Set;

public class Role {
	private int roleid;
	private String rolename;
	private String memo;

	//m-n
		private Set<UserInfo> uers=new HashSet<>();

	public Role(int roleid, String rolename, String memo, Set<UserInfo> uers) {
		super();
		this.roleid = roleid;
		this.rolename = rolename;
		this.memo = memo;
		this.uers = uers;
	}

	public Role(int roleid, String rolename, String memo) {
		super();
		this.roleid = roleid;
		this.rolename = rolename;
		this.memo = memo;
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Set<UserInfo> getUers() {
		return uers;
	}

	public void setUers(Set<UserInfo> uers) {
		this.uers = uers;
	}
		
}

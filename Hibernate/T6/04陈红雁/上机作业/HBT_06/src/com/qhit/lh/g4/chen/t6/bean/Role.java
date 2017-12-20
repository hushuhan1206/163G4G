package com.qhit.lh.g4.chen.t6.bean;

import java.util.HashSet;
import java.util.Set;

public class Role {

	private int roleId;
	private String roleName;
	private String memo;
	
	private Set<UserInfo> uers = new HashSet<>();

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(int roleId, String roleName, String memo, Set<UserInfo> uers) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.memo = memo;
		this.uers = uers;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
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

	public Set<UserInfo> getUers() {
		return uers;
	}

	public void setUers(Set<UserInfo> uers) {
		this.uers = uers;
	}
	
}

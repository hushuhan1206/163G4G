package com.qhit.lh.g4.jer.t8.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 偏晓阳
 * 2017年12月20日下午5:13:21
 * TODO
 */
public class Role {
	private int roleId;
	private String roleName;
	private String memo;
	
	private Set<UserInfo> users = new HashSet<UserInfo>();

	public Role(int roleId, String roleName, String memo, Set<UserInfo> users) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.memo = memo;
		this.users = users;
	}

	public Role(int roleId, String roleName, String memo) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.memo = memo;
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
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

	public Set<UserInfo> getUsers() {
		return users;
	}

	public void setUsers(Set<UserInfo> users) {
		this.users = users;
	}
	
}

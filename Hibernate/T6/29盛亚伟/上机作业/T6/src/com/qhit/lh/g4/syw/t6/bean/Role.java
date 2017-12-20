package com.qhit.lh.g4.syw.t6.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 盛亚伟
 *2017年12月20日下午4:11:06
 *TODO
 */
public class Role {
	private int roleId;
	private String roleName;
	private String memo;
	
	//添加多对多关系
	private Set<UserInfo> user = new HashSet<>();

	public Role(int roleId, String roleName, String memo, Set<UserInfo> user) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.memo = memo;
		this.user = user;
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

	public Set<UserInfo> getUser() {
		return user;
	}

	public void setUser(Set<UserInfo> user) {
		this.user = user;
	}
	
	
}

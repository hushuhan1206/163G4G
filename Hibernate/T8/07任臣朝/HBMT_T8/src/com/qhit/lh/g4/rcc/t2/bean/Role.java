/**
 * 
 */
package com.qhit.lh.g4.rcc.t2.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 任臣朝
 * TODO
 * 2017年12月20日下午5:36:53
 */
public class Role {
	private int roleId;
	private String roleName;
	private String memo;
	
	private Set<UserInfo> uers = new HashSet<>();

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

	public Role(int roleId, String roleName, String memo, Set<UserInfo> uers) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.memo = memo;
		this.uers = uers;
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setDept(Dept dept) {
		// TODO Auto-generated method stub
		
	}


	

}

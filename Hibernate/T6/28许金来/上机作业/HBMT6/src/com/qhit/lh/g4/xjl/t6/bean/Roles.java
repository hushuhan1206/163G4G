/**
 * 
 */
package com.qhit.lh.g4.xjl.t6.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 许金来
 *2017年12月20日下午3:52:24
 */
public class Roles {

	private int roleId;
	private String roleName;
	private String memo;
	
	private Set<UserInfo> userInfo = new HashSet<>();

	/**
	 * @param roleId
	 * @param roleName
	 * @param memo
	 * @param userInfos
	 */
	public Roles(int roleId, String roleName, String memo,
			Set<UserInfo> userInfo) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.memo = memo;
		this.userInfo = userInfo;
	}

	/**
	 * 
	 */
	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the roleId
	 */
	public int getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * @return the memo
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * @param memo the memo to set
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * @return the userInfos
	 */
	public Set<UserInfo> getUserInfo() {
		return userInfo;
	}

	/**
	 * @param userInfos the userInfos to set
	 */
	public void setUserInfo(Set<UserInfo> userInfo) {
		this.userInfo = userInfo;
	}
	
	
}

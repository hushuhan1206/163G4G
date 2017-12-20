/**
 * 
 */
package com.qhit.lh.g4.xjl.t6.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 许金来
 *2017年12月20日下午3:54:12
 */
public class UserInfo {

	private int userId;
	private String userName;
	private String upassword;
	
	
	private Set<Roles> roles = new HashSet<>();


	/**
	 * @param userId
	 * @param userName
	 * @param upassword
	 * @param roles
	 */
	public UserInfo(int userId, String userName, String upassword,
			Set<Roles> roles) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.upassword = upassword;
		this.roles = roles;
	}


	/**
	 * 
	 */
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}


	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}


	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}


	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}


	/**
	 * @return the upassword
	 */
	public String getUpassword() {
		return upassword;
	}


	/**
	 * @param upassword the upassword to set
	 */
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}


	/**
	 * @return the roles
	 */
	public Set<Roles> getRoles() {
		return roles;
	}


	/**
	 * @param roles the roles to set
	 */
	public void setRoles(Set<Roles> roles) {
		this.roles = roles;
	}
	
	
}

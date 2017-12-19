/**
 * 
 */
package com.qhit.lh.g4.ZWK.HB_T02.bean;

/**
 * @author ZWK
 *2017年12月12日下午2:56:23
 *TODO员工信息类
 */
public class UserInfo {
	 private int uid;
	 private String userName;
	 private String userPassword;
	 //一一对应的关系
	 private Emp emp ;
	 
	/**
	 * @param uid
	 * @param userName
	 * @param userPassword
	 * @param emp
	 */
	public UserInfo(int uid, String userName, String userPassword, Emp emp) {
		super();
		this.uid = uid;
		this.userName = userName;
		this.userPassword = userPassword;
		this.emp = emp;
	}

	/**
	 * @param uid
	 * @param userName
	 * @param userPassword
	 */
	public UserInfo(int uid, String userName, String userPassword) {
		super();
		this.uid = uid;
		this.userName = userName;
		this.userPassword = userPassword;
	}

	/**
	 * 
	 */
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the uid
	 */
	public int getUid() {
		return uid;
	}

	/**
	 * @param uid the uid to set
	 */
	public void setUid(int uid) {
		this.uid = uid;
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
	 * @return the userPassword
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * @param userPassword the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	/**
	 * @return the emp
	 */
	public Emp getEmp() {
		return emp;
	}

	/**
	 * @param emp the emp to set
	 */
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	 
	 
	 
}

/**
 * 
 */
package com.qhit.lh.g4.zzh.t2.bean;

/**
 * @author S01
 * TODO
 * 2017年12月12日下午2:55:23
 */
public class UserInfo {
	private int uid;
	private String uname;
	private String password;
	
	private Emp emp;

	/**
	 * @param uid
	 * @param uname
	 * @param password
	 * @param emp
	 */
	public UserInfo(int uid, String uname, String password, Emp emp) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.password = password;
		this.emp = emp;
	}

	/**
	 * @param uid
	 * @param uname
	 * @param password
	 */
	public UserInfo(int uid, String uname, String password) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.password = password;
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
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}

	/**
	 * @param uname the uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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

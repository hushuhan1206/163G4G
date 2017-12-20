package com.qhit.lh.g4.zs.t4.bean;

/**
 * UserInfo entity. @author MyEclipse Persistence Tools
 */

public class UserInfo implements java.io.Serializable {

	// Fields

	private Integer uid;
	private String uname;
	private String upwd;

	// Constructors
	private Emp emp;
	/** default constructor */
	public UserInfo() {
	}

	/** full constructor */
	public UserInfo(String uname, String upwd) {
		this.uname = uname;
		this.upwd = upwd;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return this.upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

}
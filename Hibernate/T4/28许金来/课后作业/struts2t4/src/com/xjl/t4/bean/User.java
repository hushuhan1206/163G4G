package com.xjl.t4.bean;

public class User {

	private int eid;
	private String uname;
	private String upwd;
	private String edu;
	private int sex;
	
	
	public User( int eid,String uname, String upwd,String edu, int sex) {
		super();
		this.eid = eid;
		this.uname = uname;
		this.upwd = upwd;
		this.edu = edu;
		this.sex = sex;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the eid
	 */
	public int getEid() {
		return eid;
	}


	/**
	 * @param eid the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getUpwd() {
		return upwd;
	}


	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}


	public String getEdu() {
		return edu;
	}


	public void setEdu(String edu) {
		this.edu = edu;
	}


	public int getSex() {
		return sex;
	}


	public void setSex(int sex) {
		this.sex = sex;
	}
}

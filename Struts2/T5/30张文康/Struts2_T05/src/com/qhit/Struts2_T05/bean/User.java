package com.qhit.Struts2_T05.bean;

public class User {
	
	private int uid;
	private String uname;
	private String upwd;
	private String birthday;
	private String sex;
	private int active;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
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
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public User(int uid, String uname, String upwd, String birthday, String sex, int active) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.birthday = birthday;
		this.sex = sex;
		this.active = active;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

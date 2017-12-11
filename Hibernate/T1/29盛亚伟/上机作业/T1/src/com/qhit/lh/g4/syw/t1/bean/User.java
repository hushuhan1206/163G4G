package com.qhit.lh.g4.syw.t1.bean;

public class User {

	private int uId;
 	private String uname;
 	private String upwd;
 	private String birthday;
 	private String sex;
 	private int enable;
 	
 	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int uId, String uname, String upwd, String birthday,
			String sex, int enable) {
		super();
		this.uId = uId;
		this.uname = uname;
		this.upwd = upwd;
		this.birthday = birthday;
		this.sex = sex;
		this.enable = enable;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
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
	public int getEnable() {
		return enable;
	}
	public void setEnable(int enable) {
		this.enable = enable;
	}
 	
 	
}

package com.sea.t6.bean;

public class User {
	private String uname;  //用户名
	private String upwd; //密码
	private String description; //描述
	private int sex=1;    //性别
	private String province; //省份
	private String[] hobby; //爱好
	
	public User(String uname, String upwd, String description, int sex, String province, String[] hobby) {
		super();
		this.uname = uname;
		this.upwd = upwd;
		this.description = description;
		this.sex = sex;
		this.province = province;
		this.hobby = hobby;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
}

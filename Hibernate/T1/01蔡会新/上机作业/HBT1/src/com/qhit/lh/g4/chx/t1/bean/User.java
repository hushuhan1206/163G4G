package com.qhit.lh.g4.chx.t1.bean;

/**
 * @author chx
 * 封装user
 */
public class User {
	private int uid;	
	private String name;
	private String password;
	private String birthday;
	private int sex;
	private String enable;


	public User(int uid, String name, String password, String birthday, int sex,
			String enable) {
		super();
		this.uid = uid;
		this.name = name;
		this.password = password;
		this.birthday = birthday;
		this.sex = sex;
		this.enable = enable;
	}
	public User(String name, String password, String birthday, int sex,
			String enable) {
		super();
		this.name = name;
		this.password = password;
		this.birthday = birthday;
		this.sex = sex;
		this.enable = enable;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getEnable() {
		return enable;
	}
	public void setEnable(String enable) {
		this.enable = enable;
	}
	@Override
	public String toString() {
		return  uid + "|" + name + "|" + password
				+ "|" + birthday + "|" + sex + "|"
				+ enable;
	}
	
}

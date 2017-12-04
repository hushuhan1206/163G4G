package com.syw.t6.bean;

public class User {

	private int id;
	private String uname;
	private String upwd;
	private String birthday;
	private String sex;
	private int enable;
	public User(int id, String uname, String upwd, String birthday, String sex, int enable) {
		super();
		this.id = id;
		this.uname = uname;
		this.upwd = upwd;
		this.birthday = birthday;
		this.sex = sex;
		this.enable = enable;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the upwd
	 */
	public String getUpwd() {
		return upwd;
	}
	/**
	 * @param upwd the upwd to set
	 */
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	/**
	 * @return the birthday
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the enable
	 */
	public int getEnable() {
		return enable;
	}
	/**
	 * @param enable the enable to set
	 */
	public void setEnable(int enable) {
		this.enable = enable;
	}
}

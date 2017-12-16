package com.qhit.lh.g4.lzk.t2.bean;

/**
 * @author 李志凯
 * TODO 
 * 2017年12月12日下午2:48:23
 */
public class Emp {
	private int eid;
	private String ename;
	private String sex;
	private int age;
	
	private UserInfo userInfo;

	/**
	 * @param eid
	 * @param ename
	 * @param sex
	 * @param age
	 * @param userInfo
	 */
	public Emp(int eid, String ename, String sex, int age, UserInfo userInfo) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sex = sex;
		this.age = age;
		this.userInfo = userInfo;
	}
	
	/**
	 * @param eid
	 * @param ename
	 * @param sex
	 * @param age
	 */
	public Emp(int eid, String ename, String sex, int age) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sex = sex;
		this.age = age;
	}

	/**
	 * 
	 */
	public Emp() {
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

	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}

	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the userInfo
	 */
	public UserInfo getUserInfo() {
		return userInfo;
	}

	/**
	 * @param userInfo the userInfo to set
	 */
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	@Override
	public String toString() {
		return eid + "|" + ename + "|" + sex
				+ "|" + age + "|" + userInfo.getUname() + " | " + userInfo.getPassword();
	}
	
}

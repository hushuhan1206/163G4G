package com.qhit.lh.g4.zzh.t3.bean;

/**
 * Emp entity. @author MyEclipse Persistence Tools
 */

public class Emp implements java.io.Serializable {

	// Fields

	private Integer eid;
	private String ename;
	private String sex;
	private Integer age;
	private Integer did;
	
	private UserInfo userinfo;
	private Dept dept;

	// Constructors
	
	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	/** default constructor */
	public Emp() {
	}

	public UserInfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}

	/** minimal constructor */
	public Emp(String ename, String sex) {
		this.ename = ename;
		this.sex = sex;
	}

	/** full constructor */
	public Emp(String ename, String sex, Integer age, Integer did) {
		this.ename = ename;
		this.sex = sex;
		this.age = age;
		this.did = did;
	}

	// Property accessors

	public Integer getEid() {
		return this.eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getDid() {
		return this.did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	@Override
	public String toString() {
		return eid + "|" + ename + "|" + sex
				+ ", age=" + age + "|" + did + "|" + userinfo
				+ "|" + dept + userinfo.getUname() + userinfo.getPassword();
	}
	
}
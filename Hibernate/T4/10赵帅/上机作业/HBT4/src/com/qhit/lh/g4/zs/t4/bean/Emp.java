package com.qhit.lh.g4.zs.t4.bean;

/**
 * Emp entity. @author MyEclipse Persistence Tools
 */

public class Emp implements java.io.Serializable {

	// Fields

	private Integer eid;
	private String ename;
	private String esex;
	private String ebirthday;
	private Integer dept;

	// Constructors
	private Dept depts;
	private UserInfo userinfo;
	/** default constructor */
	public Emp() {
	}

	/** full constructor */
	public Emp(String ename, String esex, String ebirthday, Integer dept) {
		this.ename = ename;
		this.esex = esex;
		this.ebirthday = ebirthday;
		this.dept = dept;
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

	public String getEsex() {
		return this.esex;
	}

	public void setEsex(String esex) {
		this.esex = esex;
	}

	public String getEbirthday() {
		return this.ebirthday;
	}

	public void setEbirthday(String ebirthday) {
		this.ebirthday = ebirthday;
	}

	public Integer getDept() {
		return this.dept;
	}

	public void setDept(Integer dept) {
		this.dept = dept;
	}

	public Dept getDepts() {
		return depts;
	}

	public void setDepts(Dept depts) {
		this.depts = depts;
	}

	public UserInfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}
	
}
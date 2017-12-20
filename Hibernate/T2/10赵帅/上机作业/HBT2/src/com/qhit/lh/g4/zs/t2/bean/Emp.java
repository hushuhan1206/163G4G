package com.qhit.lh.g4.zs.t2.bean;

/**
 * Emp entity. @author MyEclipse Persistence Tools
 */

public class Emp implements java.io.Serializable {

	// Fields

	private Integer oid;
	private String ename;
	private String sex;
	private String birthday;
	private Integer deptid;

	private UserInfo userinfo;
	// Constructors

	/** default constructor */
	public Emp() {
	}

	/** minimal constructor */
	public Emp(String ename, String sex, String birthday) {
		this.ename = ename;
		this.sex = sex;
		this.birthday = birthday;
	}

	/** full constructor */
	public Emp(String ename, String sex, String birthday, Integer deptid) {
		this.ename = ename;
		this.sex = sex;
		this.birthday = birthday;
		this.deptid = deptid;
	}

	// Property accessors

	public Integer getOid() {
		return this.oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
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

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getDeptid() {
		return this.deptid;
	}

	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}

	public UserInfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return oid+"|"+ename+"|"+sex+"|"+birthday+"|"+deptid+"|"+userinfo.getUname()+"|"+userinfo.getPwd();
	}
}
package com.qhit.lh.g4.jer.t6.bean;

/**
 * Emp entity. @author MyEclipse Persistence Tools
 */

/**
 * @author 偏晓阳
 * 2017年12月20日下午5:13:15
 * TODO
 */
public class Emp implements java.io.Serializable {

	// Fields

	private Integer eid;
	private String empName;
	private String birthday;
	private Integer empSex;
	private Dpt dpt;
	private UserInfo userInfo;
	
	
	// Constructors

	/** default constructor */
	public Emp() {
	}

	/** full constructor */
	public Emp(String empName, String birthday, Integer empSex) {
		this.empName = empName;
		this.birthday = birthday;
		this.empSex = empSex;
	}

	// Property accessors

	public Integer getEid() {
		return this.eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getEmpSex() {
		return this.empSex;
	}

	public void setEmpSex(Integer empSex) {
		this.empSex = empSex;
	}

	public Dpt getDpt() {
		return dpt;
	}

	public void setDpt(Dpt dpt) {
		this.dpt = dpt;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
	public String toString() {
		return empName + userInfo.getUserName() + dpt.getDname();
	}
}
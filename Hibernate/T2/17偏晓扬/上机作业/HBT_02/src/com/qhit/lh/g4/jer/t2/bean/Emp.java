package com.qhit.lh.g4.jer.t2.bean;

import org.hibernate.loader.custom.Return;

public class Emp {
	private int eid;	
	private String empName;
	private String birthday;
	private int empSex;
	private UserInfo userInfo;
	
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int eid, String empName, String birthday, int empSex,
			UserInfo userInfo) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.birthday = birthday;
		this.empSex = empSex;
		this.userInfo = userInfo;
	}
	
	public Emp(int eid, String empName, String birthday, int empSex) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.birthday = birthday;
		this.empSex = empSex;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getEmpSex() {
		return empSex;
	}

	public void setEmpSex(int empSex) {
		this.empSex = empSex;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
	public String toString(){
		return eid + "|" +empName + "|" + empSex + "|" +birthday + "|" + userInfo.getUserName() + "|" + userInfo.getPassword();
	}
	
	
}

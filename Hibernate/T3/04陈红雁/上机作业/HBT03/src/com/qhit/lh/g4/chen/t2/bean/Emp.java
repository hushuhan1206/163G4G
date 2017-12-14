package com.qhit.lh.g4.chen.t2.bean;

public class Emp {
	private int Eid;
	private String Ename;
	private String Sex;
	private String birthday;
	

	private UserInfo userinfo;
	private Dept dept;


	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Emp(int eid, String ename, String sex, String birthday,
			UserInfo userinfo) {
		super();
		Eid = eid;
		Ename = ename;
		Sex = sex;
		this.birthday = birthday;
		this.userinfo = userinfo;
	}


	public int getEid() {
		return Eid;
	}


	public void setEid(int eid) {
		Eid = eid;
	}


	public String getEname() {
		return Ename;
	}


	public void setEname(String ename) {
		Ename = ename;
	}


	public String getSex() {
		return Sex;
	}


	public void setSex(String sex) {
		Sex = sex;
	}


	public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	public UserInfo getUserinfo() {
		return userinfo;
	}


	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}


	public void setDept(Dept dept2) {
		// TODO Auto-generated method stub
		
	}
	
	public String toString(){
		return Ename+userinfo.getUname()+dept.getDname();
	}
}

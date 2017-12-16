package com.qhit.lh.g4.djh.t2.bean;

public class Emp {
	private int eid;
	private String ename;
	private String sex;
	private String birth;
	private int deptid;
	
	private Userinfo userinfo;

	
	public Emp(int eid, String ename, String sex, String birth, int deptid) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sex = sex;
		this.birth = birth;
		this.deptid = deptid;
	}

	public Emp(int eid, String ename, String sex, String birth, int deptid,
			Userinfo userinfo) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sex = sex;
		this.birth = birth;
		this.deptid = deptid;
		this.userinfo = userinfo;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public Userinfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", sex=" + sex
				+ ", birth=" + birth + ", deptid=" + deptid + ", uid="
				+ userinfo.getUid() + "]";
	}
	
	
}

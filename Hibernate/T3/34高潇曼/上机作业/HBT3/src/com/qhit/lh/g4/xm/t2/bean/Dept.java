package com.qhit.lh.g4.xm.t2.bean;

public class Dept {
	
	private int deptid;
	private String dname;
	private String daddress;
	
	
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(int deptid, String dname, String daddress) {
		super();
		this.deptid = deptid;
		this.dname = dname;
		this.daddress = daddress;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDaddress() {
		return daddress;
	}
	public void setDaddress(String daddress) {
		this.daddress = daddress;
	}
	
	
}

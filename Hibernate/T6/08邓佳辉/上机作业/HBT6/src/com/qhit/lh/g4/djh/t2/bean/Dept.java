package com.qhit.lh.g4.djh.t2.bean;

import java.util.Set;

public class Dept {

	private int deptid;
	private String dname;
	private String daddress;

	private Set<Emp> emps;

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
	public Set<Emp> getEmps() {
		return emps;
	}
	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}


}

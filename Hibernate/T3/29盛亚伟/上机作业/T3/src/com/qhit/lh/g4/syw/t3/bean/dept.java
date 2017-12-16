package com.qhit.lh.g4.syw.t3.bean;

public class dept {
	private int deptId;
	private String deptName;
	private String 	address;
	public dept(int deptId, String deptName, String address) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.address = address;
	}
	public dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

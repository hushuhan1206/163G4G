package com.qhit.lh.g4.hsj.t02.bean;

public class Dept {
	private int deptId;
	private String deptName;
	private String deptAdress;
	public Dept(int deptId, String deptName, String deptAdress) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptAdress = deptAdress;
	}
	public Dept() {
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
	public String getDeptAdress() {
		return deptAdress;
	}
	public void setDeptAdress(String deptAdress) {
		this.deptAdress = deptAdress;
	}
	
	
}

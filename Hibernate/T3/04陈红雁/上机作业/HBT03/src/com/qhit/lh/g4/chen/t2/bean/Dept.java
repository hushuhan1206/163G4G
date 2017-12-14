package com.qhit.lh.g4.chen.t2.bean;

public class Dept {

	private int deptId;
	private String Dname;
	

	private Emp emp;


	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Dept(int deptId, String dname, Emp emp) {
		super();
		this.deptId = deptId;
		Dname = dname;
		this.emp = emp;
	}


	public int getDeptId() {
		return deptId;
	}


	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}


	public String getDname() {
		return Dname;
	}


	public void setDname(String dname) {
		Dname = dname;
	}


	public Emp getEmp() {
		return emp;
	}


	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
}

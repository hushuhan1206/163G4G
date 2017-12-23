package com.qhit.lh.g4.wcx.t6.bean;

import java.util.HashSet;
import java.util.Set;

public class Dept {
	private int deptId;
	private String deptName;
	private String deptAdress;
	
	private Set<Emp> emps = new HashSet<>();
	
	public Dept() {
		super();
	}
	
	public Dept(int deptId, String deptName, String deptAdress) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptAdress = deptAdress;
	}
	
	public Set<Emp> getEmps() {
		return emps;
	}
	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
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

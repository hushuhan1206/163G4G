package com.qhit.lh.g4.rcc.t2.bean;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("serial")
public class Dept implements java.io.Serializable {
	
	
	private Integer deptId;
	private String deptName;
	private String address;
	
	private Set<Emp> emps = new HashSet<>();
	
	public Set<Emp> getEmps() {
		return emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}

	public Dept(){
		
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
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

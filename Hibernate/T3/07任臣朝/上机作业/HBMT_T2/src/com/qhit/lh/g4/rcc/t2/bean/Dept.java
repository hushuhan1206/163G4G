package com.qhit.lh.g4.rcc.t2.bean;

public class Dept implements java.io.Serializable {
	
	
	private Integer deptId;
	private String deptName;
	private String address;
	
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

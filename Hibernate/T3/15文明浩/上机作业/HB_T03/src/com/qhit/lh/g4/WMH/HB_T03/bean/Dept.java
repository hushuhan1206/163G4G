package com.qhit.lh.g4.WMH.HB_T03.bean;

/**
 * Dept entity. @author MyEclipse Persistence Tools
 */

public class Dept implements java.io.Serializable {

	// Fields

	private Integer depId;
	private String deptName;
	private String address;

	// Constructors

	/** default constructor */
	public Dept() {
	}

	/** full constructor */
	public Dept(String deptName, String address) {
		this.deptName = deptName;
		this.address = address;
	}

	// Property accessors

	public Integer getDepId() {
		return this.depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
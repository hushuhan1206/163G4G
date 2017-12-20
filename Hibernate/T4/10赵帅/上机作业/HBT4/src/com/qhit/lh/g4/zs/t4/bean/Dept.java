package com.qhit.lh.g4.zs.t4.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Dept entity. @author MyEclipse Persistence Tools
 */

public class Dept implements java.io.Serializable {

	// Fields

	private Integer did;
	private String dname;
	private String daddress;

	// Constructors
	private Set<Emp> emp = new HashSet();
	/** default constructor */
	public Dept() {
	}

	/** full constructor */
	public Dept(String dname, String daddress) {
		this.dname = dname;
		this.daddress = daddress;
	}

	// Property accessors

	public Integer getDid() {
		return this.did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDaddress() {
		return this.daddress;
	}

	public void setDaddress(String daddress) {
		this.daddress = daddress;
	}
	
	public Set<Emp> getEmp() {
		return emp;
	}

	public void setEmp(Set<Emp> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
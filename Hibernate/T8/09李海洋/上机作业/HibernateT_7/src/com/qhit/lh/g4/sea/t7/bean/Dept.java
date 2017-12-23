package com.qhit.lh.g4.sea.t7.bean;

import java.util.HashSet;
import java.util.Set;



/**
 * Dept entity. @author MyEclipse Persistence Tools
 */

public class Dept implements java.io.Serializable {

	// Fields

	private Integer did;
	private String dname;
	private String dadress;
	
	private Set<Emp> emps = new HashSet<>();
	// Constructors

	/** default constructor */
	public Dept() {
	}

	/** full constructor */
	public Dept(String dname, String dadress) {
		this.dname = dname;
		this.dadress = dadress;
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

	public String getDadress() {
		return this.dadress;
	}

	public void setDadress(String dadress) {
		this.dadress = dadress;
	}

	public Set<Emp> getEmps() {
		return emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}

}
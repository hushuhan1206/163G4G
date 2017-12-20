package com.qhit.lh.g4.jer.t5.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Dpt entity. @author MyEclipse Persistence Tools
 */

/**
 * @author 偏晓阳
 * 2017年12月19日上午11:07:15
 * TODO
 */
public class Dpt implements java.io.Serializable {

	// Fields

	private Integer did;
	private String dname;
	private String dadd;

	// 1-n的关联：当前部门有哪些员工
	private Set<Emp> emps = new HashSet<Emp>();
	
	
	public Set<Emp> getEmps() {
		return emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}

	/** default constructor */
	public Dpt() {
	}

	/** full constructor */
	public Dpt(String dname, String dadd) {
		this.dname = dname;
		this.dadd = dadd;
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

	public String getDadd() {
		return this.dadd;
	}

	public void setDadd(String dadd) {
		this.dadd = dadd;
	}

}
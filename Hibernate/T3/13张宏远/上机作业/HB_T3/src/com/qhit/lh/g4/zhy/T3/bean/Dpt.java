package com.qhit.lh.g4.zhy.T3.bean;

/**
 * Dpt entity. @author MyEclipse Persistence Tools
 */

/**
 * @author 张宏远
 * 2017年12月13日下午8:45:13
 * TODO
 */
public class Dpt implements java.io.Serializable {

	// Fields

	private Integer did;
	private String dname;
	private String dadd;

	// Constructors

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
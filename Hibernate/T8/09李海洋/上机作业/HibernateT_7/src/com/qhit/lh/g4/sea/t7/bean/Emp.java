package com.qhit.lh.g4.sea.t7.bean;


/**
 * Emp entity. @author MyEclipse Persistence Tools
 */

public class Emp implements java.io.Serializable {

	// Fields

	private Integer eid;
	private String ename;
	private String esex;
	private String ebirth;
	private Integer did;
	
	
	private Dept dept;
	// Constructors

	/** default constructor */
	public Emp() {
	}

	/** minimal constructor */
	public Emp(String ename, String esex, String ebirth) {
		this.ename = ename;
		this.esex = esex;
		this.ebirth = ebirth;
	}

	/** full constructor */
	public Emp(String ename, String esex, String ebirth, Integer did) {
		this.ename = ename;
		this.esex = esex;
		this.ebirth = ebirth;
		this.did = did;
	}

	// Property accessors

	public Integer getEid() {
		return this.eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEsex() {
		return this.esex;
	}

	public void setEsex(String esex) {
		this.esex = esex;
	}

	public String getEbirth() {
		return this.ebirth;
	}

	public void setEbirth(String ebirth) {
		this.ebirth = ebirth;
	}

	public Integer getDid() {
		return this.did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ename + "  "+this.esex+ "  "+this.ebirth;
	}
}
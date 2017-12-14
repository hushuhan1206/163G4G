/**
 * 
 */
package com.qhit.lh.g4.sea.t3.bean;

import java.util.Date;

/**
 * @author 李海洋
 *TODO
 *2017年12月11日下午3:54:43
 */
public class Emp {
	private Integer eid;
	private String ename;
	private String esex;
	private Date ebirth;
	private Integer did;
	
	private Dept dept;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Integer eid, String ename, String esex, Date ebirth,
			Integer did, Dept dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esex = esex;
		this.ebirth = ebirth;
		this.did = did;
		this.dept = dept;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEsex() {
		return esex;
	}

	public void setEsex(String esex) {
		this.esex = esex;
	}

	public Date getEbirth() {
		return ebirth;
	}

	public void setEbirth(Date ebirth) {
		this.ebirth = ebirth;
	}

	public Integer getDid() {
		return did;
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
}

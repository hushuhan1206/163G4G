/**
 * 
 */
package com.qhit.lh.g4.sea.t2.bean;

import java.util.Date;

/**
 * @author 李海洋
 *TODO
 *2017年12月10日下午9:53:56
 */
public class Emp {
	private int eid;
	private String ename;
	private String esex;
	private Date ebirth;
	
	private EmpInfo empInfo;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int eid, String ename, String esex, Date ebirth, EmpInfo empInfo) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esex = esex;
		this.ebirth = ebirth;
		this.empInfo = empInfo;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
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

	public EmpInfo getEmpInfo() {
		return empInfo;
	}

	public void setEmpInfo(EmpInfo empInfo) {
		this.empInfo = empInfo;
	}
}

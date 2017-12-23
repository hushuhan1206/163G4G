package com.qhit.lh.g4.chen.t8.bean;

import java.util.HashSet;
import java.util.Set;

public class Dept {

	private int deptId;
	private String Dname;
	private String Adress;


	/**
	 * @author 陈红雁
	 * 2017年12月23日上午9:31:41
	 * TODO
	 */

	private Emp emp;
	
	private Set<Emp> emps = new HashSet<>();


	public Set<Emp> getEmps() {
		return emps;
	}


	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}
	
	public String getAdress() {
		return Adress;
	}


	public void setAdress(String adress) {
		Adress = adress;
	}


	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Dept(int deptId, String dname, Emp emp) {
		super();
		this.deptId = deptId;
		Dname = dname;
		this.emp = emp;
	}


	public int getDeptId() {
		return deptId;
	}


	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}


	public String getDname() {
		return Dname;
	}


	public void setDname(String dname) {
		Dname = dname;
	}


	public Emp getEmp() {
		return emp;
	}


	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
}

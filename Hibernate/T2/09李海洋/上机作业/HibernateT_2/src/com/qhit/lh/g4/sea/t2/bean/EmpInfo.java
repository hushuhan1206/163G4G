/**
 * 
 */
package com.qhit.lh.g4.sea.t2.bean;

/**
 * @author 李海洋
 *TODO
 *2017年12月10日下午9:56:28
 */
public class EmpInfo {
	private int id;
	private String name;
	private String pwd;
	
	private Emp emp;

	public EmpInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpInfo(int id, String name, String pwd, Emp emp) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.emp = emp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}
}

package com.qhit.lh.g4.chen.t5.bean;

/**
 * @author 陈红雁
 *2017年12月19日上午11:09:39
 *TODO
 */
public class UserInfo {
	private int Uid;
	private String Uname;
	private String Password;

	
	private Emp emp;

	
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserInfo(int uid, String uname, String password, Emp emp) {
		super();
		Uid = uid;
		Uname = uname;
		Password = password;
		this.emp = emp;
	}


	public int getUid() {
		return Uid;
	}


	public void setUid(int uid) {
		Uid = uid;
	}


	public String getUname() {
		return Uname;
	}


	public void setUname(String uname) {
		Uname = uname;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public Emp getEmp() {
		return emp;
	}


	public void setEmp(Emp emp) {
		this.emp = emp;
	}


}

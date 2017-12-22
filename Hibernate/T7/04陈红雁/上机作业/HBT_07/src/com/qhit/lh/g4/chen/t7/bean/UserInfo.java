package com.qhit.lh.g4.chen.t7.bean;

import java.util.HashSet;
import java.util.Set;

import antlr.JavaCodeGeneratorPrintWriterManager;

public class UserInfo implements java.io.Serializable{
	private int Uid;
	private static String Uname;
	private String Password;

	
	private Emp emp;

	private Set<Role> roles = new HashSet<>();
	
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


	public static String getUname() {
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

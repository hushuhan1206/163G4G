package com.qhit.lh.g4.shutu.t2.been;
/**
 * @author S01
 *2017年12月16日上午9:31:50
 *TODO
 */
public class Userinfo {
private int  uid;
private String uname;
private String upwd;
private Emp emp;



public Userinfo() {
	super();
	// TODO Auto-generated constructor stub
}
public Userinfo(int uid, String uname, String upwd, Emp emp) {
	super();
	this.uid = uid;
	this.uname = uname;
	this.upwd = upwd;
	this.emp = emp;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpwd() {
	return upwd;
}
public void setUpwd(String upwd) {
	this.upwd = upwd;
}
public Emp getEmp() {
	return emp;
}
public void setEmp(Emp emp) {
	this.emp = emp;
}


}

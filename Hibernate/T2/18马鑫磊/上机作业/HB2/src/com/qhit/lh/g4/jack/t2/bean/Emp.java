package com.qhit.lh.g4.jack.t2.bean;

public class Emp {
private int eid;
private String ename;
private String esex;
private String ebirthday;
private String edid;
private Userinfo userinfo;


public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
public Emp(int eid, String ename, String esex, String ebirthday, String edid,
		Userinfo userinfo) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esex = esex;
	this.ebirthday = ebirthday;
	this.edid = edid;
	this.userinfo = userinfo;
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
public String getEbirthday() {
	return ebirthday;
}
public void setEbirthday(String ebirthday) {
	this.ebirthday = ebirthday;
}
public String getEdid() {
	return edid;
}
public void setEdid(String edid) {
	this.edid = edid;
}
public Userinfo getUserinfo() {
	return userinfo;
}
public void setUserinfo(Userinfo userinfo) {
	this.userinfo = userinfo;
}
@Override
public String toString() {
	return "Emp [eid=" + eid + ", ename=" + ename + ", esex=" + esex
			+ ", ebirthday=" + ebirthday + ", edid=" + edid + ", uid="
			+ userinfo.getUid()+",uname="+userinfo.getUname()+",upwd="+userinfo.getUpwd()+"]";
}


}

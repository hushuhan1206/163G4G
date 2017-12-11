/**
 * 
 */
package com.qhit.lh.g4.xjl.t1.bean;

/**
 * @author 许金来
 *2017年12月9日上午10:33:11
 *TODO
 */
public class User {

	private int id;
	private String uname;
	private String upwd;
	private String birthday;
	private String sex;
	private String address;
	public User(int id, String uname, String upwd, String birthday, String sex, String address) {
		super();
		this.id = id;
		this.uname = uname;
		this.upwd = upwd;
		this.birthday = birthday;
		this.sex = sex;
		this.address = address;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString(){
		return this.uname+""+this.birthday+this.sex+this.address;
	}
}

package com.qhit.lh.g4.zs.t6.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Roles entity. @author MyEclipse Persistence Tools
 */

public class Roles implements java.io.Serializable {

	// Fields

	private Integer rid;
	private String rname;
	private String rmemo;

	// Constructors
	private Set<UserInfo> userinfos =new HashSet<UserInfo>();
	/** default constructor */
	public Roles() {
	}

	/** full constructor */
	public Roles(String rname, String rmemo) {
		this.rname = rname;
		this.rmemo = rmemo;
	}

	// Property accessors

	public Integer getRid() {
		return this.rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public String getRname() {
		return this.rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getRmemo() {
		return this.rmemo;
	}

	public void setRmemo(String rmemo) {
		this.rmemo = rmemo;
	}

	public Set<UserInfo> getUserinfos() {
		return userinfos;
	}

	public void setUserinfos(Set<UserInfo> userinfos) {
		this.userinfos = userinfos;
	}

}
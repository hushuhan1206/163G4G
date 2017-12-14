/**
 * 
 */
package com.qhit.lh.g4.sea.t3.bean;

/**
 * @author 李海洋
 *TODO
 *2017年12月11日下午3:55:44
 */
public class Dept {
	private Integer did;
	private String dname;
	private String dadress;
	
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(Integer did, String dname, String dadress) {
		super();
		this.did = did;
		this.dname = dname;
		this.dadress = dadress;
	}
	
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDadress() {
		return dadress;
	}
	public void setDadress(String dadress) {
		this.dadress = dadress;
	}
}

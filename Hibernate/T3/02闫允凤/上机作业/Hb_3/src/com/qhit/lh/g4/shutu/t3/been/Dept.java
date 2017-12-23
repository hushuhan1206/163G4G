/**
 * 
 */
package com.qhit.lh.g4.shutu.t3.been;
/**
 * @author S01
 *2017年12月16日上午10:20:02
 *TODO
 */

public class Dept implements java.io.Serializable {

	// Fields

	private Integer did;
	private String dname;
	private String daddress;

	// Constructors

	/** default constructor */
	public Dept() {
	}

	/** full constructor */
	public Dept(String dname, String daddress) {
		this.dname = dname;
		this.daddress = daddress;
	}

	// Property accessors

	public Integer getDid() {
		return this.did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDaddress() {
		return this.daddress;
	}

	public void setDaddress(String daddress) {
		this.daddress = daddress;
	}

}
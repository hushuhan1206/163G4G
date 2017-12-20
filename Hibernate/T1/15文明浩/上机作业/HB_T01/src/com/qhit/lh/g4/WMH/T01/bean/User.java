/**
 * 
 */
package com.qhit.lh.g4.WMH.T01.bean;

/**
 * @author WMH
 *2017年12月9日上午10:36:07
 *TODO
 */
public class User {
	private int uid;
	private String uname;
	private String upwd;
	private String sex;
	private String  birthday ;
	private int enable;
	
	/**
	 * @return the uid
	 */
	public int getUid() {
		return uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUid(int uid) {
		this.uid = uid;
	}
	/**
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}
	/**
	 * @param uname the uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}
	/**
	 * @return the upwd
	 */
	public String getUpwd() {
		return upwd;
	}
	/**
	 * @param upwd the upwd to set
	 */
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the birthday
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	/**
	 * @return the enable
	 */
	public int getEnable() {
		return enable;
	}
	/**
	 * @param enable the enable to set
	 */
	public void setEnable(int enable) {
		this.enable = enable;
	}
	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param uid
	 * @param uname
	 * @param upwd
	 * @param sex
	 * @param birthday
	 * @param enable
	 */
	public User(int uid, String uname, String upwd, String sex,
			String birthday, int enable) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.sex = sex;
		this.birthday = birthday;
		this.enable = enable;
	}
	
	
	
}

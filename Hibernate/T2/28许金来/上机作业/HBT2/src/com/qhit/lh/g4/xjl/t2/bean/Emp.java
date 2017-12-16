/**
 * 
 */
package com.qhit.lh.g4.xjl.t2.bean;

/**
 * @author 许金来
 *2017年12月12日下午3:02:24
 * 员工
 * 添加一对一关系映射
 */
public class Emp {

	private int eid;
	private String empName;
	private String empSex;
	private String birthday;
	private int deptId;
	
	private UserInfo userInfo;

	
	/**
	 * @param eid
	 * @param empName
	 * @param empSex
	 * @param birthday
	 * @param deptId
	 * @param userInfo
	 */
	public Emp(int eid, String empName, String empSex, String birthday,
			int deptId, UserInfo userInfo) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.empSex = empSex;
		this.birthday = birthday;
		this.deptId = deptId;
		this.userInfo = userInfo;
	}
	/**
	 * @return the eid
	 */
	public int getEid() {
		return eid;
	}


	/**
	 * @param eid the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}


	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}


	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}


	/**
	 * @return the empSex
	 */
	public String getEmpSex() {
		return empSex;
	}


	/**
	 * @param empSex the empSex to set
	 */
	public void setEmpSex(String empSex) {
		this.empSex = empSex;
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
	 * @return the deptId
	 */
	public int getDeptId() {
		return deptId;
	}


	/**
	 * @param deptId the deptId to set
	 */
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}


	/**
	 * @return the userInfo
	 */
	public UserInfo getUserInfo() {
		return userInfo;
	}


	/**
	 * @param userInfo the userInfo to set
	 */
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}


	/**
	 * 
	 */
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return eid+"|"+empName+"|"+empSex+"|"+birthday+"|"+deptId+"|"+userInfo.getUserName()+"|"+userInfo.getPasword()+"|";
	}
}

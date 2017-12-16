package com.qhit.lh.g4.syw.t4.bean;



/**
 * @author 盛亚伟
 *2017年12月15日上午9:54:43
 *TODO
 *员工类
 */
public class Emp {
	//添加参数
	private int eid;
	private String empName;
	private String empSex;
	private String birthday;
	private int deptId;
	
	private UserInfo userinfo;
	private com.qhit.lh.g4.syw.t4.bean.Dept dept;
	//一对一关系对应的对象
	private Emp emp;
	//添加有参构造方法，无参构造方法和get，set方法
	public Emp(int eid, String empName, String empSex, String birthday,
			int deptId) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.empSex = empSex;
		this.birthday = birthday;
		this.deptId = deptId;
	}
	public Emp(int eid, String empName, String empSex, String birthday) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.empSex = empSex;
		this.birthday = birthday;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpSex() {
		return empSex;
	}
	public void setEmpSex(String empSex) {
		this.empSex = empSex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + empName + ", sex=" + empSex
				+ ", birth=" + birthday + ", deptid=" + deptId + ", uid="
				+ UserInfo.getUid() + "]";
	}
	public void setUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		
	}
	public void setDept(Dept dept2) {
		// TODO Auto-generated method stub
		
	}

}

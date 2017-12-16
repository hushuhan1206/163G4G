package com.qhit.lh.g4.syw.t2;

import java.util.List;

import com.qhit.lh.g4.syw.t2.bean.Emp;
import com.qhit.lh.g4.syw.t2.bean.UserInfo;
import com.qhit.lh.g4.syw.t2.dao.BaseDao;
import com.qhit.lh.g4.syw.t2.dao.impl.BaseDaoImpl;

public class EmpTest {
	private BaseDao basedao = new BaseDaoImpl();
	public void add(){
		//录入基本信息
		Emp emp = new Emp();
		emp.setEmpName("sss");
		emp.setEmpSex("M");
		emp.setBirthday("2017-12-12");
		emp.setDeptId(1);
		//分配账户信息
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("SSS");
		userInfo.setPassword("123456");
		
		emp.setUserInfo(userInfo);
		userInfo.setEmp(emp);

		basedao.add(emp);
	}
	
	public void delete(){
		Emp emp = new Emp();
		emp.setEid(2);
		
		UserInfo userInfo = new UserInfo();
		userInfo.setEmp(emp);
		
		basedao.delete(emp);
		}
	
	public void update(){
		Emp emp = new Emp();
		emp.setEid(2);
		emp.setEmpName("李四");
		emp.setEmpSex("男");
		emp.setBirthday("1991-1-11");
		emp.setDeptId(2);

		UserInfo userinfo = new UserInfo();
		userinfo.setUserId(4);
		userinfo.setUserName("lisi");
		userinfo.setUpswd("123456");

		userinfo.setEmp(emp);
		emp.setUserInfo(userinfo);

		basedao.update(emp);

	}
	
	public void query(){
		Emp emp = new Emp();
		emp.setEid(4);
		UserInfo userinfo = new UserInfo();
		userinfo.setUserId(4);
		emp.setUserInfo(userinfo);
		basedao.delete(emp);
	}
	
	public void queryAll(){
		List<Object> emps = basedao.queryAll("from Emp");
		for (Object object : emps) {
			Emp emp=(Emp) object;
			System.out.println(emp.toString());
		}
	}
}

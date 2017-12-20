package com.qhit.lh.g4.syw.t6;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.syw.t6.bean.Dept;
import com.qhit.lh.g4.syw.t6.bean.Emp;
import com.qhit.lh.g4.syw.t6.bean.UserInfo;
import com.qhit.lh.g4.syw.t6.dao.BaseDao;
import com.qhit.lh.g4.syw.t6.dao.impl.BaseDaoImpl;

/**
 * @author 盛亚伟
 *2017年12月15日上午9:54:25
 *TODO
 */
public class EmpTest {
	private BaseDao basedao = new BaseDaoImpl();
	@Test
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
	
	@Test
	public void delete(){
		Emp emp = new Emp();
		emp.setEid(2);
		
		UserInfo userInfo = new UserInfo();
		userInfo.setEmp(emp);
		
		basedao.delete(emp);
		}
	
	@Test
	public void update(){
		//先找人
		Emp emp1 = (Emp) basedao.getObjectById(Emp.class,6);
		Emp emp2 = (Emp) basedao.getObjectById(Emp.class,5);
		//改的是当前员工所属的部门
		Dept dept = (Dept) basedao.getObjectById(Dept.class, 8);
		//分配部门
		emp1.setDept(dept);
		emp2.setDept(dept);
		//更新提交
		basedao.update(emp1);
		basedao.update(emp2);
		
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
	
	@Test
	public void query(){
		Emp emp = new Emp();
		emp.setEid(4);
		UserInfo userinfo = new UserInfo();
		userinfo.setUserId(4);
		emp.setUserInfo(userinfo);
		basedao.delete(emp);
	}
	
	@Test
	public void queryAll(){
		List<Object> emps = basedao.queryAll("from Emp");
		for (Object object : emps) {
			Emp emp=(Emp) object;
			System.out.println(emp.toString());
		}
	}
}

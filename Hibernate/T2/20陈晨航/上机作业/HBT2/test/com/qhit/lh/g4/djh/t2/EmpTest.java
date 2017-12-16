package com.qhit.lh.g4.djh.t2;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.djh.t2.bean.Emp;
import com.qhit.lh.g4.djh.t2.bean.Userinfo;
import com.qhit.lh.g4.djh.t2.dao.BaseDao;
import com.qhit.lh.g4.djh.t2.dao.impl.BaseDaoImpl;

public class EmpTest {
	private BaseDao basedao = new BaseDaoImpl();

	@Test
	public void add() {
		Emp emp = new Emp();
		emp.setEname("张三");
		emp.setSex("男");
		emp.setBirth("1999-2-22");
		emp.setDeptid(new Integer(1));

		Userinfo userinfo = new Userinfo();
		userinfo.setUname("zhangsan");
		userinfo.setUpswd("123456");

		userinfo.setEmp(emp);
		emp.setUserinfo(userinfo);

		basedao.add(emp);

	}

	@Test
	public void update() {
		Emp emp = new Emp();
		emp.setEid(4);
		emp.setEname("李四");
		emp.setSex("男");
		emp.setBirth("1991-1-11");
		emp.setDeptid(2);

		Userinfo userinfo = new Userinfo();
		userinfo.setUid(4);
		userinfo.setUname("lisi");
		userinfo.setUpswd("123456");

		userinfo.setEmp(emp);
		emp.setUserinfo(userinfo);

		basedao.update(emp);

	}

	@Test
	public void delete() {
		Emp emp = new Emp();
		emp.setEid(4);
		Userinfo userinfo = new Userinfo();
		userinfo.setUid(4);
		emp.setUserinfo(userinfo);
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

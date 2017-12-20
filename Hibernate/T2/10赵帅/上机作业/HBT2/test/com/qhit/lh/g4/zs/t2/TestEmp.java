package com.qhit.lh.g4.zs.t2;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.zs.t2.bean.Emp;
import com.qhit.lh.g4.zs.t2.bean.UserInfo;
import com.qhit.lh.g4.zs.t2.dao.BaseDao;
import com.qhit.lh.g4.zs.t2.dao.impl.BaseDaoImpl;


public class TestEmp {
	
	Emp emp = new Emp();
	BaseDao baseDao = new BaseDaoImpl();
	
	@Test
	public void add() {
		emp.setEname("李梦阳");
		emp.setSex("M");
		emp.setBirthday("2017-12-16");
		emp.setDeptid(1);
		UserInfo userinfo = new UserInfo();
		userinfo.setUname("lmy");
		userinfo.setPwd("123456");
		emp.setUserinfo(userinfo);
		userinfo.setEmp(emp);
		baseDao.add(emp);
		
	}
	@Test
	public void update() {
		emp.setOid(2);
		emp.setDeptid(2);
		UserInfo userinfo = new UserInfo();
		userinfo.setUname("lll");
		emp.setUserinfo(userinfo);
		userinfo.setEmp(emp);
		baseDao.update(emp,2);
	}
	@Test
	public void delete() {
		emp.setOid(3);
		UserInfo userinfo = new UserInfo();
		userinfo.setUname("lll");
		emp.setUserinfo(userinfo);
		userinfo.setUid(3);
		emp.setUserinfo(userinfo);
		userinfo.setEmp(emp);
		baseDao.delete(emp);
	}
	@Test
	public void queryAll() {
		List<Object> list = baseDao.queryall("from emp");
		for (Object object : list) {
			Emp emp = (Emp) object;
			System.out.println(emp.toString());
		}
	}
}

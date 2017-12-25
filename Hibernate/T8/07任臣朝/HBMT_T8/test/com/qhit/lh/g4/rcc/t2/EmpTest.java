package com.qhit.lh.g4.rcc.t2;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.qhit.lh.g4.rcc.t2.bean.Dept;
import com.qhit.lh.g4.rcc.t2.bean.Emp;
import com.qhit.lh.g4.rcc.t2.bean.UserInfo;
import com.qhit.lh.g4.rcc.t2.service.BaseService;
import com.qhit.lh.g4.rcc.t2.service.impl.BaseServiceImpl;
import com.qhit.lh.g4.rcc.t2.utils.HibernateSessionFactory;

public class EmpTest {

	private BaseService baseService = new BaseServiceImpl();
	private Dept BaseService;
	@Test
	public void add() {
		//录入信息
		Emp emp= new Emp();
		emp.setEmpName("爱上孤独");
		emp.setEmpSex("M");
		emp.setBirthday("2017-12-14");
		//分配账户信息
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("asgd");
		userInfo.setPassword("123456");
		//员工和账户一对一
		emp.setUserInfo(userInfo);
		userInfo.setEmp(emp);
		//分配到某个部门
		Dept dept = (Dept) baseService.getObjectById(Dept.class,1);
		//员工多对一关联
		emp.setDept(dept);
		//操作
		baseService.add(emp);


	}
	public void delete() {
		Emp emp = (Emp) baseService.getObjectById(Emp.class,3);
		baseService.delete(emp);
	}
	public void update() {

		Emp emp = (Emp) baseService.getObjectById(Emp.class,4);
		emp.setEmpName("奴剑士");
		//当前员工所属部门
		Dept dept = (Dept) baseService.getObjectById(Dept.class,3);
		emp.setDept(dept);
		baseService.update(emp);
	}
	public void queryall() {
		List<Object> list = baseService.queryall("from emp");
		for (Object object : list){
			Emp emp = (Emp) object;
			System.out.println(emp.toString());
		}
	}
	/**
	 * 按员工姓名进行模糊查询
	 */ 
@Test
	public void getEmpByName(){
	   //session对象
	   Session session = HibernateSessionFactory.getSession();
	   //条件查询
	   Criteria criteria = session.createCriteria(Emp.class)
	            .setFetchMode("dept",FetchMode.DEFAULT)
	            .createAlias("dept","d")
	            .add(Restrictions.eq("d.deptName", "政治部"));
	   //执行查询
	   List<Emp> list =criteria.list();	
	   //输出
	   for(Emp emp : list){
		   System.out.println(emp.getEid()+":"+emp.getEmpName()+"|"+emp.getDept().getDeptName());
	   }
	}
}

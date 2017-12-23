package com.qhit.lh.g4.shutu.t4;


import java.util.List;

import javax.websocket.Session;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.SharedSessionContract;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.qhit.lh.g4.shutu.t4.been.Dept;
import com.qhit.lh.g4.shutu.t4.been.Emp;
import com.qhit.lh.g4.shutu.t4.been.UserInfo;
import com.qhit.lh.g4.shutu.t4.service.BaseService;
import com.qhit.lh.g4.shutu.t4.service.impl.BaseServiceImpl;
import com.qhit.lh.g4.shutu.t4.utils.HibernateSessionFactory;


public class EmpText {
	private BaseService baseService =new BaseServiceImpl();
	
	@Test
	public void add() {
		Emp emp = new Emp();
		//录入基本信息
		emp.setEmpName("张三");
		emp.setEmpSex("M");
		emp.setBirthday("2017-12-12");
		emp.setDeptId(1);
		//分配账户信息
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("zsh");
		userInfo.setPassword("123456");
		//员工表和账户表是一对一关系
		emp.setUserInfo(userInfo);
		userInfo.setEmp(emp);
		//分配到某个部门
	    Dept dept = (Dept) baseService.getObjectById(Dept.class, 1);
	    emp.setDept(dept);
		//添加员工并分配账户
		baseService.add(emp);
	}

	@Test
	public void delete() {
		Emp emp = (Emp) baseService.getObjectById(Emp.class,3);
		baseService.delete(emp);
	}
	@Test
	public void update() {
		Emp emp1 = (Emp) baseService.getObjectById(Emp.class,3);
		Emp emp2 = (Emp) baseService.getObjectById(Emp.class,3);
		
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 3);
		
		emp1.setDept(dept);
		emp2.setDept(dept);
		baseService.update(emp1);
		baseService.update(emp2);
	}
	@Test
	public void queryAll() {
		List<Object> list = baseService.queryAll("from emp");
		for (Object object : list) {
			Emp emp = (Emp) object;
			System.out.println(emp.toString());
		}
	}
   @Test
   //条件查询
	public void getEmpname(){
	Session session = (Session) HibernateSessionFactory.getSession();	
	Criteria criteria = ((SharedSessionContract) session).createCriteria(Emp.class)
			.add(Restrictions.like("empName", "张%"));
	List<Emp> list = criteria.list();
	
	for (Emp emp : list) {
		System.out.println(emp.getEid()+":"+emp.getEmpName());
	}
		
	}
   
   
   @Test
   //链接查询
   public void getEmpByDeptName(){
	 Session session = (Session) HibernateSessionFactory.getSession();
	 Criteria criteria = ((SharedSessionContract) session).createCriteria(Emp.class)
			 .setFetchMode("dept",FetchMode.JOIN)
			 .createAlias("dept", "d")
			 .add(Restrictions.eq("d.deptName", "中转部"));
	 
	 List<Emp> list = criteria.list();
	 
	 for (Emp emp : list) {
		System.out.println(emp.getEid()+":"+emp.getEmpName());
	}
			 
   }
   @Test
   
   public void getDeptInfo(){
	   Session session = (Session) HibernateSessionFactory.getSession();
	   
	   Criteria criteria = ((SharedSessionContract) session).createCriteria(Emp.class)
			   .setFetchMode("emps",FetchMode.JOIN)
			   .createAlias("emps", "e");
	   ProjectionList plist = Projections.projectionList()
			   .add(Projections.groupProperty("deptId"))
			   .add(Projections.groupProperty("deptName"))
			   .add(Projections.groupProperty("address"))
			   .add(Projections.count("e.eid"));
	   criteria.setProjection(plist);
	   
	   List<Object[]> list = criteria.list();
	   
	   for (Object[] obj : list) {
		   System.out.println(obj[0]+"|"+obj[1]+"|"+obj[2]+"|"+obj[3]);
	}
	   	   
   }
   
   
   
    
   
}

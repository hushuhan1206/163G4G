package com.qhit.lh.g4.djh.t2;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.qhit.lh.g4.djh.t2.bean.Dept;
import com.qhit.lh.g4.djh.t2.bean.Emp;
import com.qhit.lh.g4.djh.t2.bean.Userinfo;
import com.qhit.lh.g4.djh.t2.service.BaseService;
import com.qhit.lh.g4.djh.t2.service.impl.BaseServiceImpl;
import com.qhit.lh.g4.djh.t2.util.HibernateSessionFactory;

public class EmpTest {
	private BaseService baseService = new BaseServiceImpl();

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

		Dept dept = new Dept();
		dept = (Dept) baseService.getObjectById(Dept.class, 1);

		emp.setDept(dept);

		baseService.add(emp);

	}

	@Test
	public void update() {
		Emp emp = (Emp) baseService.getObjectById(Emp.class, 1);
		emp.setEname("王五");
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 2);
		emp.setDept(dept);
		baseService.update(emp);

	}

	@Test
	public void delete() {
		Emp emp = (Emp) baseService.getObjectById(Emp.class, 1);
		baseService.delete(emp);
	}

	@Test
	public void queryAll(){
		List<Object> emps = baseService.queryAll("from Emp");
		for (Object object : emps) {
			Emp emp= (Emp) object;
			System.out.println(emp.toString());
		}
	}
	@Test
	public void getEmpByName(){
		List<Emp> res = baseService.getEmpByName("%张%");

		for(Emp emp : res){
			System.out.println(emp.getEid()+":"+emp.getEname());
		}
	}

	public void getEmpLikeName(){
		Session session = HibernateSessionFactory.getSession();

		Criteria criteria = session.createCriteria(Emp.class)
				.add(Restrictions.like("ename", "张%"));

		List<Emp> list = criteria.list();
		
		for (Emp emp : list) {
			System.out.println(emp.getEid()+":"+emp.getEname());
		}
	}
	
	public void getEmpByDeptName(){
		Session session = HibernateSessionFactory.getSession();
		
		Criteria criteria = session.createCriteria(Emp.class)
				.setFetchMode("dept", FetchMode.JOIN)
				.createAlias("dept", "d")
				.add(Restrictions.eq("d.dname","技术部"));
		
		List<Emp> list = criteria.list();
		
		for (Emp emp : list) {
			System.out.println(emp.getEid()+":"+emp.getEname());
		}
	}
	
	public void getDeptInfo(){
		Session session = HibernateSessionFactory.getSession();
		
		Criteria criteria = session.createCriteria(Dept.class)
				.setFetchMode("emps", FetchMode.JOIN)
				.createAlias("emps", "e");
		
		ProjectionList pList = Projections.projectionList()
				.add(Projections.groupProperty("deptid"))
				.add(Projections.groupProperty("dname"))
				.add(Projections.groupProperty("daddress"))
				.add(Projections.count("e.eid"));
		
		criteria.setProjection(pList);
		
		List<Object[]> list = criteria.list();
		
		for (Object[] obj : list) {
			System.out.println(obj[0]+"|"+obj[1]+"|"+obj[2]+"|"+obj[3]);
		}
	}
}



























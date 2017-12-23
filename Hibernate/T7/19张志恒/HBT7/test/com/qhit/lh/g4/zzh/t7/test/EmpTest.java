package com.qhit.lh.g4.zzh.t7.test;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.qhit.lh.g4.zzh.t7.bean.Dept;
import com.qhit.lh.g4.zzh.t7.bean.Emp;
import com.qhit.lh.g4.zzh.t7.bean.UserInfo;
import com.qhit.lh.g4.zzh.t7.service.BaseService;
import com.qhit.lh.g4.zzh.t7.service.impl.BaseServiceImpl;
import com.qhit.lh.g4.zzh.t7.util.HibernateSessionFactory;



public class EmpTest {
	private BaseService baseService = new BaseServiceImpl();

	@Test
	public void add() {

		Emp emp = new Emp();
		emp.setEname("张三");
		emp.setSex("男");
		emp.setAge(22);
		emp.setDid(new Integer(1));

		UserInfo userinfo = new UserInfo();
		userinfo.setUname("zhangsan");
		userinfo.setPassword("123456");

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

	/**
	 * 所有姓名t开头的员工
	 */
	@Test
	public void getEmpByName(){
		List<Emp> result = baseService.getEmpByName("t%");
		for (Emp emp : result) {
			System.out.println(emp.getEid() + ":" + emp.getEname());
		}
	}

	@Test
	public void getEmpLikeName(){
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//通过Criteria接口进行查询
		Criteria criteria = session.createCriteria(Emp.class)
				.add(Restrictions.like("ename", "t%"));

		List<Emp> list = criteria.list();

		for (Emp emp : list) {
			System.out.println(emp.getEid() + ":" + emp.getEname());
		}
	}


	/**
	 * 所有姓名t开头的员工的姓名，性别，年龄
	 */
	@Test
	public void getEmp(){
		List<Emp> result = baseService.getEmp("t%");
		for (Emp emp : result) {
			System.out.println(emp.getEname() + ":" + emp.getSex() + ":" + emp.getAge());
		}
	}

	@Test
	public void getLikeEmp(){
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//通过Criteria接口进行查询
		Criteria criteria = session.createCriteria(Emp.class)
				.add(Restrictions.like("ename", "t%"));
		
		List<Emp> list = criteria.list();
		for (Emp emp : list) {
			System.out.println(emp.getEname() + ":" + emp.getSex() + ":" + emp.getAge());
		}
	}
	
}

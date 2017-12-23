package com.qhit.lh.g4.zzh.t7.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.qhit.lh.g4.zzh.t7.bean.Dept;
import com.qhit.lh.g4.zzh.t7.bean.Emp;
import com.qhit.lh.g4.zzh.t7.bean.UserInfo;
import com.qhit.lh.g4.zzh.t7.service.BaseService;
import com.qhit.lh.g4.zzh.t7.service.impl.BaseServiceImpl;
import com.qhit.lh.g4.zzh.t7.util.HibernateSessionFactory;


public class DeptTest {
	private BaseService baseService = new BaseServiceImpl();
	@Test
	public void add(){
		Emp emp = new Emp();
		Dept dept = new Dept();
		//老员工
		Emp emp2 = (Emp) baseService.getObjectById(Emp.class, 1);
		dept.getEmps().add(emp2);
		//招聘新员工
		emp.setEname("张");
		emp.setSex("M");
		emp.setAge(12);
		emp.setDid(1);
		//分配账户
		UserInfo userinfo = new UserInfo();
		userinfo.setUname("zhang");
		userinfo.setPassword("123456");
		//1-1关联
		userinfo.setEmp(emp);
		emp.setUserinfo(userinfo);
		//n-1关联
		emp.setDept(dept);
		//1-n关联
		dept.getEmps().add(emp);
		baseService.add(dept);

	}

	@Test
	public void delete(){
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 2);

		baseService.delete(dept);
	}

	@Test
	public void update(){
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 1);
		dept.setAddress("南海");
		baseService.update(dept);
	}

	@Test
	public void query(){
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 2);
		for(Emp emp : dept.getEmps()){
			System.out.println(dept.getDname()+":"+emp.getEname());
		}
	}
	//查询部门中的员工
	@Test
	public void getDept(){
		List<Dept> result = baseService.getDept("国防部");
		for (Dept dept : result) {
			System.out.print(dept.getDname());
			System.out.println("下员工有：");
			for (Emp emp : dept.getEmps()) {
				System.out.println(emp.getEid() + ":" + emp.getEname() + ":" + emp.getSex() + ":" + emp.getAge());
			}
		}
	}
	@Test
	public void getDepts(){
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//获取条件查询器
		Criteria criteria = session.createCriteria(Emp.class)
				.setFetchMode("dept", FetchMode.JOIN)
				.createAlias("dept", "d")
				.add(Restrictions.eq("d.dname","国防部"));
		//遍历输出
		List<Emp> list = criteria.list();
		for (Emp emp : list) {
			System.out.println(emp.getEid() + ":" + emp.getEname() + ":" + emp.getSex() + ":" + emp.getAge());
		}

	}

	//查询每个部门的人数
	@Test
	public void getCount(){
		List<Object[]> result = baseService.getCount();

		for (Object[] object : result) {
			System.out.println(object[0] + "人数：" + object[1]);
		}
	}
	@Test
	public void getCounts(){
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//获取条件查询器
		Criteria criteria = session.createCriteria(Dept.class)
				.setFetchMode("emps", FetchMode.JOIN)
				.createAlias("emps", "e");
		
		ProjectionList projectionList = Projections.projectionList()
				.add(Projections.groupProperty("did"))
				.add(Projections.groupProperty("dname"))
				.add(Projections.groupProperty("address"))
				.add(Projections.count("e.eid"));
		criteria.setProjection(projectionList);
		List<Object[]> result = criteria.list();
		for (Object[] objects : result) {
			System.out.println(objects[1] + "人数：" + objects[0] + "\n" + "地址为：" + objects[2]);
		}
	}
}

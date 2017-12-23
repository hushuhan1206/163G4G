package com.qhit.lh.g4.chen.t8;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.qhit.lh.g4.chen.t8.bean.Dept;
import com.qhit.lh.g4.chen.t8.bean.Emp;
import com.qhit.lh.g4.chen.t8.bean.UserInfo;
import com.qhit.lh.g4.chen.t8.service.BaseService;
import com.qhit.lh.g4.chen.t8.service.impl.BaseServiceImpl;
import com.qhit.lh.g4.chen.t8.utils.HibernateSessionFactory;


/**
 * @author 陈红雁
 * 2017年12月23日上午9:32:57
 * TODO
 */
public class EmpTest {
	private BaseService baseService = new BaseServiceImpl();
	
	@Test
	public void add(){
		Emp emp = new Emp();
		emp.setEname("张三");
		emp.setSex("m");
		emp.setBirthday("2001-1-14");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUname("zs");
		userInfo.setPassword("123456");

		emp.setUserinfo(userInfo);
		userInfo.setEmp(emp);
		
		Dept dept = (Dept) baseService.getObjectById(Emp.class, 5);
		emp.setDept(dept);
		baseService.add(emp);
}

	
	@Test
	public void delete(){
		Emp emp = (Emp) baseService.getObjectById(Emp.class, 14);
		baseService.delete(emp);
	}

	
	@Test
	public void update(){
		Emp emp = (Emp) baseService.getObjectById(Emp.class, 15);
		emp.setEname("张三");
		Dept dept = (Dept) baseService.getObjectById(Emp.class, 4);
		emp.setDept(dept);
		baseService.update(emp);
	}

	@Test
	public void query(){
			List<Object> list = baseService.queryAll("from Emp");
			for(Object object : list){
				Emp emp = (Emp) object;
				System.out.println(emp.toString());
			}
	}

	@Test
	public void getEmpByName(){
			List<Emp> result = baseService.getEmpByName();
			for(Emp emp : result){
				System.out.println(emp.getEid()+":"+emp.getEname());
			}
	}
	
	@Test
	public void getEmpLikeName(){
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//获取条件查询器
		Criteria criteria = session.createCriteria(Emp.class)
				.add(Restrictions.like("Ename", "张%"));
		//执行查询
		List<Emp> list = criteria.list();
		
		//遍历输出
		for (Emp emp : list) {
			System.out.println(emp.getEid()+":"+emp.getEname());
		}
	}
	
	@Test
	public void getEmpByDeptName(){
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//获取条件查询器
		Criteria criteria = session.createCriteria(Emp.class)
				.setFetchMode("dept", FetchMode.JOIN)
				.createAlias("dept","d")
				.add(Restrictions.eq("d.Dname", "外交部"));
		//执行查询
		List<Emp> list = criteria.list();
		
		//遍历输出
		for (Emp emp : list) {
			System.out.println(emp.getEid()+":"+emp.getEname());
		}
	}
}

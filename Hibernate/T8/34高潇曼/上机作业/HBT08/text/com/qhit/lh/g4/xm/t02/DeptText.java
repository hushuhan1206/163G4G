package com.qhit.lh.g4.xm.t02;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.junit.Test;

import com.qhit.lh.g4.xm.t02.bean.Dept;
import com.qhit.lh.g4.xm.t02.bean.Emp;
import com.qhit.lh.g4.xm.t02.bean.UserInfo;
import com.qhit.lh.g4.xm.t02.service.BaseService;
import com.qhit.lh.g4.xm.t02.service.impl.BaseServiceImpl;
import com.qhit.lh.g4.xm.t02.utils.HibernateSessionFactory;

public class DeptText {
	private BaseService baseService =new BaseServiceImpl();
	
	@Test
	public void add() {
		//新建部门
		Dept dept = new Dept();
		dept.setDeptName("大部");
		dept.setDeptAdress("东北");
		//有员工，从老员工调
		Emp emp1 = (Emp) baseService.getObjectById(Emp.class,3);
		dept.getEmps().add(emp1);
		//有员工，招聘新员工
		Emp emp2 = new Emp();
		//录入基本信息
		emp2.setEmpName("一一");
		emp2.setEmpSex("F");
		emp2.setBirthday("2017-12-15");
		//分配账户
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("ll");
		userInfo.setPassword("123456");
		//关联
		emp1.setUserInfo(userInfo);
		userInfo.setEmp(emp1);
		
		emp2.setDept(dept);
		dept.getEmps().add(emp2);
		
		emp2.setDept(dept);
		
		baseService.add(dept);
	}
	
	@Test
	public void delete() {
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 6);
		baseService.delete(dept);
	}
	
	@Test
	public void update() {
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 3);
		dept.setDeptAdress("东南");
		baseService.update(dept);
	}
	
	@Test
	public void query() {
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 3);
		for (Emp emp : dept.getEmps()) {
			System.out.println(dept.getDeptName()+":"+emp.getEmpName());
		}
	}
	public void getDeptInfo(){
		Session session = HibernateSessionFactory.getSession();
		Criteria criteria = session.createCriteria(Dept.class)
				.setFetchMode("emps",FetchMode.JOIN)
				.createAlias("emps","e");
	 ProjectionList pList =Projections.projectionList()
			 .add(Projections.groupProperty("deptId"))
			 .add(Projections.groupProperty("deptName"))
			 .add(Projections.groupProperty("address"))
			 .add(Projections.count("e.eid"));
	 criteria.setProjection(pList);
	 List<Object[]>list= criteria.list();
	 for(Object[]obj:list){
		 System.out.println(obj[0]+"|"+obj[2]+"|"+obj[3]);
	 }
	}
}

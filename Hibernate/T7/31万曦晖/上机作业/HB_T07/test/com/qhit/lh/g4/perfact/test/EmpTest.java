/**
 * 
 */
package com.qhit.lh.g4.perfact.test;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import com.qhit.lh.g4.perfact.t7.service.DaseService;
import com.qhit.lh.g4.perfact.t7.service.impl.BaseServiceImpl;
import com.qhit.lh.g4.perfact.t7.util.HibernateSessionFactory;
import com.qhit.lh.g4.perfact.t7.bean.Dept;
import com.qhit.lh.g4.perfact.t7.bean.Emp;
/**
 * @author 万曦晖
 *TODO
 *2017年12月22日上午10:17:31
 */

public class EmpTest {
	private DaseService baseservice = new BaseServiceImpl();

	/*
	 * HQL参数查询
	 * */
	@Test
	public void getEmpByName() {
		List<Emp> eee = baseservice.getEmpByName("杨%");
		for (Emp emp : eee) {
			System.out.println(eee);
		}

	}
	/*
	 * HQL属性查询
	 * */
	@Test
	public void getEmpbyProperty() {
		String hql = "selcet e.ename ,e.esex,e.ebirthday from Emp e where e.ename like ?";
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hql);
		List<Object[]> list = query.list();
		for (Object[] o : list) {
			System.out.println(o[0]+"|"+o[1]+"|"+o[2]);
		}
	}

	/*
	 * HQL实例化查询
	 * */
	@Test
	public void getEmpbyInstantiation() {
		String hql = "selcet new Emp (e.ename,e.esex,e.ebirthday) from Emp e where e.ename like ?";
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hql);
		query.setString(0, "A%");
		List<Emp> emps = query.list();
		for (Emp emp : emps) {
			System.out.println(emp);
		}
	}

	/*
	 * HQL连接查询
	 * */
	@Test
	public void getEmpByDeptName() {
		String hql = "select distinct d from Dept d join fetch d.emps where d.dname='市场部'";
		List<Dept> dept = baseservice.getObjects(hql);
		for (Dept dept2 : dept) {
			System.out.println(dept2);
			System.out.println("部门下员工有:");
			for (Object o : dept2.getEmps()) {
				System.out.println(o);
			}
		}
	}

	@Test
	public void add() {
		//新建角色
		Emp emp = new Emp();
		emp.setEname("山驴");
		emp.setEsex("M");
		emp.setEbirthday("1977-09-27");
		baseservice.add(emp);
	}
}

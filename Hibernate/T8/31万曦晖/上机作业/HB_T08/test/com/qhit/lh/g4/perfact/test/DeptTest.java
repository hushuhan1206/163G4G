/**
 * 
 */
package com.qhit.lh.g4.perfact.test;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.qhit.lh.g4.perfact.t8.bean.Dept;
import com.qhit.lh.g4.perfact.t8.bean.Emp;
import com.qhit.lh.g4.perfact.t8.util.HibernateSessionFactory;

/**
 * @author 万曦晖
 *TODO
 *2017年12月23日上午9:24:45
 */
public class DeptTest {
	/*
	 * QBC统计查询
	 * */
	@Test
	public void Deptinfo() {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//获取条件查询器
		Criteria criteria = session.createCriteria(Dept.class)
				.setFetchMode("emps", FetchMode.JOIN)
				.createAlias("emps", "e");
		ProjectionList pList = Projections.projectionList()
				.add(Projections.groupProperty("did"))
				.add(Projections.groupProperty("dname"))
				.add(Projections.groupProperty("daddress"))
				.add(Projections.groupProperty("e.eid"));
		criteria.setProjection(pList);
		//执行查询
		List<Object[]> list = criteria.list();
		//遍历查询
		for (Object[] o : list) {
			System.out.println(o[0]+"|"+o[1]+"|"+o[2]+"|"+o[3]);
		}
	}

}

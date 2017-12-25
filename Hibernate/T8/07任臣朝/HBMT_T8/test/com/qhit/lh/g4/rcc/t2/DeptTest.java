/**
 * 
 */
package com.qhit.lh.g4.rcc.t2;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.qhit.lh.g4.rcc.t2.bean.Dept;
import com.qhit.lh.g4.rcc.t2.bean.Emp;
import com.qhit.lh.g4.rcc.t2.bean.UserInfo;
import com.qhit.lh.g4.rcc.t2.service.BaseService;
import com.qhit.lh.g4.rcc.t2.service.impl.BaseServiceImpl;
import com.qhit.lh.g4.rcc.t2.utils.HibernateSessionFactory;

/**
 * @author 任臣朝
 * TODO
 * 2017年12月20日下午6:04:48
 */
public class DeptTest {
	private BaseService baseService = new BaseServiceImpl();

	public void add(){
		//新建部门
		Dept dept= new Dept();
		dept.setDeptName("政治部");
		dept.setAddress("上海");
		
		//招聘员工：2
		Emp emp2= new Emp();
		emp2.setEmpName("爱上孤独");
		emp2.setEmpSex("M");
		emp2.setBirthday("2017-12-14");
		
		//分配账户:2
		UserInfo user2 = new UserInfo();
		user2.setUserName("asgd");
		user2.setPassword("123456");
	}
	/**
	 * @return the baseService
	 */
	public BaseService getBaseService() {
		return baseService;
	}

	/**
	 * @param baseService the baseService to set
	 */
	public void setBaseService(BaseService baseService) {
		this.baseService = baseService;
	}
	
	public void getDeptInfo(){
		Session session = HibernateSessionFactory.getSession();
		
		Criteria criteria = session.createCriteria(Dept.class)
				.setFetchMode("emps",FetchMode.JOIN)
				.createAlias("emps","e");
		
		ProjectionList pList = Projections.projectionList()
				.add(Projections.groupProperty("deptId"))
				.add(Projections.groupProperty("deptName"))
				.add(Projections.groupProperty("address"))
				.add(Projections.count("e.eid"));
		
		criteria.setProjection(pList);
		
		List<Object[]> list = criteria.list();
		
		for (Object[] obj : list) {
			System.out.println(obj[0]+"|"+obj[1]+"|"+obj[2]+"|"+obj[3]);
		}
	}

}

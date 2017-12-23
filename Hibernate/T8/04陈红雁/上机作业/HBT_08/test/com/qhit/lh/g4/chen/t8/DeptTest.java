package com.qhit.lh.g4.chen.t8;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.junit.Test;

import com.qhit.lh.g4.chen.t8.bean.Dept;
import com.qhit.lh.g4.chen.t8.bean.Emp;
import com.qhit.lh.g4.chen.t8.bean.UserInfo;
import com.qhit.lh.g4.chen.t8.service.BaseService;
import com.qhit.lh.g4.chen.t8.service.impl.BaseServiceImpl;
import com.qhit.lh.g4.chen.t8.utils.HibernateSessionFactory;

/**
 * @author 陈红雁
 * 2017年12月23日上午9:32:52
 * TODO
 */
public class DeptTest {
	private BaseService baseService = new BaseServiceImpl();
	public void add(){
		Dept dept = new Dept();
		dept.setDname("团总支");
		dept.setAdress("漯河");
		Emp emp1 = (Emp) baseService.getObjectById(Emp.class, 15);
		dept.getEmps().add(emp1);
		Emp emp2 = new Emp();
		emp2.setEname("王碧");
		emp2.setSex('M');
		emp2.setBirthday("2000-01-04");
		UserInfo user2 = new UserInfo();
		user2.setUname("wb");
		user2.setPassword("123456");
		emp2.setUserinfo(user2);
		user2.setEmp(emp2);
		emp2.setDept(dept);
		dept.getEmps().add(emp2);
		baseService.add(dept);

	}
	@Test
	public void delete(){
		Dept dept = (Dept) ((BaseServiceImpl) baseService).getObjectById(Dept.class,8);
		baseService.delete(dept);
	}
	@Test
	public void update(){
		Dept dept = (Dept) ((BaseServiceImpl) baseService).getObjectById(Dept.class,5);
		dept.setAdress("中国");
		baseService.update(dept);

	}
    @Test
	public void query(){
		Dept dept = (Dept) ((BaseServiceImpl) baseService).getObjectById(Dept.class,5);

		for(Emp emp : dept.getEmps()){
			System.out.println(dept.getDname()+":"+emp.getEname());
		}

	}

    @Test
	public void getDeptInfo(){
    	//获取session对象
    			Session session = HibernateSessionFactory.getSession();
    			//获取条件查询器
    			Criteria criteria = session.createCriteria(Emp.class)
    					.setFetchMode("emps", FetchMode.JOIN)
    					.createAlias("emps","e");
    			
    			
    			ProjectionList pList = Projections.projectionList()
    					.add(Projections.groupProperty("deptId"))
    					.add(Projections.groupProperty("Dname"))
    					.add(Projections.groupProperty("Adress"))
    					.add(Projections.count("e.eid"));
    			
    			criteria.setProjection(pList);
    			
    			//执行查询
    			List<Object[]> list = criteria.list();
    			
    			//遍历输出
    			for (Object[] obj : list) {
    				System.out.println(obj[0]+"|"+obj[1]+"|"+obj[2]+"|"+obj[3]);
    			}
    		}	
    

}

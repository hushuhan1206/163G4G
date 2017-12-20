package com.qhit.lh.g4.syw.t6;

import org.junit.Test;

import com.qhit.lh.g4.syw.t6.bean.Dept;
import com.qhit.lh.g4.syw.t6.bean.Emp;
import com.qhit.lh.g4.syw.t6.bean.UserInfo;
import com.qhit.lh.g4.syw.t6.dao.BaseDao;
import com.qhit.lh.g4.syw.t6.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.syw.t6.service.BaseService;

/**
 * @author 盛亚伟
 *2017年12月15日上午9:54:08
 *TODO
 */
public class DeptTest {
	private BaseDao basedao = new BaseDaoImpl();
	@Test
	public void add(){
		//新建部门
		Dept dept = new Dept();
		dept.setDeptName("技术部");
		dept.setAddress("漯河");
		
		//没有员工
		
		//有员工;1,从老员工调去
		Emp emp1 = (Emp) basedao.getObjectById(Dept.class,9);
		dept.getEmps().add(emp1);
		//有员工 ; 2, 招聘新员工
		Emp emp2 = new Emp();
		emp2.setEmpName("aaa");
		emp2.setEmpSex("M");
		emp2.setBirthday("2017-12-15");
		//有员工：分配账户
		UserInfo user2 = new UserInfo();
		user2.setUserName("AAA");
		user2.setPassword("123456");
		//一对一关联
		user2.setUserInfo(user2);
		user2.setEmp(emp2);
		//多对一关联
		user2.setDept(emp2);
		//一对多关联
		user2.getEmps().add(emp2);
		//数据操作
		basedao.add(dept);
	}
	
	@Test
	public void delete(){
		Dept dept = (Dept) basedao.getObjectById(Dept.class,6);
		basedao.delete(dept);
	}
	
	@Test
	public void update(){
		Dept dept = (Dept) basedao.getObjectById(Dept.class,5);
		dept.setAddress("上海");
		basedao.update(dept);
	}
	
	@Test
	public void query(){
		Dept dept = (Dept) basedao.getObjectById(Dept.class,4);
		
		for(Emp emp : dept.getEmps()){
			System.out.println(dept.getDeptName()+":"+emp.getEmpName());
		}
	}
}

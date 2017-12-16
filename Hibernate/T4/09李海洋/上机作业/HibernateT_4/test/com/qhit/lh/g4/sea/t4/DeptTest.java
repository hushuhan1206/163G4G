/**
 * 
 */
package com.qhit.lh.g4.sea.t4;


import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.sea.t4.bean.Dept;
import com.qhit.lh.g4.sea.t4.bean.Emp;
import com.qhit.lh.g4.sea.t4.service.BaseService;
import com.qhit.lh.g4.sea.t4.service.impl.BaseServiceImpl;

/**
 * @author 李海洋
 *TODO
 *2017年12月13日下午4:03:08
 */
public class DeptTest {
	private BaseService baseService = new BaseServiceImpl();
	private List<Dept> deptlist;
	@Test
	//添加部门
	public void add() {
		//声明并初始化部门
		Dept dept = new Dept();
		dept.setDname("信息部");
		dept.setDadress("办公一楼");
		//声明并初始化员工
		Emp emp = new Emp();
		emp.setEname("李强");
		emp.setEsex("m");
		emp.setEbirth("2004-5-7");
		//将员工添加到dept关联的集合属性emps中
		dept.getEmps().add(emp);

		baseService.add(dept);
	}
	//获取单个部门信息
	@Test
	public void get() {
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 7);
		System.out.println(dept);
		System.out.println("员工有：");
		for (Object o : dept.getEmps()) {
			System.out.println(o);
		}
	}
	//获取所有部门信息
	@Test
	public void getall(){
		deptlist = baseService.getObjects("from Dept");
		for (Object o : deptlist) {
			System.out.println(o);
		}
	}
	//修改部门信息
	@Test
	public void update(){
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 7);
		dept.setDname("宣传部");
		dept.setDadress("办公三楼");

		baseService.update(dept);
	}
	//删除部门
	@Test
	public void delete(){
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 7);
		baseService.delete(dept);
	}
}

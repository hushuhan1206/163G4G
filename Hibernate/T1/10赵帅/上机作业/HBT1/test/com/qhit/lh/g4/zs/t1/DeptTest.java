package com.qhit.lh.g4.zs.t1;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.zs.t1.bean.Dept;
import com.qhit.lh.g4.zs.t1.dao.BaseDao;
import com.qhit.lh.g4.zs.t1.dao.impl.BaseDaoImpl;

public class DeptTest {
	
	Dept dept = new Dept();
	BaseDao baseDao = new BaseDaoImpl();
	@Test
	public void addDept() {
		dept.setDname("市场部");
		dept.setAddress("漯河");
		
		baseDao.add(dept);
	}
	@Test
	public void updateDept() {
		dept.setAddress("北京");
		
		baseDao.update(dept,1);
	}
	@Test
	public void deleteDept() {
		dept.setOid(1);
	
		baseDao.delete(dept);
	}
	@Test
	public void queryAll() {
		List<Object> list = baseDao.queryall("from dept");
		for (Object object : list) {
			Dept dept = (Dept) object;
			System.out.println(dept.toString());
		}
	}
}

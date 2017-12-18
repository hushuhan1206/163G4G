	/**
 * 
 */
package com.qhit.lh.g4.perfact.t4;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.g4.perfact.t4.bean.TDept;
import com.qhit.lh.g4.perfact.t4.bean.TEmp;
import com.qhit.lh.g4.perfact.t4.bean.TUserinfo;
import com.qhit.lh.g4.perfact.t4.service.BaseService;
import com.qhit.lh.g4.perfact.t4.service.impl.BaseServiceImpl;

/**
 * @author 万曦晖
 *TODO
 *2017年12月16日上午8:21:45
 */
public class DeptTest {
	private BaseService baseService = new BaseServiceImpl();
	@Test
	public void add() {
		TDept dept = new TDept();
		dept.setDeptName("外交部");
		dept.setAdrress("北极");
		
		TEmp emp1 = (TEmp)baseService.getObjectById(TEmp.class,15);
		dept.getEmps().add(emp1);
		TEmp emp2 = new TEmp();
		emp2.setEmpName("Alice");
		emp2.setEmpSex("M");
		emp2.setBrithday("1984-5-3");
		
		TUserinfo userinfo = new TUserinfo();
		userinfo.setUserName("alice");
		userinfo.setUserPwd("123456");
		emp2.setTuserinfo(userinfo);
		userinfo.setTemp(emp2);
		baseService.add(emp2);
		emp2 =(TEmp) baseService.getObjectById(TEmp.class, 16);
		dept.getEmps().add(emp2);
		
		baseService.add(dept);
	}
	@Test
	public void delete() {
		TDept dept =(TDept)baseService.getObjectById(TDept.class, 5);
		baseService.delete(dept);
	}
	@Test
	public void update() {
		TDept dept =(TDept)baseService.getObjectById(TDept.class, 5);
		dept.setAdrress("威尼斯");
		baseService.update(dept);
	}
	@Test
	public void query() {
		
	}

}

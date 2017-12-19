/**
 * 
 */
package com.qhit.lh.g4.ZWK.HB_T02;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.ZWK.HB_T02.bean.Emp;
import com.qhit.lh.g4.ZWK.HB_T02.bean.UserInfo;
import com.qhit.lh.g4.ZWK.HB_T02.service.impl.BaseServiceImpl;

/**
 * @author ZWK
 *2017年12月12日下午3:28:31
 *TODO
 */
public class EmpTest {
		private BaseServiceImpl bsi = new BaseServiceImpl();
	//@Test
	public void add() {
		//创建员工类对象
		Emp emp = new Emp();
		emp.setBirthday("2017-12-12");
		emp.setDepId(1);
		emp.setEmpName("tom");
		emp.setEmpSex("M");
		//创建员工信息类对象
		UserInfo ui = new UserInfo();
		ui.setUserName("tom");
		ui.setUserPassword("123456");
		
		//一一对应关系设置
		emp.setUserinfo(ui);
		ui.setEmp(emp);
		
		bsi.add(emp);
	}
	//@Test
	public void update() {
		//创建员工类对象
		Emp emp = new Emp();
		emp.setBirthday("2017-00-12");
		emp.setDepId(1);
		emp.setEmpName("tom");
		emp.setEmpSex("M");
		emp.setEid(3);
		//创建员工信息类对象
		UserInfo ui = new UserInfo();
		ui.setUid(3);
		ui.setUserName("tom");
		ui.setUserPassword("0123456");
		
		//一一对应关系设置
		emp.setUserinfo(ui);
		ui.setEmp(emp);
		
		bsi.add(emp);
	}
	//@Test
	public void delete() {
		//创建员工类对象
		Emp emp = new Emp();
		emp.setEid(2);
		//创建员工信息类对象
		UserInfo ui = new UserInfo();
		ui.setUid(2);
		//一一对应关系设置
		emp.setUserinfo(ui);
		ui.setEmp(emp);
		bsi.delete(emp);
	}
//	@Test
	public void query() {
		//注意这里的Emp为类名，即表的映射名
		
	    List<Object> list =  bsi.query("from Emp");
		for(Object obj:list){
			Emp emp = (Emp) obj;
			System.out.println(emp.getEmpName());
		}
	
	}
	@Test
	public void get() {
		Emp emp = (Emp) bsi.getObjectById(Emp.class ,2);
		System.out.println(emp.getEmpName());
	}

}

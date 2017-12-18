/**
 * 
 */
package com.qhit.lh.g4.perfact.t4;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.perfact.t4.bean.TDept;
import com.qhit.lh.g4.perfact.t4.bean.TEmp;
import com.qhit.lh.g4.perfact.t4.bean.TUserinfo;
import com.qhit.lh.g4.perfact.t4.dao.BaseDao;
import com.qhit.lh.g4.perfact.t4.dao.impl.BaseDaoImpl;

/**
 * @author 万曦晖
 *TODO
 *2017年12月15日上午11:06:37
 */
public class EmpTest {
	private BaseDao basedao =new BaseDaoImpl();
	@Test
	public void add(){
		TEmp  emp =new TEmp();
		emp.setEmpName("山驴");
		emp.setEmpSex("M");
		emp.setBrithday("1977-09-27");
		emp.setDeptId(1);
		TUserinfo userinfo =new TUserinfo();
		userinfo.setUserName("mxl");
		userinfo.setUserPwd("123456");
		TDept dept=(TDept) basedao.getObjectById(TDept.class, 1);
		userinfo.setTemp(emp);
		emp.setTuserinfo(userinfo);
		emp.setTdept(dept);
		basedao.add(emp);
	}
	@Test
	public void delete(){
		TEmp  emp =new TEmp();
		emp=(TEmp) basedao.getObjectById(TEmp.class, 1);
		basedao.delete(emp);
	}
	@Test
	public void update(){
		TEmp emp1 = (TEmp) basedao.getObjectById(TEmp.class, 1);
		TEmp emp2 = (TEmp) basedao.getObjectById(TEmp.class, 1);
		TDept dept=(TDept) basedao.getObjectById(TDept.class, 2);
		emp1.setTdept(dept);
		emp2.setTdept(dept);
		basedao.update(emp1);
		basedao.update(emp2);
	}
	@Test
	public void queryAll(){
		List<Object> lists=	basedao.queryAll("from Emp");
		for (Object object : lists) {
			TEmp emp=(TEmp) object;
			System.out.println(emp.toString());
		}

	}

}

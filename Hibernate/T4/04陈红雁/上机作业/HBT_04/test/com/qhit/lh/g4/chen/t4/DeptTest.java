package com.qhit.lh.g4.chen.t4;

import com.qhit.lh.g4.chen.t4.bean.Dept;
import com.qhit.lh.g4.chen.t4.bean.Emp;
import com.qhit.lh.g4.chen.t4.bean.UserInfo;
import com.qhit.lh.g4.chen.t4.service.BaseService;
import com.qhit.lh.g4.chen.t4.service.impl.BaseServiceImpl;

public class DeptTest {
	private BaseService baseService = new BaseServiceImpl();
	public void add(){
		Dept dept = new Dept();
		dept.setDname("团总支");
		dept.setAdress("漯河");
		Emp emp1 = (Emp) BaseService.getObjectById(Emp.class, 15);
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
	
public void delete(){
		Dept dept = (Dept) ((BaseServiceImpl) baseService).getObjectById(Dept.class,8);
		baseService.delete(dept);
	}

public void update(){
	Dept dept = (Dept) ((BaseServiceImpl) baseService).getObjectById(Dept.class,5);
	dept.setAdress("中国");
	baseService.update(dept);
	
}

public void query(){
	Dept dept = (Dept) ((BaseServiceImpl) baseService).getObjectById(Dept.class,5);
	
	for(Emp emp : dept.getEmps()){
		System.out.println(dept.getDname()+":"+emp.getEname());
	}
	
}
	

}

package com.qhit.lh.g4.rcc.t2;

import java.util.List;

import com.qhit.lh.g4.rcc.t2.bean.Dept;
import com.qhit.lh.g4.rcc.t2.bean.Emp;
import com.qhit.lh.g4.rcc.t2.bean.Role;
import com.qhit.lh.g4.rcc.t2.bean.UserInfo;
import com.qhit.lh.g4.rcc.t2.service.BaseService;
import com.qhit.lh.g4.rcc.t2.service.impl.BaseServiceImpl;

public class RoleTest {
	private BaseService baseService = new BaseServiceImpl();

	public void add(){
		//新建角色
		Role role = new Role();
		role.setRoleName("政委");
		role.setMemo("午安");
		//分配账户
		UserInfo userInfo = (UserInfo) baseService.getObjectById(UserInfo.class,15);
		//多对多关联
		role.getUers().add(userInfo);
		
        baseService.add(role);
	}

	public void delete(){
		Role role = (Role) baseService.getObjectById(Emp.class,7);
		baseService.delete(role); 

	}

	public void update(){
		Role role = (Role) baseService.getObjectById(Emp.class,8);
		role.setMemo("欧菊花");
		//当前员工所属部门
		Dept dept = (Dept) baseService.getObjectById(Dept.class,3);
		role.setDept(dept);
		baseService.update(role);

	}

	public void query(){
		List<Object> list = baseService.queryall("from role");
		for (Object object : list){
			Role role = (Role) object;
			System.out.println(role.toString());
		}
	}

	public BaseService getBaseService() {
		return baseService;
	}

	public void setBaseService(BaseService baseService) {
		this.baseService = baseService;
	}
}

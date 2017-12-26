package com.qhit.lh.g4.zzh.t7.test;

import org.junit.Test;

import com.qhit.lh.g4.zzh.t7.bean.Roles;
import com.qhit.lh.g4.zzh.t7.bean.UserInfo;
import com.qhit.lh.g4.zzh.t7.service.BaseService;
import com.qhit.lh.g4.zzh.t7.service.impl.BaseServiceImpl;


public class RolesTest {
	private BaseService baseService = new BaseServiceImpl();
	@Test
	public void add(){
		//创建角色表
		Roles roles = new Roles();
		roles.setRoleName("总理");
		roles.setMemo("党政");
		//分配账户
		UserInfo userInfo = (UserInfo) baseService.getObjectById(UserInfo.class, 1);
		//建立多对多关联
		roles.getUsers().add(userInfo);
		//保存数据
		baseService.add(roles);
	}
	@Test
	public void delete(){
		Roles roles = (Roles) baseService.getObjectById(Roles.class, 1);
		baseService.delete(roles);
	}
	@Test
	public void update(){
		Roles roles = (Roles) baseService.getObjectById(Roles.class, 10);
		roles.setMemo("党");
		UserInfo userInfo = (UserInfo) baseService.getObjectById(UserInfo.class, 1);
		//建立多对多关联
		roles.getUsers().add(userInfo);
		//保存数据
		baseService.update(roles);
	}

	@Test
	public void query(){
		Roles roles = (Roles) baseService.getObjectById(Roles.class, 10);
		
		for (UserInfo userInfo : roles.getUsers()) {
			System.out.println(roles.getRoleName() + ":" + userInfo.getUname());
		}
	}

}

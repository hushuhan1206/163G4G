package com.qhit.lh.g4.hsj.t06;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.g4.hsj.t06.bean.Roles;
import com.qhit.lh.g4.hsj.t06.bean.UserInfo;
import com.qhit.lh.g4.hsj.t06.service.BaseService;
import com.qhit.lh.g4.hsj.t06.service.impl.BaseServiceImpl;

public class RolesTest {
	private BaseService baseService =new BaseServiceImpl();
	@Test
	public void add() {
		//新建角色
		Roles roles = new Roles();
		roles.setRoleName("常委");
		roles.setMemo("政治");
		//分配账户
		UserInfo userInfo = (UserInfo) baseService.getObjectById(UserInfo.class, 1);
		//建立多对对关联
		roles.getUsers().add(userInfo);
		
		baseService.add(roles);
	}
	
	@Test
	public void delete() {
		Roles roles = (Roles) baseService.getObjectById(Roles.class, 1);
		
		baseService.delete(roles);
	}
	
	@Test
	public void update() {
		Roles roles = (Roles) baseService.getObjectById(Roles.class,2);
		roles.setRoleName("党委");
		roles.setMemo("党军队");
		
		UserInfo user1 = (UserInfo) baseService.getObjectById(UserInfo.class, 2);
		UserInfo user2 = (UserInfo) baseService.getObjectById(UserInfo.class, 3);
		
		roles.getUsers().add(user1);
		roles.getUsers().add(user2);
		
		baseService.update(roles);
	}
	
	@Test
	public void query() {
		Roles roles = (Roles) baseService.getObjectById(Roles.class,3);
		for (UserInfo user : roles.getUsers()) {
			System.out.println(roles.getRoleName()+":"+user.getUserName());
		}
	}

}

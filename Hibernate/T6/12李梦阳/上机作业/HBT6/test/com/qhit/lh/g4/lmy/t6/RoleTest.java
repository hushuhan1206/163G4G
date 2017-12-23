package com.qhit.lh.g4.lmy.t6;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.g4.lmy.t6.bean.Role;
import com.qhit.lh.g4.lmy.t6.bean.Userinfo;
import com.qhit.lh.g4.lmy.t6.service.BaseService;
import com.qhit.lh.g4.lmy.t6.service.impl.BaseServiceImpl;

public class RoleTest {

	private BaseService baseService;
		@Test
		public void add() {
			//新建角色
			Role role = new Role();
			role.setRoleName("网易云CEO");
			role.setMemo("CEO");
			//分配账户
			Userinfo userinfo = (Userinfo) baseService.getObjectById(Userinfo.class, 1);
			//建立多对多关联
			role.getUser().add(userinfo);
			
			baseService.add(role);
		}
		@Test
		public void delete() {
			Role role = (Role) baseService.getObjectById(Role.class, 1);
			baseService.delete(role);
		}
		@Test
		public void update() {
			Role role = (Role) baseService.getObjectById(Role.class, 1);
			role.setMemo("执行官");
			Userinfo alice = (Userinfo) baseService.getObjectById(Userinfo.class, 2);
			Userinfo anlsnde = (Userinfo) baseService.getObjectById(Userinfo.class, 5);
			role.getUser().add(alice);
			role.getUser().add(anlsnde);
			baseService.update(role);
		}
		@Test
		public void query() {
			Role role = (Role) baseService.getObjectById(Role.class, 2);
			for (Userinfo userinfo : role.getUser()) {
				System.out.println(role.getRoleName()+":"+userinfo.getUname());
			}
		}

}


package com.qhit.lh.g4.djh.t2;

import org.junit.Test;

import com.qhit.lh.g4.djh.t2.bean.Role;
import com.qhit.lh.g4.djh.t2.bean.Userinfo;
import com.qhit.lh.g4.djh.t2.service.BaseService;
import com.qhit.lh.g4.djh.t2.service.impl.BaseServiceImpl;

public class RoleTest {
	private BaseService baseservice = new BaseServiceImpl();

	@Test
	public void add() {
		Role role = new Role();
		role.setrName("提督");
		role.setMemo("碧蓝航线");

		Userinfo userinfo = (Userinfo) baseservice.getObjectById(Userinfo.class, 2);
		
		role.getUsers().add(userinfo);
		
		baseservice.add(role);
	}

	@Test
	public void delete() {	
		Role role = (Role) baseservice.getObjectById(Role.class, 2);
		
		baseservice.delete(role);
	}

	@Test
	public void update() {
		Role role = (Role) baseservice.getObjectById(Role.class, 2);
		role.setrName("舰长");
		role.setMemo("休伯利安");
		
		Userinfo aaa = (Userinfo) baseservice.getObjectById(Role.class, 3);
		
		role.getUsers().add(aaa);
		
		baseservice.update(role);
	}

	@Test
	public void query() {
		Role role = (Role) baseservice.getObjectById(Role.class, 2);
		
		for(Userinfo userinfo : role.getUsers()){
			System.out.println(role.getrName()+""+userinfo.getUname());
		}
	}

}

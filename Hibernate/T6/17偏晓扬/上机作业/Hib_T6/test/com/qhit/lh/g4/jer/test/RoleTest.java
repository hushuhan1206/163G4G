package com.qhit.lh.g4.jer.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.g4.jer.t6.bean.Role;
import com.qhit.lh.g4.jer.t6.bean.UserInfo;
import com.qhit.lh.g4.jer.t6.service.UserService;
import com.qhit.lh.g4.jer.t6.service.impl.UserServiceImpl;

/**
 * @author 偏晓阳
 * 2017年12月20日下午5:14:33
 * TODO
 */
public class RoleTest {

	private UserService userService = new UserServiceImpl();
	@Test
	public void add() {
		Role role = new Role();
		role.setRoleName("总统");
		role.setMemo("国事");
		
		UserInfo userInfo = (UserInfo) userService.getObjectById(UserInfo.class, 5);
		
		role.getUsers().add(userInfo);
		
		userService.add(role);
	}
	
	@Test
	public void delete(){
		Role role =  (Role) userService.getObjectById(Role.class, 3);
		
		userService.delete(role);
	}
	
	@Test
	public void update(){
		Role role =  (Role) userService.getObjectById(Role.class, 4);
		UserInfo egz = (UserInfo) userService.getObjectById(UserInfo.class, 8);
		UserInfo lgd = (UserInfo) userService.getObjectById(UserInfo.class, 9);
		role.getUsers().add(egz);
		role.getUsers().add(lgd);
		
		userService.update(role);
		
	}
	
	@Test
	public void query(){
		Role role =  (Role) userService.getObjectById(Role.class, 4);
		for(UserInfo user : role.getUsers()){
			System.out.println(role.getRoleName()+":"+user.getUserName());
		}
	}
	
}

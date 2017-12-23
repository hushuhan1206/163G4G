package com.qhit.lh.g4.xm.t02;

import java.awt.List;

import com.qhit.lh.g4.xm.t02.bean.Role;
import com.qhit.lh.g4.xm.t02.bean.UserInfo;
import com.qhit.lh.g4.xm.t02.service.BaseService;
import com.qhit.lh.g4.xm.t02.service.impl.BaseServiceImpl;

public class RoleText {
	private BaseService baseService=new BaseServiceImpl();
	private void add(){
	Role role=new Role();
	role.setRolename("总理");
	role.setMemo("政治");
	UserInfo userinfo=(UserInfo)baseService.getObjectById(UserInfo.class, 1);
	role.getUers().add(userinfo);
	baseService.add(role);
	}
    private void delete(){
    Role role=(Role)baseService.getObjectById(Role.class,2);
    baseService.delete(role);	
	}
    private void update(){
    Role role=(Role)baseService.getObjectById(Role.class,3);
    role.setMemo("党政军");
    UserInfo gxm=(UserInfo)baseService.getObjectById(UserInfo.class, 5);	
    baseService.update(role);
    }
    private void query(){
    	BaseService userService = null;
		Role role =  (Role) userService.getObjectById(Role.class, 4);
		for(UserInfo user : role.getUers()){
			System.out.println(role.getRoleid()+":"+user.getUserName());
    }
   
    }
}

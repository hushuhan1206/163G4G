/**
 * 
 */
package com.qhit.lh.g4.xjl.t6;

import static org.junit.Assert.*;

import org.apache.tomcat.util.buf.UEncoder;
import org.junit.Test;

import com.qhit.lh.g4.xjl.t6.bean.Roles;
import com.qhit.lh.g4.xjl.t6.bean.UserInfo;
import com.qhit.lh.g4.xjl.t6.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.xjl.t6.service.BaseService;
import com.qhit.lh.g4.xjl.t6.service.impl.BaseServiceImpl;

/**
 * @author 许金来
 *2017年12月20日下午4:53:54
 */
public class RoleTest {

	private BaseService baseService = new BaseServiceImpl();
	@Test
	public void add() {
		//新建角色
		Roles role = new Roles();
		role.setRoleName("保安部");
		role.setMemo("全部");
		//分配账户
		UserInfo userInfo = (UserInfo) baseService.getObjectById(UserInfo.class, 1);
		//添加多对多关系
		role.getUserInfo().add(userInfo);
		userInfo.getRoles().add(role);
		
		
	
		baseService.add(role);
	}

	@Test
	public void delete() {
		Roles roles = (Roles) baseService.getObjectById(UserInfo.class, 1);
		baseService.delete(roles);
	}

	@Test
	public void update() {
		
	}

	@Test
	public void queryAll() {
		
	}

}

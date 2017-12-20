package com.qhit.lh.g4.syw.t6;

import org.junit.Test;

import com.qhit.lh.g4.syw.t6.bean.Role;
import com.qhit.lh.g4.syw.t6.bean.UserInfo;
import com.qhit.lh.g4.syw.t6.dao.BaseDao;
import com.qhit.lh.g4.syw.t6.dao.impl.BaseDaoImpl;

/**
 * @author 盛亚伟
 *2017年12月20日下午4:31:26
 *TODO
 */
public class RoleTest {
	private BaseDao baseDao = new BaseDaoImpl();
	
	@Test
	public void add(){
		//新建角色
		Role role = new Role();
		role.setRoleName("技术员");
		role.setMemo("开发部");
		//分配账户
		UserInfo userInfo = (UserInfo) baseDao.getObjectById(UserInfo.class, 6);
		//建立多对多关联
		role.getUser().add(userInfo);
		
		baseDao.add(role);
	}
	
	@Test
	public void delete(){
		
		Role role = (Role) baseDao.getObjectById(Role.class, 6);
		
		baseDao.delete(role);
	}
	
	@Test
	public void update(){
		Role role = (Role) baseDao.getObjectById(Role.class, 6);
		role.setMemo("销售部");
		
		UserInfo sss = (UserInfo) baseDao.getObjectById(Role.class, 8);
		UserInfo aaa = (UserInfo) baseDao.getObjectById(Role.class, 9);
		
		role.getUser().add(sss);
		role.getUser().add(aaa);
		
		baseDao.update(role);
		
	}
	
	@Test
	public void query(){
		Role role = (Role) baseDao.getObjectById(Role.class, 6);
		
		for (UserInfo user : role.getUser()) {
			System.out.println(role.getRoleName()+":"+user.getUserName());
		}
	}
}

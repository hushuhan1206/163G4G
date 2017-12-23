package com.qhit.lh.g4.jer.test;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.junit.Test;

import com.qhit.lh.g4.jer.t8.bean.Dpt;
import com.qhit.lh.g4.jer.t8.bean.Emp;
import com.qhit.lh.g4.jer.t8.bean.Role;
import com.qhit.lh.g4.jer.t8.bean.UserInfo;
import com.qhit.lh.g4.jer.t8.service.UserService;
import com.qhit.lh.g4.jer.t8.service.impl.UserServiceImpl;
import com.qhit.lh.g4.jer.t8.utils.HibernateSessionFactory;

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
	
	@Test
	public void getDeptInfo(){
		Session session = HibernateSessionFactory.getSession();
		Criteria criteria = session.createCriteria(Dpt.class).setFetchMode("emps", FetchMode.JOIN).createAlias("emps", "e");
		
		ProjectionList pList = Projections.projectionList().add(Projections.groupProperty("did")).add(Projections.groupProperty("dname")).add(Projections.groupProperty("dadd"));
		
		criteria.setProjection(pList);
		
		List<Object[]>	list = criteria.list();
		
		for (Object[] objects : list) {
			System.out.println(objects[0]+"|"+objects[1]+"|"+objects[2]);
		}
	}
	
}

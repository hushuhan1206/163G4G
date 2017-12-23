package com.qhit.lh.g4.zs.t6;



import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.zs.t6.bean.Roles;
import com.qhit.lh.g4.zs.t6.bean.UserInfo;
import com.qhit.lh.g4.zs.t6.dao.BaseDao;
import com.qhit.lh.g4.zs.t6.dao.impl.BaseDaoImpl;

public class RolesTest {

	private BaseDao basedao =new BaseDaoImpl();
	
	@Test
	public void add() {
		Roles roles =new Roles();
		roles.setRname("李梦阳");
		roles.setRmemo("傻吊");
		UserInfo userinfo =(UserInfo) basedao.getObjectById(UserInfo.class, 3);
		roles.getUserinfos().add(userinfo);
		basedao.add(roles);
	}
	@Test
	public void delete() {
		Roles roles=(Roles) basedao.getObjectById(Roles.class, 3);
		basedao.delete(roles);
	}
	@Test
	public void update() {
		Roles roles=(Roles) basedao.getObjectById(Roles.class, 4);
		UserInfo userinfo =(UserInfo) basedao.getObjectById(UserInfo.class, 2);
		roles.getUserinfos().add(userinfo);
		basedao.update(roles);
	}
	@Test
	public void queryAll(){
		List<Object> lists  =basedao.queryAll("from Roles");
		for (Object object : lists) {
			Roles roles =(Roles) object;
			System.out.println(roles.getRname()+":");
			for (Object obj : roles.getUserinfos()) {
				UserInfo userinfo =(UserInfo) obj;
				System.out.print(userinfo.getUname()+userinfo.getUpwd());
			}
		}
	}
}

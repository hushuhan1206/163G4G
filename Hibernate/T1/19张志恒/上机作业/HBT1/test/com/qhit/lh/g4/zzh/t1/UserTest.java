package com.qhit.lh.g4.zzh.t1;


import java.util.List;

import org.hibernate.Session;

import com.qhit.lh.g4.zzh.t1.bean.User;
import com.qhit.lh.g4.zzh.t1.service.BaseService;
import com.qhit.lh.g4.zzh.t1.service.impl.BaseServiceImpl;
import com.qhit.lh.g4.zzh.t1.bean.User;

/**
 * @author 张志恒
 * 测试类
 */
public class UserTest {
	private BaseService baseService = new BaseServiceImpl();
	/**
	 * 添加用户测试
	 */
	public void addUser(Object object){
		User user = new User();
		user.setName("tom");
		user.setPassword("123456");
		user.setBirthday("2017-12-9");
		user.setSex(1);
		user.setEnable("经理");
		baseService.add(user);
	}
	//删
		public void delete(){
			User user = new User();
			user.setUid(1);
			baseService.delete(user);
		};
		//改
		public void update(){
			User user = new User();
			user.setUid(1);
			user.setName("tom");
			user.setPassword("123456");
			user.setBirthday("2017-12-9");
			user.setSex(1);
			user.setEnable("经理");
			baseService.add(user);
			
			baseService.update(user);
		};
		//查
		public void query(){
			List<Object> list = baseService.queryAll("from Emp");
			for (Object object : list) {
				User user = (User) object;
				System.out.println(user.toString());
			}
		};
}

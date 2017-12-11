package com.qhit.lh.g4.ZWK.T01;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.ZWK.T01.bean.User;
import com.qhit.lh.g4.ZWK.T01.service.Impl.UserServiceImpl;

public class UserTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}
		*/
	private 	UserServiceImpl usi = new UserServiceImpl();
		
		//@Test
		public void add(){
			User user = new User();
			user.setBirthday("2017-12-12");
			user.setEnable(1);
			user.setSex("M");
			user.setUname("Tomss");
			user.setUpwd("123546");
			usi.add(user);
		}
		//@Test
		public void delete(){
		
			User user = new User();
			user.setUid(2);
			usi.delete(user);
		}
		//@Test
		public void get(){
			User user= usi.getUser(3);
			System.out.println(user.getUname()+"\t"+user.getSex());
		}
		//@Test
		public void update(){
			User user = new User();
			user.setBirthday("2017-00-12");
			user.setEnable(1);
			user.setSex("M");
			user.setUname("Tomss");
			user.setUpwd("123546");
			user.setUid(3);
			usi.update(user);
		}
		@Test
		public void getList(){
			String str = "from t_user";
			ArrayList<Object> list = (ArrayList<Object>) usi.getList(str);
			for(Object obj:list){
				User user = (User) obj;
				System.out.println(user.getUname()+"\n");
			}
		}
		

}

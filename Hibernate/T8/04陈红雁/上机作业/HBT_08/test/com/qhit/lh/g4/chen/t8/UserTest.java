package com.qhit.lh.g4.chen.t8;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.chen.t8.bean.Emp;
import com.qhit.lh.g4.chen.t8.bean.UserInfo;
import com.qhit.lh.g4.chen.t8.service.BaseService;

/**
 * @author 陈红雁
 * 2017年12月23日上午9:33:12
 * TODO
 */
public class UserTest {

	private static final BaseService baseService = null;

	@Test
	public void login(){
			UserInfo user = new UserInfo();
			user.setUname("ssd");
			user.setPassword("123456");
			
			List<UserInfo> users = baseService.login(user);
			if(users != null && ((List<UserInfo>) user).size() > 0){
				System.out.println("成功");
			}else {
				System.out.println("失败");
			}
			
	}

}

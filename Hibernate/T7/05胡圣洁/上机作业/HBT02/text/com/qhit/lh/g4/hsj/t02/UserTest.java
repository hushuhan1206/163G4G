package com.qhit.lh.g4.hsj.t02;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.hsj.t02.bean.UserInfo;
import com.qhit.lh.g4.hsj.t02.service.BaseService;
import com.qhit.lh.g4.hsj.t02.service.impl.BaseServiceImpl;

public class UserTest {
   private BaseService baseService = new BaseServiceImpl();
	@Test
	public void login() {
		//user对象，表单提交时自动封装成了action中的对象
		UserInfo user = new UserInfo();
		user.setUserName("lhm");
		user.setPassword("222222");
		
		List<UserInfo> users = baseService.login(user);
		if (users != null && users.size() > 0) {
			System.out.println("成功");
		} else {
			System.out.println("失败");
		}
	}

}

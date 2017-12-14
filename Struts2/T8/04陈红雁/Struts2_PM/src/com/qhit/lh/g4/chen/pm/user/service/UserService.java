/**
 * 
 */
package com.qhit.lh.g4.chen.pm.user.service;

import com.qhit.lh.g4.chen.pm.user.bean.User;

/**
 * @author 陈红雁
 * 2017年12月8日下午5:31:03
 *TODO
 */
public interface UserService {
	
	
	/**
	 * @param user
	 * @return
	 * 添加用户
	 */
	public int addUser(User user);

	/**
	 * @param userName
	 * @param userPassword
	 * @return
	 * 登錄的業務
	 */
	public User doLogin(String userName,String userPassword);
}

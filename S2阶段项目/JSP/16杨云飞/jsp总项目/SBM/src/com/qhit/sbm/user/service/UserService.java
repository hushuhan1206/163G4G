/**
 * 
 */
package com.qhit.sbm.user.service;

import com.qhit.sbm.user.bean.User;

/**
 * @author admin
 * 2017年11月11日
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

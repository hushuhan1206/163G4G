/**
 * 
 */
package com.qhit.lh.g4.hsj.sbm.user.dao;

import java.util.List;

import com.qhit.lh.g4.hsj.sbm.user.bean.User;


/**
 * @author 胡圣洁
 * TODO
 * 2017年12月8日下午10:17:45
 */
public interface UserDao {
	public List<User> getAllUser();
	
	public int addUser(User user);
	/**
	 * @param userName
	 * @param userPassword
	 * @return
	 * 登錄的數據訪問
	 */
	public User doLogin(String userName,String userPassword);
}

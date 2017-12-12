/**
 * 
 */
package com.qhit.lh.g4.jer.sbm.service;

import java.sql.SQLException;
import java.util.List;

import com.qhit.lh.g4.jer.sbm.bean.User;



/**
 * @author 偏晓阳
 * 2017年12月8日下午4:56:58
 * TODO
 */
public interface UserService {
	
	public List<User> getAllUser() throws SQLException;
	
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
	 * 登录
	 */
	public User doLogin(String userName,String userPassword);
}

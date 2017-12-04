/**
 * 
 */
package com.qhit.sbm.user.dao;

import com.qhit.sbm.user.bean.User;

/**
 * @author admin
 * 2017年11月11日
 */
/**
 * @author acer
 *
 */
public interface UserDao {
	
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
	 * 登錄的數據訪問
	 */
	public User doLogin(String userName,String userPassword);
	
	/**
	 * @param user
	 * @param newpswd
	 * @return
	 * 修改密码
	 */
	public User updatePwd(User user,String newpswd);
}

/**
 * 
 */
package com.qhit.lh.g4.ZWK.T01.dao;

import java.util.List;

import com.qhit.lh.g4.ZWK.T01.bean.User;


/**
 * @author ZWK
 *2017年12月9日上午11:28:16
 *TODO
 */
public interface UserDao {

	public void add(Object obj);
	public void delete(Object arg0);
	public User getUser( int id);
	public void update(Object obj);
	public List<Object> getList(String str);

	
}

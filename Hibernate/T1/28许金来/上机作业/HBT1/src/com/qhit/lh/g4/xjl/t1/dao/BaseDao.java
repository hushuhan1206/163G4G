/**
 * 
 */
package com.qhit.lh.g4.xjl.t1.dao;

import java.util.List;

import com.qhit.lh.g4.xjl.t1.bean.User;

/**
 * @author 许金来
 *2017-12-11下午4:07:48
 * TODO
 */
public interface BaseDao {

	
	public void add(Object obj);
	public void delete(User user);
	public void update(Object obj, int id);
	public List<Object> queryAll(String  tableName);
	
	
}

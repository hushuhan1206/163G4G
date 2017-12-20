/**
 * 
 */
package com.qhit.lh.g4.xjl.t6.dao;

import java.util.List;



/**
 * @author 许金来
 *2017年12月20日下午3:55:24
 */
public interface BaseDao {

	
	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public List<Object> queryAll(String  tableName);
	
	public Object getObjectById(Class clazz, int id);
	
}

/**
 * 
 */
package com.qhit.lh.g4.zhy.T5.dao;

import java.util.List;



/**
 * @author 张宏远
 *2017-12-19下午8:56:23
 * TODO
 */
public interface BaseDao {

	
	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public List<Object> queryAll(String  tableName);
	
	public Object getObjectById(Class clazz, int id);
	
}

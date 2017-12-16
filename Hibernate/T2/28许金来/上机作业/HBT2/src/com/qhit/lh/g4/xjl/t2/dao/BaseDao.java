/**
 * 
 */
package com.qhit.lh.g4.xjl.t2.dao;

import java.util.List;



/**
 * @author 许金来
 *2017-12-12下午4:07:48
 * TODO
 */
public interface BaseDao {

	
	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public List<Object> queryAll(String  tableName);
	
	
}

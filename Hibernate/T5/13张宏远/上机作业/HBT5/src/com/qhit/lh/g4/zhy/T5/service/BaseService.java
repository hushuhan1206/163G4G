/**
 * 
 */
package com.qhit.lh.g4.zhy.T5.service;

import java.util.List;

/**
 * @author 张宏远
 *2017-12-19下午9:18:56
 * TODO
 */
public interface BaseService {


	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public List<Object> queryAll(String  tableName);
	
	public Object getObjectById(Class clazz, int id);
}

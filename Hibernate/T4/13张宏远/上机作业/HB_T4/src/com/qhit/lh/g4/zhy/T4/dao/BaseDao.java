/**
 * 
 */
package com.qhit.lh.g4.zhy.T4.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author 张宏远
 * 2017年12月16日下午8:27:45
 * TODO
 */
public interface BaseDao {
	public void add(Object object);
	public void delete(Object object);
	public void update(Object object);
	public Object getObjectById(Class clazz,Serializable id);
	public List<Object> queryAll(String sql);
}

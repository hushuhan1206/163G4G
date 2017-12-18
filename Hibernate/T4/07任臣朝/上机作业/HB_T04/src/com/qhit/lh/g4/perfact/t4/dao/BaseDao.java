/**
 * 
 */
package com.qhit.lh.g4.perfact.t4.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author 万曦晖
 *TODO
 *2017年12月15日上午10:51:41
 */
public interface BaseDao {
	public void add(Object object);
	public void delete(Object object);
	public void update(Object object);
	public Object getObjectById(Class clazz,Serializable id);
	public List<Object> queryAll(String sql);
}

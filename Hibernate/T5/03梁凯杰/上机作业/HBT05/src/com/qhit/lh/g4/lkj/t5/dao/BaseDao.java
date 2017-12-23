/**
 * 
 */
package com.qhit.lh.g4.lkj.t5.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author 梁凯杰
 *TODO
 *2017年12月17日下午4:11:43
 */
public interface BaseDao {
	public void add(Object object);
	public void delete(Object object);
	public void update(Object object);
	public Object getObjectById(Class clazz,Serializable id);
	public List<Object> queryAll(String sql);
}

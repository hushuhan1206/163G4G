/**
 * 
 */
package com.qhit.lh.g4.ZWK.HB_T02.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author ZWK
 *2017年12月12日下午3:16:52
 *TODO
 */
public interface BaseDao {

	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public Object getObjectById(Class clazz,Serializable id);
	public List<Object> query(String str);
}

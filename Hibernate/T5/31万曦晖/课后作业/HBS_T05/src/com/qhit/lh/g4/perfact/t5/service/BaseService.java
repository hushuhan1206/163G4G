/**
 * 
 */
package com.qhit.lh.g4.perfact.t5.service;

import java.io.Serializable;
import java.util.List;

import com.qhit.lh.g4.perfact.t5.bean.TUser;

/**
 * @author 万曦晖
 *TODO
 *2017年12月23日上午10:42:53
 */
public interface BaseService {
	public void add(Object object);
	public void delete(Object object);
	public void update(Object object);
	public Object getObjectById(Class clazz,Serializable id);
	public List<TUser> queryAll(String sql);
}

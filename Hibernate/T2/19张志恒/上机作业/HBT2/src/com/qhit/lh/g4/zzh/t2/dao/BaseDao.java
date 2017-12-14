/**
 * 
 */
package com.qhit.lh.g4.zzh.t2.dao;

import java.util.List;

/**
 * @author S01
 * TODO
 * 2017年12月12日下午3:01:10
 */
public interface BaseDao {
	//增
	public void add(Object obj);
	//删
	public void delete(Object obj);
	//改
	public void update(Object obj);
	//查
	public List<Object> queryAll(String fromStr);
}

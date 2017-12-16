package com.qhit.lh.g4.chx.t1.dao;

import java.util.List;

/**
 * @author chx
 *
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

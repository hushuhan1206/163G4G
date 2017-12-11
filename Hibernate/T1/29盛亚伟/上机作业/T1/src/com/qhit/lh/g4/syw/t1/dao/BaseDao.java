package com.qhit.lh.g4.syw.t1.dao;

import java.util.List;

import com.qhit.lh.g4.syw.t1.bean.User;

public interface BaseDao {
	/**
	 * 
	 * @param obj
	 * @return
	 * 添加
	 */
	public void add(Object obj);
	public void add(User user);
	public void delete(User user);
	public void update(User user);
	public List<Object> queryAll(String  tableName);
}

package com.qhit.lh.g4.jer.t2.dao;

import java.util.List;

/**
 * @author 偏晓扬
 * 2017年12月12日下午3:01:01
 * TODO
 */
public interface UserDao {
	
	public void add(Object obj);
	
	public void update(Object obj);
	
	public void delete(Object obj);
	
	public List<Object> queryAll(String fromStr);
}

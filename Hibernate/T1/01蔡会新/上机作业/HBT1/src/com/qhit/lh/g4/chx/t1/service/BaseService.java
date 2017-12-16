/**
 * 
 */
package com.qhit.lh.g4.chx.t1.service;

import java.util.List;

/**
 * @author S01
 * TODO
 * 2017年12月12日下午4:02:24
 */
public interface BaseService {
	//增
	public void add(Object obj);
	//删
	public void delete(Object obj);
	//改
	public void update(Object obj);
	//查
	public List<Object> queryAll(String fromStr);
}

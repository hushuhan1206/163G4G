/**
 * 
 */
package com.qhit.lh.g4.xm.t2.service;

import java.util.List;
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

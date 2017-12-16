/**
 * 
 */
package com.qhit.lh.g4.lzk.t2.service;

import java.util.List;

/**
 * @author 李志凯
 * TODO
 * 2017年12月12日下午3:02:24
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

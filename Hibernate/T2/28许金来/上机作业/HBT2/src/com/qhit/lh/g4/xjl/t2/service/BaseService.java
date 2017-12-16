/**
 * 
 */
package com.qhit.lh.g4.xjl.t2.service;

import java.util.List;

/**
 * @author 许金来
 *2017-12-12下午5:16:15
 * TODO
 */
public interface BaseService {


	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public List<Object> queryAll(String  tableName);
	
}

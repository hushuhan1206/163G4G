/**
 * 
 */
package com.qhit.lh.g4.perfact.t4.service;

import java.util.List;

import com.qhit.lh.g4.perfact.t4.bean.TDept;
import com.qhit.lh.g4.perfact.t4.bean.TEmp;

/**
 * @author 万曦晖
 *TODO
 *2017年12月16日上午8:24:25
 */
public interface BaseService {
	public void add(Object object);
	public void delete(Object object);
	public void update(Object object);
	public List<Object> queryAll(String  fromStr);
	/**
	 * @param class1
	 * @param i
	 * @return
	 */
	public Object getObjectById(Class class1, int i);

}
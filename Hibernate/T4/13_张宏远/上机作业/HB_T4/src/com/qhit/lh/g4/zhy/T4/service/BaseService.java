/**
 * 
 */
package com.qhit.lh.g4.zhy.T4.service;

import java.util.List;

import com.qhit.lh.g4.perfact.t3.bean.TDept;
import com.qhit.lh.g4.perfact.t3.bean.TEmp;

/**
 * @author 张宏远
 * 2017年12月16日下午8:45:12
 * TODO
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
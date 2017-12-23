/**
 * 
 */
package com.qhit.lh.g4.lkj.t5.service;

import java.util.List;

import com.qhit.lh.g4.lkj.t5.bean.TDept;
import com.qhit.lh.g4.lkj.t5.bean.TEmp;

/**
 * @author 梁凯杰
 *TODO
 *2017年12月17日下午4:30:36
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
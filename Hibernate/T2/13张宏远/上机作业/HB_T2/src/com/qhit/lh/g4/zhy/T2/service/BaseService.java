/**
 * 
 */
package com.qhit.lh.g4.zhy.T2.service;

import java.util.List;

/**
 * @author 张宏远
 *2017年12月15日
 */
public interface BaseService {

	public void add(Object object);
	public void delete(Object object);
	public void update(Object object);
	public List<Object> queryAll(String  fromStr);

}

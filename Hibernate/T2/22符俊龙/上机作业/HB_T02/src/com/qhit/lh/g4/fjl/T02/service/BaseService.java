/**
 * 
 */
package com.qhit.lh.g4.fjl.T02.service;

import java.util.List;

/**
 * @author 符俊龙
 *2017年12月12日
 */
public interface BaseService {

	public void add(Object object);
	public void delete(Object object);
	public void update(Object object);
	public List<Object> queryAll(String  fromStr);

}

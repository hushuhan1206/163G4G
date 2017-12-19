/**
 * 
 */
package com.qhit.lh.g4.WMH.T04.service;

import java.io.Serializable;
import java.util.List;

import com.qhit.lh.g4.ZWK.T04.bean.TbUser;

/**
 * @author WMH
 *2017年12月18日下午6:28:09
 *TODO
 */
public interface BaseService {
	public void add(Object obj);
	public void delete(Object arg0);
	public TbUser getQueryById(Class clazz, Serializable id);
	public void update(Object obj);
	public List<Object> getList(String str);
}

/**
 * 
 */
package com.qhit.lh.g4.WMH.T04.dao;

import java.io.Serializable;
import java.util.List;

import com.qhit.lh.g4.ZWK.T04.bean.TbUser;

/**
 * @author WMH
 *2017年12月18日下午6:07:46
 *TODO
 */
public interface BaseDao {

	public void add(Object obj);
	public void delete(Object arg0);
	public TbUser getQueryById(Class clazz, Serializable id);
	public void update(Object obj);
	public List<Object> getList(String str);
}

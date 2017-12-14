/**
 * 
 */
package com.qhit.lh.g4.sea.t2.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author 李海洋
 *TODO
 *2017年12月9日上午11:19:21
 */
public interface BaseDao {
	//添加
	public void add(Object obj);
	//删除
	public void delete(Object obj);
	//修改
	public void update(Object obj);
	//查询
	public Object getObjectById(Class clazz,Serializable id);
	//遍历查询
	public List getObjects(String hql);
}

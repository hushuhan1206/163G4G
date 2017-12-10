/**
 * 
 */
package com.qhit.lh.g4.sea.t1.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author 李海洋
 *TODO
 *2017年12月9日上午11:19:21
 */
public interface BaseDao {
	//添加
	public void addUser(Object obj);
	//删除
	public void deleteUser(Object obj);
	//修改
	public void updateUser(Object obj);
	//查询
	public Object getObjectById(Class clazz,Serializable id);
	public List getObjects(String hql);
}

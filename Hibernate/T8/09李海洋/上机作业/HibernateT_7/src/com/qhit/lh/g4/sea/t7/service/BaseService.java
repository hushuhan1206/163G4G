/**
 * 
 */
package com.qhit.lh.g4.sea.t7.service;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;

/**
 * @author 李海洋
 *TODO
 *2017年12月14日上午10:05:30
 */
public interface BaseService {
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
	//根据姓名模糊查询
	public Query getByName(String hql);
}

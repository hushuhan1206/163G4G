package com.qhit.lh.g4.rcc.t2.service;

import java.util.List;

import org.junit.Test;

public interface BaseService {
	/**
	 * 按员工姓名进行模糊查询
	 */ 
@Test
	public void getEmpByName();

	/**
	 * @param obj
	 * 添加
	 * */
	public void add(Object obj);
	/**
	 * @param obj
	 * 更新
	 * */
	public void update(Object obj);
	/**
	 * @param obj
	 * 删除
	 * */
	public void delete(Object obj);
	/**
	 * @param obj
	 * 查询
	 * */
	public List<Object> queryall(String tableName);
	public Object getObjectById(Class clazz, int id);

}

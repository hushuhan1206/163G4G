package com.qhit.lh.g4.hsj.t02.dao;


import java.util.List;



public interface BaseDao {

	/**
	 * @param user
	 */
	public void add(Object obj);

	/**
	 * @param user
	 */
	public void update(Object obj);

	/**
	 * @param user
	 */
	public void delete(Object obj);

	/**
	 * @param string
	 */
	public List<Object> queryAll(String fromStr);   
}

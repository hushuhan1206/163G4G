package com.qhit.lh.g4.hsj.t8.service;

import java.util.List;

import com.qhit.lh.g4.hsj.t8.bean.User;


public interface BaseService {

	/**
	 * @param user
	 */
	public void add(Object obj);

	/**
	 * @param user
	 * @param i
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

	/**
	 * @param string
	 */
	public Object getObjectById(Class clazz,int id);
	/**
	 * @param string
	 * @return 
	 */
	public User doLogin(String userName, String userPassword);
  
}

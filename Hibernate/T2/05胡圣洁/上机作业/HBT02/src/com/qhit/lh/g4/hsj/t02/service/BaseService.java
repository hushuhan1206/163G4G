package com.qhit.lh.g4.hsj.t02.service;

import java.util.List;

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
}

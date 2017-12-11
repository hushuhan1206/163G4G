package com.qhit.lh.g4.hsj.t01.dao;


import java.util.List;

import com.qhit.lh.g4.hsj.t01.bean.User;

public interface BaseDao {
	
/**
 * @param user
 */
public void add(Object obj);

/**
 * @param user
 * @param i
 */
public void update(Object obj, int id);

/**
 * @param user
 */
public void delete(User user);

/**
 * @param string
 */
public List<Object> queryAll(String fromStr);   
}

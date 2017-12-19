package com.qhit.lh.g4.chen.t5.dao;

import java.util.List;

/**
 * @author 陈红雁
 *2017年12月19日上午11:09:52
 *TODO
 */
public interface BaseDao {


	public void add(Object obj);
	
    public void delete(Object obj);
    
    public void update(Object obj);
    
    public List<Object> queryAll();
}

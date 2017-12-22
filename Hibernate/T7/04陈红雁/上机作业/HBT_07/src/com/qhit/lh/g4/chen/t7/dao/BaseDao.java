package com.qhit.lh.g4.chen.t7.dao;

import java.util.List;

import com.qhit.lh.g4.chen.t7.bean.Emp;

public interface BaseDao {
/**
 * 
 * 按照员工姓名进行模糊查询
 */
	public List<Emp> getEmpByName();

	
	public void add(Object obj);
	
    public void delete(Object obj);
    
    public void update(Object obj);
    
    public List<Object> queryAll();
}

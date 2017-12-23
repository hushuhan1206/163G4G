package com.qhit.lh.g4.chen.t8.dao;

import java.util.List;

import com.qhit.lh.g4.chen.t8.bean.Emp;
/**
 * @author 陈红雁
 * 2017年12月23日上午9:31:41
 * TODO
 */
public interface BaseDao {
/**
 * 
 * 按照员工姓名进行模糊查询
 */
	public List<Emp> getEmpByName();

	
	public void add(Object obj);
	
    public void delete(Object obj);
    
    public void update(Object obj);

	public List<Object> queryAll(String fromStr);
}

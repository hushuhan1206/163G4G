package com.qhit.lh.g4.zzh.t7.service;

import java.util.List;

import com.qhit.lh.g4.zzh.t7.bean.Dept;
import com.qhit.lh.g4.zzh.t7.bean.Emp;

public interface BaseService {
	//统计函数
	public List<Object[]> getCount();
	//连接查询
	public List<Dept> getDept(String name);
	//new实例化模糊查询
	public List<Emp> getEmp(String name);
	//模糊查询
	public List<Emp> getEmpByName(String name);
	//挣
	public void add(Object obj);
	//删
	public void delete(Object obj);
	//改
	public void update(Object obj);
	public Object getObjectById(Class clazz,int id);
	//查
	public List<Object> queryAll(String fromStr);
}

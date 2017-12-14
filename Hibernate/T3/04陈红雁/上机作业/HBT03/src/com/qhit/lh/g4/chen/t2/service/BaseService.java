package com.qhit.lh.g4.chen.t2.service;

import org.hibernate.mapping.List;

import com.qhit.lh.g4.chen.t2.bean.Dept;

public interface BaseService {
	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public List queryAll(String fromStr);
	public <T> Object getObjectById(Dept dept,int id);

}

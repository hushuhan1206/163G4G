package com.qhit.lh.g4.chen.t6.service;

import org.hibernate.mapping.List;

import com.qhit.lh.g4.chen.t6.bean.Dept;
import com.qhit.lh.g4.chen.t6.bean.Emp;
import com.qhit.lh.g4.chen.t6.bean.UserInfo;

public interface BaseService {
	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public List queryAll(String fromStr);
}

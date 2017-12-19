package com.qhit.lh.g4.chen.t5.service;

import org.hibernate.mapping.List;

import com.qhit.lh.g4.chen.t5.bean.Dept;
import com.qhit.lh.g4.chen.t5.bean.Emp;

/**
 * @author 陈红雁
 *2017年12月19日上午11:10:05
 *TODO
 */
public interface BaseService {
	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public List queryAll(String fromStr);
	}

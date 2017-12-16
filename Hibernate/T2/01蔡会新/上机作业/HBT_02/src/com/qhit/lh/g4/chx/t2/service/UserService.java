package com.qhit.lh.g4.chx.t2.service;

import java.util.List;

/**
 * @author chx
 * 2017年12月12日下午4:00:55
 * TODO
 */
public interface UserService {
	
	public void add(Object obj);
	
	public void update(Object obj);
	
	public void delete(Object obj);
	
	public List<Object> queryAll(String fromStr);
}

package com.qhit.lh.g4.syw.t3.service;

import java.util.List;

public interface BaseService {
	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public List<Object> queryAll(String tableName);
}

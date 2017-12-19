package com.qhit.lh.g4.zhy.T2.dao;

import java.util.List;



public interface BaseDao {
public void add(Object object);
public void delete(Object object);
public void update(Object object);
public List<Object> queryAll(String  fromStr);
}

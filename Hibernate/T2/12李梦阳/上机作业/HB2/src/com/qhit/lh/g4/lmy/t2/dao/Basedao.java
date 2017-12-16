package com.qhit.lh.g4.lmy.t2.dao;

import java.util.List;

public interface Basedao {
public void add(Object object);
public void delete(Object object);
public void update(Object object);
public List<Object> queryAll(String sql);
}

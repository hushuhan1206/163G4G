package com.qhit.lh.g4.shutu.t2.dao;

import java.util.List;

/**
 * @author shutu
 *2017年12月16日上午9:31:50
 *TODO
 */
public interface Basedao {
public void add(Object object);
public void delete(Object object);
public void update(Object object);
public List<Object> queryAll(String sql);
}

/**
 * 
 */
package com.qhit.lh.g4.shutu.t3.dao;

import java.io.Serializable;
import java.util.List;
/**
 * @author S01
 *2017年12月16日上午10:20:02
 *TODO
 */
public interface Basedao {
public void add(Object object);
public void delete(Object object);
public void update(Object object);
public Object getObjectById(Class clazz,Serializable id);
public List<Object> queryAll(String sql);
}

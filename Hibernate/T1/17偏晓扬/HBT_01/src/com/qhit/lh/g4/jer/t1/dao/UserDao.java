package com.qhit.lh.g4.jer.t1.dao;

import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import com.qhit.lh.g4.jer.t1.bean.User;

/**
 * @author 偏晓阳
 * 2017年12月9日上午10:36:44
 * TODO
 */
public interface UserDao {
	public void add(Object obj);
	
	public void update(Object obj);
	
	public void delete(Object obj);
	
	public List<Object> queryAll(String fromStr);
}

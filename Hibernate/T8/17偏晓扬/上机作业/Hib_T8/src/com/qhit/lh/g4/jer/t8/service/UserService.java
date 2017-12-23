package com.qhit.lh.g4.jer.t8.service;

import java.util.List;

import com.qhit.lh.g4.jer.t8.bean.Emp;
import com.qhit.lh.g4.jer.t8.bean.UserInfo;

/**
 * @author 偏晓阳
 * 2017年12月20日下午5:14:01
 * TODO
 */
public interface UserService {
	
	public void add(Object obj);
	
	public void update(Object obj);
	
	public void delete(Object obj);
	
	public List<Object> queryAll(String fromStr);
	
	public Object getObjectById(Class clazz,int id);
	
	public List<Emp> getEmpByName(String name);
	
	public List<UserInfo> login(UserInfo user);
}

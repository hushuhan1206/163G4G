package com.qhit.lh.g4.chen.t8.service;

import java.util.List;

import org.apache.tomcat.jni.User;

import com.qhit.lh.g4.chen.t8.bean.Dept;
import com.qhit.lh.g4.chen.t8.bean.Emp;
import com.qhit.lh.g4.chen.t8.bean.UserInfo;
/**
 * @author 陈红雁
 * 2017年12月23日上午9:31:41
 * TODO
 */
public interface BaseService {
	
	
	public List<UserInfo> login(UserInfo user);
	/**
	 * 
	 * 按照员工姓名进行模糊查询
	 */
	public List<Emp> getEmpByName();
	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public List queryAll(String fromStr);
	public Object getObjectById(Class clazz, int id);
	
}

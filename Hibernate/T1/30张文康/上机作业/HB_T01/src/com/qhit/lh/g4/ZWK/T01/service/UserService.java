package com.qhit.lh.g4.ZWK.T01.service;

import java.util.List;

import com.qhit.lh.g4.ZWK.T01.bean.User;

public interface UserService {

	
	public void add(Object obj);
	public void delete(Object arg0);
	public User getUser( int id);
	public void update(Object obj);
	public List<Object> getList(String str);
}

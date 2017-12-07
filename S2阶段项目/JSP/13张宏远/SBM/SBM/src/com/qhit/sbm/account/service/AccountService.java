/**
 * 
 */
package com.qhit.sbm.account.service;

import java.util.List;

import com.qhit.sbm.common.bean.PageBean;

/**
 * @author admin
 * 2017年11月11日
 */
public interface AccountService {
	
	/**
	 * @param pageBean
	 * @return
	 * 查询分页数据
	 */
	public PageBean getAccount(PageBean pageBean);
	
	/**
	 * @param tableName
	 * @return
	 * 先获取总页数
	 */
	public int getCount(List<String> wheres,List<String> values);
	
	/**
	 * @param pageBean
	 * @return
	 * 查询分页数据
	 */
	public PageBean getAccount(PageBean pageBean,List<String> wheres, List<String> values);
}

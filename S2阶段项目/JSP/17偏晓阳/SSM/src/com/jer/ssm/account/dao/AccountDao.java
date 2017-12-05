package com.jer.ssm.account.dao;

import java.util.List;


import com.jer.ssm.common.bean.PageBean;
import com.jer.ssm.goods.bean.Goods;

public interface AccountDao {
	
	
	public int deleteAccountById(int accountId);
	

	public int updateAccount(int accountId, int isPayed);
	
	
	public int addAccount(Goods goods, int providerId,int isPayed, int businessNum);

	
	public PageBean getAccount(PageBean pageBean);
	
	public int getCount(List<String> wheres,List<String> values);
	
	
	public PageBean getAccount(PageBean pageBean,List<String> wheres, List<String> values);
}

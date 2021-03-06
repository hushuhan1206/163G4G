package com.fjl.sbm.common.dao;

import java.util.List;

import com.fjl.sbm.common.bean.PageBean;

public interface CommonDao {
	public PageBean getCount(int p, String isPayed, String goodsName);
	public PageBean getUserCount(int p,String userName);
	public PageBean getProviderCount(int p,String providerName,String providerDetail);
}

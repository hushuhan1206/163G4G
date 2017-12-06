package com.fjl.sbm.common.service;

import java.util.List;

import com.fjl.sbm.common.bean.PageBean;

public interface CommonService {
	public PageBean getCount(int p,String isPayed ,String goodsName);
	public PageBean getUserCount(int p,String userName);
	public PageBean getProviderCount(int p,String providerName,String providerDetail);
}

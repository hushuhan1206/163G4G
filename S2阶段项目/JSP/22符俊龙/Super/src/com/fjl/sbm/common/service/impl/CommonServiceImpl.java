package com.fjl.sbm.common.service.impl;



import com.fjl.sbm.common.bean.PageBean;
import com.fjl.sbm.common.dao.impl.CommonDaoImpl;
import com.fjl.sbm.common.service.CommonService;


public class CommonServiceImpl implements CommonService {

	@Override
	public PageBean getCount(int p, String isPayed, String goodsName) {
		// TODO Auto-generated method stub
		return new CommonDaoImpl().getCount(p, isPayed, goodsName);
	}

	@Override
	public PageBean getUserCount(int p, String userName) {
		// TODO Auto-generated method stub
		return new CommonDaoImpl().getUserCount(p, userName);
	}

	@Override
	public PageBean getProviderCount(int p, String providerName,String providerDetail) {
		// TODO Auto-generated method stub
		return new CommonDaoImpl().getProviderCount(p, providerName, providerDetail);
	}









}

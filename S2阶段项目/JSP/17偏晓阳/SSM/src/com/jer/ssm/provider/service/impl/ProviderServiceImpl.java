package com.jer.ssm.provider.service.impl;

import java.util.List;

import com.jer.ssm.provider.bean.Provider;
import com.jer.ssm.provider.dao.impl.ProviderDaoImpl;
import com.jer.ssm.provider.service.ProviderService;

public class ProviderServiceImpl implements ProviderService{
	@Override
	public List<Provider> getProvider() {
		// TODO Auto-generated method stub
		return new ProviderDaoImpl().getProvider();
	}
}

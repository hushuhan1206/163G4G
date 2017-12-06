package com.fjl.sbm.provider.dao;

import java.util.List;

import com.fjl.sbm.provider.bean.Provider;

public interface ProviderDao {
	public List<Provider> getProvider();
	public int updateProvider(Provider provider);
	public int addProvider(Provider provider);
}

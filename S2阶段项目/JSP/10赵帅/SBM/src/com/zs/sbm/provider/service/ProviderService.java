/**
 * 
 */
package com.zs.sbm.provider.service;

import java.util.List;

import com.zs.sbm.provider.bean.Provider;

/**
 * @author admin
 * 2017年11月11日
 */
public interface ProviderService {

	/**
	 * @return
	 * 查询所有的供应商
	 */
	public List<Provider> getProvider();
}

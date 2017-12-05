/**
 * 
 */
package com.qhit.sbm.account.service.impl;

import java.util.List;

import com.qhit.sbm.account.dao.impl.AccountDaoImpl;
import com.qhit.sbm.account.service.AccountService;
import com.qhit.sbm.common.bean.PageBean;

/**
 * @author admin
 * 2017年11月11日
 */
public class AccountServiceImpl implements AccountService {

	@Override
	public PageBean getAccount(PageBean pageBean) {
		// TODO Auto-generated method stub
		return new AccountDaoImpl().getAccount(pageBean);
	}

	@Override
	public int getCount(List<String> wheres,
			List<String> values) {
		// TODO Auto-generated method stub
		return new AccountDaoImpl().getCount(wheres, values);
	}

	@Override
	public PageBean getAccount(PageBean pageBean, List<String> wheres,
			List<String> values) {
		// TODO Auto-generated method stub
		return new AccountDaoImpl().getAccount(pageBean,wheres,values);
	}

}

/**
 * 
 */
package com.sea.sbms.account.service.impl;

import java.util.List;

import com.sea.sbms.account.dao.impl.AccountDaoImpl;
import com.sea.sbms.account.service.AccountService;
import com.sea.sbms.common.bean.PageBean;
import com.sea.sbms.goods.bean.Goods;

/**
 * @author admin 2017年11月11日
 */
public class AccountServiceImpl implements AccountService {

	@Override
	public PageBean getAccount(PageBean pageBean) {
		return new AccountDaoImpl().getAccount(pageBean);
	}

	@Override
	public int getCount(List<String> wheres, List<String> values) {
		return new AccountDaoImpl().getCount(wheres, values);
	}

	@Override
	public PageBean getAccount(PageBean pageBean, List<String> wheres,
			List<String> values) {
		return new AccountDaoImpl().getAccount(pageBean, wheres, values);
	}

	@Override
	public int addAccount(Goods goods, int providerId, int isPayed,
			int businessNum) {
		return new AccountDaoImpl().addAccount(goods, providerId, isPayed,
				businessNum);
	}

	@Override
	public int updateAccount(int accountId, int isPayed) {
		return new AccountDaoImpl().updateAccount(accountId, isPayed);
	}

	@Override
	public int deleteAccountById(int accountId) {
		return new AccountDaoImpl().deleteAccountById(accountId);
	}

}

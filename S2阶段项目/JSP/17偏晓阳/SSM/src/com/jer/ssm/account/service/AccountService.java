package com.jer.ssm.account.service;

import java.util.List;

import com.jer.ssm.common.bean.PageBean;
import com.jer.ssm.goods.bean.Goods;

	public interface AccountService {
		
		/**
		 * @param accountId
		 * @return
		 */
		public int deleteAccountById(int accountId);
		
		
		/**
		 * @param accountId
		 * @param isPayed
		 * @return
		 * 修改id为accountId的isPayed的值
		 */
		public int updateAccount(int accountId, int isPayed);
		
		/**
		 * @param goods
		 * @param providerId
		 * @param isPayed
		 * @param businessNum
		 * @return
		 */
		public int addAccount(Goods goods, int providerId,int isPayed, int businessNum);
		
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


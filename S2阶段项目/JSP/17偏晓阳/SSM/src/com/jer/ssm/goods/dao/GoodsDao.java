package com.jer.ssm.goods.dao;

import com.jer.ssm.goods.bean.Goods;

public interface GoodsDao {
	public int updateGoods(int goodsNum, int goodsId);
	public Goods getGoodsInfoByName(String goodsName);

}

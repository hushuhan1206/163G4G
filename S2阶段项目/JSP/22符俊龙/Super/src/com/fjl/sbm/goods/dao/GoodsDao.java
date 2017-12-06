package com.fjl.sbm.goods.dao;

import com.fjl.sbm.goods.bean.Goods;

public interface GoodsDao {
	public int updateGoods(int goodsNum, int goodsId);
	public Goods getGoodsInfoByName(String goodsName);
}

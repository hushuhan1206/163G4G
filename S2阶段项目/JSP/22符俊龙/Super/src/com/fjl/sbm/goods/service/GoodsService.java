package com.fjl.sbm.goods.service;

import com.fjl.sbm.goods.bean.Goods;

public interface GoodsService {
	public int updateGoods(int goodsNum, int goodsId);
	public Goods getGoodsInfoByName(String goodsName);
}

package com.jer.ssm.goods.service;

import com.jer.ssm.goods.bean.Goods;

public interface GoodsService {
	public int updateGoods(int goodsNum, int goodsId);
	public Goods getGoodsInfoByName(String goodsName);

}

/**
 * 
 */
package com.syw.sbm.goods.service.impl;

import com.syw.sbm.goods.bean.Goods;
import com.syw.sbm.goods.dao.impl.GoodsDaoImpl;
import com.syw.sbm.goods.service.GoodsService;

/**
 * @author admin
 * 2017年11月15日
 */
public class GoodsServiceImpl implements GoodsService {

	@Override
	public Goods getGoodsInfoByName(String goodsName) {
		// TODO Auto-generated method stub
		return new GoodsDaoImpl().getGoodsInfoByName(goodsName);
	}

	@Override
	public int updateGoods(int goodsNum, int goodsId) {
		// TODO Auto-generated method stub
		return new GoodsDaoImpl().updateGoods(goodsNum, goodsId);
	}

}

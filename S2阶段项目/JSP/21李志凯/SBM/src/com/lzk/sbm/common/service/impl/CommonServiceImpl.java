/**
 * 
 */
package com.lzk.sbm.common.service.impl;

import java.util.List;

import com.lzk.sbm.common.dao.impl.CommonDaoImpl;
import com.lzk.sbm.common.service.CommonService;

/**
 * @author admin
 * 2017年11月14日
 */
public class CommonServiceImpl implements CommonService {

	@Override
	public int getCount(String tableName, List<String> wheres, List<String> values) {
		return new CommonDaoImpl().getCount(tableName, wheres, values);
	}

}

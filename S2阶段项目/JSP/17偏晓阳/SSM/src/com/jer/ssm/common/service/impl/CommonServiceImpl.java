package com.jer.ssm.common.service.impl;

import java.util.List;

import com.jer.ssm.common.dao.impl.CommonDaoImpl;
import com.jer.ssm.common.service.CommonService;

public class CommonServiceImpl implements CommonService{
	@Override
	public int getCount(String tableName, List<String> wheres, List<String> values) {
		return new CommonDaoImpl().getCount(tableName, wheres, values);
	}
}

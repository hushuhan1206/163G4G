/**
 * 
 */
package com.qhit.lh.g4.WMH.HB_T02.service.impl;

import com.qhit.lh.g4.WMH.HB_T02.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.WMH.HB_T02.service.BaseService;

/**
 * @author WMH
 *2017年12月12日下午3:18:22
 *TODO
 */
public class BaseServiceImpl implements BaseService {
		private BaseDaoImpl bdi = new BaseDaoImpl();
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.ZWK.HB_T02.service.BaseService#add(java.lang.Object)
	 */
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		bdi.add(obj);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.ZWK.HB_T02.service.BaseService#delete(java.lang.Object)
	 */
	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		bdi.delete(obj);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.ZWK.HB_T02.service.BaseService#update(java.lang.Object)
	 */
	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		bdi.update(obj);
	}

}

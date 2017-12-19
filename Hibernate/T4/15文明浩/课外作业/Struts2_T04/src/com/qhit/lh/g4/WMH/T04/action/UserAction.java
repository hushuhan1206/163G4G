package com.qhit.lh.g4.WMH.T04.action;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g4.WMH.T04.bean.TbUser;
import com.qhit.lh.g4.WMH.T04.bean.User;
import com.qhit.lh.g4.WMH.T04.service.Impl.BaseServiceImpl;
import com.qhit.lh.g4.WMH.T04.service.Impl.UserServiceImpl;

public class UserAction extends ActionSupport {

	private User user;
	private UserServiceImpl usi = new UserServiceImpl();
	
	private TbUser tbuser;
	private BaseServiceImpl bsi = new BaseServiceImpl();
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public TbUser getTbuser() {
		return tbuser;
	}

	public void setTbuser(TbUser tbuser) {
		this.tbuser = tbuser;
	}

	public BaseServiceImpl getBsi() {
		return bsi;
	}

	public void setBsi(BaseServiceImpl bsi) {
		this.bsi = bsi;
	}

	public String add() throws Exception{
			bsi.add(tbuser);
			return "success";	
	}	
	public String delete() throws Exception{

		return "success";
	}
	public String update() throws Exception{

		return "success";
	}
	public String query() throws Exception{

		return "success";
	}

}

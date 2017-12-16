package com.qhit.lh.g4.rcc.t1.action;

import java.util.List;

import com.qhit.lh.g4.rcc.t1.bean.user;
import com.qhit.lh.g4.rcc.t1.dao.BaseDao;
import com.qhit.lh.g4.rcc.t1.dao.impl.BaseDaoImpl;


public class DeptAction {
	private user dept;
	private List<Dept> deptlist;
	private BaseDao basedao = new BaseDaoImpl();

	@SuppressWarnings("unchecked")
	public String list(){
		setDeptlist((List<Dept>)basedao.getObjects("from Dept"));
		return "list";		
	}

	public String add(){
		if(dept!=null){ basedao.add(dept);}
		return "tolist";
	}
	public String delete(){
		dept=(user)basedao.getObjectById(Dept.class,dept.getOid());
		basedao.delete(dept);
		return "tolist";
	}
	public String toUpdte(){
		dept=(user)basedao.getObjectById(Dept.class,dept.getOid());
		return "toupdate";
	}
	public String update(){
		Dept olddept = (Dept)basedao.getObjectById(Dept.class,dept.getOid());
		olddept.setDeptname(dept.getUname());
		olddept.setAddress(dept.getAddress());

		basedao.update(olddept);
		return "tolist";
	}

	public List<Dept> getDeptlist() {
		return deptlist;
	}

	public void setDeptlist(List<Dept> deptlist) {
		this.deptlist = deptlist;
	}

}

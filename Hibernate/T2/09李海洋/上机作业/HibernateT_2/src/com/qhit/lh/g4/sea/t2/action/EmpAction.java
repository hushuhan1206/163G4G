/**
 * 
 */
package com.qhit.lh.g4.sea.t2.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g4.sea.t2.bean.Emp;
import com.qhit.lh.g4.sea.t2.bean.EmpInfo;
import com.qhit.lh.g4.sea.t2.dao.BaseDao;
import com.qhit.lh.g4.sea.t2.dao.impl.BaseDaoImpl;

/**
 * @author 李海洋
 *TODO
 *2017年12月11日上午8:39:58
 */
public class EmpAction extends ActionSupport {
	//数据
	private Emp emp;
	private EmpInfo empInfo;
	private List<Emp> emplist;
	//业务
	private BaseDao baseDao = new BaseDaoImpl();
	//遍历查询emp
	public String list(){
		emplist = baseDao.getObjects("from Emp");
		return "list";
	}
	//添加
	public String add(){
		
		emp.setEmpInfo(empInfo);
		empInfo.setEmp(emp);
		baseDao.add(emp);
		return "tolist";
	}
	//进入添加页面
	public String toadd(){
		return "add";
	}
	//进入修改页面
	public String toupdate(){
		emp = (Emp) baseDao.getObjectById(Emp.class, emp.getEid());
		empInfo = emp.getEmpInfo();
		return "update";
	}
	//修改
	public String update(){
		Emp oldemp = (Emp) baseDao.getObjectById(Emp.class, emp.getEid());
		oldemp.setEname(emp.getEname());
		oldemp.setEsex(emp.getEsex());
		oldemp.setEbirth(emp.getEbirth());
		oldemp.getEmpInfo().setName(empInfo.getName());
		oldemp.getEmpInfo().setPwd(empInfo.getPwd());
		baseDao.update(oldemp);
		return "tolist";
	}
	//删除
	public String delete(){
		Emp oldemp = (Emp) baseDao.getObjectById(Emp.class, emp.getEid());
		baseDao.delete(oldemp);
		return "tolist";
	}
	
	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public EmpInfo getEmpInfo() {
		return empInfo;
	}

	public void setEmpInfo(EmpInfo empInfo) {
		this.empInfo = empInfo;
	}
	public List<Emp> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<Emp> emplist) {
		this.emplist = emplist;
	}
}

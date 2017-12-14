/**
 * 
 */
package com.qhit.lh.g4.sea.t3.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g4.sea.t3.bean.Dept;
import com.qhit.lh.g4.sea.t3.bean.Emp;
import com.qhit.lh.g4.sea.t3.dao.BaseDao;
import com.qhit.lh.g4.sea.t3.dao.impl.BaseDaoImpl;

/**
 * @author 李海洋
 *TODO
 *2017年12月11日下午4:25:25
 */
public class EmpAction extends ActionSupport {
	//数据
	private Emp emp;
	private List<Emp> emplist;
	private List<Dept> deptlist;
	//业务
	private BaseDao baseDao = new BaseDaoImpl();
	//遍历查询emp
	public String list(){
		emplist = baseDao.getObjects("from Emp");
		return "list";
	}
	//添加
	public String add(){
		Dept dept = (Dept) baseDao.getObjectById(Dept.class, emp.getDid());
		emp.setDept(dept);
		baseDao.add(emp);
		return "tolist";
	}
	//进入添加页面前先查询部门表
	public String toadd(){
		deptlist = baseDao.getObjects("from Dept");
		return "add";
	}
	//进入修改页面
	public String toupdate(){
		deptlist = baseDao.getObjects("from Dept");
		emp = (Emp) baseDao.getObjectById(Emp.class, emp.getEid());
		return "update";
	}
	//修改
	public String update(){
		Emp oldemp = (Emp) baseDao.getObjectById(Emp.class, emp.getEid());
		oldemp.setEname(emp.getEname());
		oldemp.setEsex(emp.getEsex());
		oldemp.setEbirth(emp.getEbirth());
		
		Dept dept = (Dept) baseDao.getObjectById(Dept.class, emp.getDid());
		oldemp.setDept(dept);
		
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
	
	public List<Emp> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<Emp> emplist) {
		this.emplist = emplist;
	}
	public List<Dept> getDeptlist() {
		return deptlist;
	}
	public void setDeptlist(List<Dept> deptlist) {
		this.deptlist = deptlist;
	}
	
}

/**
 * 
 */
package com.qhit.lh.g4.sea.t7.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g4.sea.t7.bean.Dept;
import com.qhit.lh.g4.sea.t7.bean.Emp;
import com.qhit.lh.g4.sea.t7.service.BaseService;
import com.qhit.lh.g4.sea.t7.service.impl.BaseServiceImpl;

/**
 * @author 李海洋
 *TODO
 *2017年12月16日上午9:47:04
 */
public class EmpAction extends ActionSupport {
	//业务
	private BaseService baseService = new BaseServiceImpl();
	//数据
	private Emp emp;
	private Dept dept;
	private List<Emp> emplist;
	private List<Dept> deptlist;
	//处理方法
	public String getAll(){
		deptlist = baseService.getObjects("from Dept");
		String hql = "from Emp e where 1 = 1 ";
		if (emp!=null) {
			if (emp.getEname()!=null && emp.getEname().equals("")) {
				hql += " and e.ename like '%" + emp.getEname() + "%' ";
			}
			if (emp.getDid()!=null && emp.getDid().equals("")) {
				hql += " and dname =" + dept.getDname() ;
			}
		}
		emplist = baseService.getObjects(hql);
		
		return "list";
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


	public Dept getDept() {
		return dept;
	}


	public void setDept(Dept dept) {
		this.dept = dept;
	}
}

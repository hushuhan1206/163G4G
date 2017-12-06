package com.qhit.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.qhit.dao.EmpDAO;
import com.qhit.vo.Employee;

public class EmpAction extends ActionSupport implements SessionAware {

	private Employee emp;

	private List elist;
	private List dlist;
	private EmpDAO empDAO = new EmpDAO();

	private Map<String, Object> session;

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public List getElist() {
		return elist;
	}

	public void setElist(List elist) {
		this.elist = elist;
	}

	public List getDlist() {
		return dlist;
	}

	public void setDlist(List dlist) {
		this.dlist = dlist;
	}

	// �б� + ��ѯ
	public String listEmp() {
		dlist = empDAO.findAlldepts();
		elist = empDAO.findAllEmps(emp);
		return "list_emp";

	}

	// ���
	public String addEmp() {
		if (emp != null) {
			if (empDAO.addEmp(emp)) {
				return "add_emp";
			}
		}
		return Action.ERROR;
	}

	// �޸�
	public String updateEmp() {
		if (emp != null) {
			if (empDAO.updateEmp(emp)) {
				return "update_emp";
			}
		}

		return Action.ERROR;

	}

	// ת���
	public String toAddEmp() {
		this.session.put("dlist", empDAO.findAlldepts());
		return "to_addemp";

	}

	// ת�޸�
	public String toUpdateEmp() {
		this.session.put("dlist", empDAO.findAlldepts());
		if (emp.getEid() != null) {
			emp = empDAO.findEmpById(emp.getEid());
			return "to_updateemp";
		}
		return Action.ERROR;

	}

	public String delEmp() {
		if (emp.getEid() != null) {

			if (empDAO.delEmp(emp.getEid())) {
				return "del_emp";
			}

		}
		return Action.ERROR;
	}

	// ָ������������֤�淶 : public void validate+��֤�ķ�����.[����������ĸ��д]

	public void validateAddEmp() {
		// TODO Auto-generated method stub
		System.out.println("validating addEmp .................");
		if (emp.getEname() == null || "".equals(emp.getEname())) {
			this.addFieldError("emp.ename", "�û�������Ϊ��");

		}

	}

	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}

}

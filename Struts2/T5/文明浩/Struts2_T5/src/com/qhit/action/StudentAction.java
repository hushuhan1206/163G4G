package com.qhit.action;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.qhit.dao.StudentDAO;
import com.qhit.vo.Student;

public class StudentAction extends ActionSupport {

	private Student student;

	private StudentDAO studentdao = new StudentDAO();

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("execute running ................");
		if (studentdao.addStu(student)) {
			return "add_student";
		} else {
			// Actionҵ�񷽷����صĴ���ת����addstu.jspҳ�������ʾ
			this.addActionError("���ݲ�����,���ʧ��,��ȷ�Ϻ��������");
			return Action.INPUT;

		}

	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		System.out.println("execute validating ................");
		// ������֤����
		if (student.getSid() == null) {
			// �����֤ʧ��,��ʧ�ܵ���Ϣ������validationawre�ӿ��н��б���
			this.addFieldError("student.sid", "ѧԱ��Ų���Ϊ��,����������.");
		}
		if (student.getSname() == null || "".equals(student.getSname())) {

			this.addFieldError("student.sname", "ѧԱ��������Ϊ��!");
				
			
		}

		super.validate();
	}

}

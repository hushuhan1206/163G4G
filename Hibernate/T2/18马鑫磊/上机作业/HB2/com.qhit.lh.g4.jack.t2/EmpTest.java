import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.jack.t2.bean.Emp;
import com.qhit.lh.g4.jack.t2.bean.Userinfo;
import com.qhit.lh.g4.jack.t2.dao.Basedao;
import com.qhit.lh.g4.jack.t2.dao.impl.BasedaoImpl;


public class EmpTest {
	private Basedao basedao =new BasedaoImpl();
@Test
public void  add(){
	Emp emp =new Emp();
	emp.setEbirthday("1997-09-27");
	emp.setEdid("技术部");
	emp.setEname("马鑫磊");
	emp.setEsex("M");
	Userinfo userinfo =new Userinfo();
	userinfo.setUname("mxl");
	userinfo.setUpwd("123456");
	emp.setUserinfo(userinfo);
	userinfo.setEmp(emp);
	basedao.add(emp);
	
}
@Test
public void  delete(){
	Emp emp =new Emp();
	emp.setEid(1);
	basedao.delete(emp);
}
@Test
public void  update(){
	Emp emp =new Emp();
	emp.setEid(3);
	emp.setEbirthday("1997-10-27");
	emp.setEdid("技术部");
	emp.setEname("马鑫磊");
	emp.setEsex("M");
	Userinfo userinfo =new Userinfo();
	userinfo.setUid(3);
	userinfo.setUname("mxl");
	userinfo.setUpwd("123456");
	emp.setUserinfo(userinfo);
	basedao.update(emp);
}
@Test
public void  queryAll(){
	String sql ="from Emp";
	
	List<Object> list=basedao.queryAll(sql);
	for (Object object : list) {
		Emp emp =(Emp) object;
		System.out.println(emp.toString());
	}
}
}

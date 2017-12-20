package text;
/**
 * 
 */
/**
 * @author S01
 *2017年12月16日上午10:06:52
 *TODO
 */
import java.util.List;

import com.qhit.lh.g4.shutu.t2.been.Emp;
import com.qhit.lh.g4.shutu.t2.been.Userinfo;
import com.qhit.lh.g4.shutu.t2.dao.Basedao;
import com.qhit.lh.g4.shutu.t2.dao.impl.BasedaoImpl;


public class EmpTest {
	private Basedao basedao =new BasedaoImpl();

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
public void  delete(){
	Emp emp =new Emp();
	emp.setEid(1);
	basedao.delete(emp);
}

public void  update(){
	Emp emp =new Emp();
	emp.setEid(3);
	emp.setEbirthday("1997-9-23");
	emp.setEdid("d");
	emp.setEname("shutu");
	emp.setEsex("n");
	Userinfo userinfo =new Userinfo();
	userinfo.setUid(3);
	userinfo.setUname("xel");
	userinfo.setUpwd("yun123");
	emp.setUserinfo(userinfo);
	basedao.update(emp);
}

public void  queryAll(){
	String sql ="from Emp";
	
	List<Object> list=basedao.queryAll(sql);
	for (Object object : list) {
		Emp emp =(Emp) object;
		System.out.println(emp.toString());
	}
}
}

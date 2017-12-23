package com.qhit.lh.g4.lmy.t6.bean;

import com.qhit.lh.g4.lmy.t6.bean.Emp;
import com.qhit.lh.g4.lmy.t6.bean.Role;



/**
 * Userinfo entity. @author MyEclipse Persistence Tools
 */

public class Userinfo  implements java.io.Serializable {


    // Fields    

     private Integer uid;
     private String uname;
     private String upwd;

     private Emp emp;
     private Role roles;

    // Constructors

    /** default constructor */
    public Userinfo() {
    }

    
    public Emp getEmp() {
		return emp;
	}


	public void setEmp(Emp emp) {
		this.emp = emp;
	}


	public Role getRoles() {
		return roles;
	}


	public void setRoles(Role roles) {
		this.roles = roles;
	}


	/** full constructor */
    public Userinfo(String uname, String upwd) {
        this.uname = uname;
        this.upwd = upwd;
    }

   
    // Property accessors

    public Integer getUid() {
        return this.uid;
    }
    
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return this.uname;
    }
    
    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return this.upwd;
    }
    
    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }
   








}
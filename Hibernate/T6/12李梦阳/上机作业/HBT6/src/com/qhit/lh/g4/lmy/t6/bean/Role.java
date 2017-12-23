package com.qhit.lh.g4.lmy.t6.bean;

import java.util.HashSet;

import com.qhit.lh.g4.lmy.t6.bean.Userinfo;



/**
 * Role entity. @author MyEclipse Persistence Tools
 */

public class Role  implements java.io.Serializable {


    // Fields    

     private Integer roleId;
     private String roleName;
     private String memo;
     
     private HashSet<Userinfo> user=new HashSet<Userinfo>();

    // Constructors



	public HashSet<Userinfo> getUser() {
		return user;
	}


	public void setUser(HashSet<Userinfo> user) {
		this.user = user;
	}


	/** default constructor */
    public Role() {
    }

    
    /** full constructor */
    public Role(String roleName, String memo) {
        this.roleName = roleName;
        this.memo = memo;
    }

   
    // Property accessors

    public Integer getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getMemo() {
        return this.memo;
    }
    
    public void setMemo(String memo) {
        this.memo = memo;
    }
   








}
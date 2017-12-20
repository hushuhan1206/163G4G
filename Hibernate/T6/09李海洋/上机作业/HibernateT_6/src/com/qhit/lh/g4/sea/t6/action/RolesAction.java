/**
 * 
 */
package com.qhit.lh.g4.sea.t6.action;

import java.util.Iterator;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g4.sea.t6.bean.Roles;
import com.qhit.lh.g4.sea.t6.bean.UserInfo;
import com.qhit.lh.g4.sea.t6.service.BaseService;
import com.qhit.lh.g4.sea.t6.service.impl.BaseServiceImpl;

/**
 * @author 李海洋
 *TODO
 *2017年12月20日下午3:32:35
 */
public class RolesAction extends ActionSupport {
	//数据
	private Roles role;
	private List<Roles> rolelist;
	private List<UserInfo> userlist;
	private Integer[] userId;

	//业务
	private BaseService baseService = new BaseServiceImpl();
	//方法
	//遍历查询
	public String list(){
		rolelist = baseService.getObjects("from Roles");
		return "list";
	}
	//去添加页面
	public String toAdd(){
		userlist = baseService.getObjects("from UserInfo");
		return "add";
	}
	//进行添加
	public String add(){
		if (userId!=null) {
			for (Integer i : userId) {
				UserInfo user = (UserInfo) baseService.getObjectById(UserInfo.class, i);
				role.getUsers().add(user);
			}
		}
		baseService.add(role);
		return "tolist";
	}
	//进入修改页面
	public String toUpdate(){
		role = (Roles) baseService.getObjectById(Roles.class, role.getRoleId());
		userlist = baseService.getObjects("from UserInfo");

		userId = new Integer[role.getUsers().size()];
		Iterator<UserInfo> it = role.getUsers().iterator();
		int i = 0;
		while (it.hasNext()) {
			UserInfo user = it.next();
			userId[i++] = user.getUserId();
		}
		return "update";
	}
	//进行修改
	public String update(){
		Roles oldrole = (Roles) baseService.getObjectById(Roles.class, role.getRoleId());
		oldrole.setRoleName(role.getRoleName());
		oldrole.setMemo(role.getMemo());

		oldrole.getUsers().clear();
		if (userId!=null) {
			for (Integer i : userId) {
				UserInfo user = (UserInfo) baseService.getObjectById(UserInfo.class, i);
				oldrole.getUsers().add(user);
			}
		}
		baseService.update(oldrole);
		return "tolist";
	}
	//删除
	public String delete(){
		Roles oldrole = (Roles) baseService.getObjectById(Roles.class, role.getRoleId());
		baseService.delete(oldrole);
		return "tolist";
	}
	
	public Roles getRole() {
		return role;
	}
	public void setRole(Roles role) {
		this.role = role;
	}
	public List<Roles> getRolelist() {
		return rolelist;
	}
	public void setRolelist(List<Roles> rolelist) {
		this.rolelist = rolelist;
	}
	public List<UserInfo> getUserlist() {
		return userlist;
	}
	public void setUserlist(List<UserInfo> userlist) {
		this.userlist = userlist;
	}
	public Integer[] getUserId() {
		return userId;
	}
	public void setUserId(Integer[] userId) {
		this.userId = userId;
	}

}

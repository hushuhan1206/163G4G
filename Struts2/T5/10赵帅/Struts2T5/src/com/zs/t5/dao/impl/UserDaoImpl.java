package com.zs.t5.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.zs.t5.bean.User;
import com.zs.t5.dao.UserDao;
import com.zs.t5.utils.DBManager;

public class UserDaoImpl implements UserDao{

	private Connection con;
	private PreparedStatement ps;

	@Override
	public void add(User user) {
		// TODO 添加
		con = DBManager.getConnection();
		String sql="insert into t_crud values (?,?,?,?,?)";
		try{
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getName());
			ps.setString(2, user.getPwd());
			ps.setString(3, user.getBrithday());
			ps.setString(4, user.getSex());
			ps.setInt(5,user.getActive());
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public void del(int id){
		//删除
		con = DBManager.getConnection();
		String sql="delete from t_crud where userId = ?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void update(User user){
		//修改
		con = DBManager.getConnection();
		String sql="update t_crud set name=?,pwd=?,brithday=?,sex=?,active=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1,user.getName());
			ps.setString(2, user.getPwd());
			ps.setString(3, user.getBrithday());
			ps.setString(4, user.getSex());
			ps.setInt(5, user.getActive());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void select(User user) {
		// 遍历查询
		con = DBManager.getConnection();
		String sql="select * from t_crud where id=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, user.getId());
			ps.setString(2, user.getName());
			ps.setString(3, user.getPwd());
			ps.setString(4, user.getBrithday());
			ps.setString(5, user.getSex());
			ps.setInt(6,user.getActive());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

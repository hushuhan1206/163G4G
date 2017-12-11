/**
 * 
 */
package com.qhit.lh.g4.hsj.sbm.user.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.qhit.lh.g4.hsj.sbm.user.bean.User;
import com.qhit.lh.g4.hsj.sbm.user.dao.UserDao;
import com.qhit.lh.g4.hsj.sbm.utils.DBManager;


/**
 * @author 胡圣洁
 * TODO
 * 2017年12月8日下午10:17:45
 */
public class UserDaoImpl implements UserDao {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private User user = null;

	@Override
	public User doLogin(String userName, String userPassword) {
		con = DBManager.getConnection();
		String sql = "select * from tb_user where userName = ? and userPassword = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, userName);
			ps.setString(2, userPassword);
			
			rs = ps.executeQuery();
			
			if(rs.next()){
				user = new User(
						rs.getInt("userId"), 
						userName, 
						userPassword, 
						rs.getString("userSex"), 
						rs.getInt("userAge"), 
						rs.getString("telephone"), 
						rs.getString("address"), 
						rs.getString("pic"), 
						rs.getInt("type"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBManager.close(ps, con);
		}
		return user;
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.hsj.sbm.user.dao.UserDao#getAllUser()
	 */
	@Override
	public List<User> getAllUser() {
		User user = null;
		List<User> users = new ArrayList<>();
		con = DBManager.getConnection();
		String sql = "select * from tb_user";
		try {
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				user = new User(rs.getInt("userId"), 
						rs.getString("userName"), 
						rs.getString("userPassword"), 
						rs.getString("userSex"), 
						rs.getInt("userAge"),
						rs.getString("telephone"), 
						rs.getString("address"), 
						rs.getString("pic"), 
						rs.getInt("type"));
				users.add(user);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBManager.close(ps, con);
		return users;
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.hsj.sbm.user.dao.UserDao#addUser(com.qhit.lh.g4.hsj.sbm.user.bean.User)
	 */
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}
}

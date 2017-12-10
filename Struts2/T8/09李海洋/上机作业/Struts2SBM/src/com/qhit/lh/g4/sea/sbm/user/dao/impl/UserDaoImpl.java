package com.qhit.lh.g4.sea.sbm.user.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.qhit.lh.g4.sea.sbm.user.bean.User;
import com.qhit.lh.g4.sea.sbm.user.dao.UserDao;
import com.qhit.lh.g4.sea.sbm.utils.DBManager;


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

			if (rs.next()) {
				user = new User(rs.getInt("userId"), userName, userPassword,
						rs.getString("userSex"), rs.getInt("userAge"),
						rs.getString("telephone"), rs.getString("address"),
						rs.getString("pic"), rs.getInt("type"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBManager.close(ps, con);
		}
		return user;
	}


	@Override
	public int deleteUser(int userId) {
		// TODO Auto-generated method stub
		con = DBManager.getConnection();
		String sql = "delete from tb_user where userId = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBManager.close(ps, con);
		}
		return 0;
	}

	@Override
	public int updateUser(User user,int userId) {
		// TODO Auto-generated method stub
		con = DBManager.getConnection();
		String sql = "update tb_user set "
				+ "userName=?,userSex=?,userAge=?,telephone=?,address=?,pic=?,type=? "
				+ "where userId=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getUserSex());
			ps.setInt(3, user.getUserAge());
			ps.setString(4, user.getTelephone());
			ps.setString(5, user.getAddress());
			ps.setString(6, user.getPic());
			ps.setInt(7, user.getType());
			ps.setInt(8, userId);
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBManager.close(ps, con);
		}
		return 0;
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		con = DBManager.getConnection();
		String sql = "insert into tb_user values (?,?,?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getUserPassword());
			ps.setString(3, user.getUserSex());
			ps.setInt(4, user.getUserAge());
			ps.setString(5, user.getTelephone());
			ps.setString(6, user.getAddress());
			ps.setString(7, user.getPic());
			ps.setInt(8, user.getType());
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBManager.close(ps, con);
		}
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.sbm.user.dao.UserDao#getAll()
	 */
	@Override
	public List<User> getAll() throws SQLException {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<>();
		con = DBManager.getConnection();
		String sql = "select * from tb_user";
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		while(rs.next()){
			user = new User(
					rs.getInt("userId"), 
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
		return users;
	}
}

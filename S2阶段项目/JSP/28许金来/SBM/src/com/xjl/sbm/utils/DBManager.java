package com.xjl.sbm.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
	private static Connection con ;
	private static String DriverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String url = "jdbc:sqlserver://localhost:1433;DatabaseName=db_sbm";
	private static String uname = "sa";
	private static String password = "123456";
	public static Connection getConection(){
		try {
			Class.forName(DriverName);
			con = DriverManager.getConnection(url,uname,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public static void close(Statement statement,Connection con){
		try {
			statement.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

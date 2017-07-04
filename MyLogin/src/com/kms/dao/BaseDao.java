package com.kms.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class BaseDao {
	private static final String DriverName = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://127.0.0.1:3306/test";
	private static final String user = "root";
	private static final String password = "root";
	static {
		try {
			Class.forName(DriverName);
		}catch(ClassNotFoundException e) {
			System.err.println("¼ÓÔØÇý¶¯Ê§°Ü£º"+e.getMessage());
		}
	} 	
	public Connection getConnection() {
		try {
			Connection connection = (Connection) DriverManager.getConnection(url, user, password);
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
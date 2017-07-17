package com.train.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {
	private static final String url="jdbc:mysql://172.20.51.51:3306/test";
	private static final String user="root";
	private static final String password="root";
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}
	public static java.sql.Connection getConnection() {
		java.sql.Connection connection=null;
		try {
			connection = DriverManager.getConnection(url, user, password);
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}

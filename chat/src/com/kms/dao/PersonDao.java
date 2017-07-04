package com.kms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kms.pojo.Person;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class PersonDao extends BaseDao{
	public List<Person> lrs(){
		List<Person> lrs = new ArrayList<Person>();
		String sql = "SELECT  `name`,`password` FROM `test`.`user`";
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = getConnection();
			statement = (Statement) connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				Person role = new Person();
			role.setName(resultSet.getString("name"));
			role.setPsw(resultSet.getString("password"));
			lrs.add(role);
			}
		} catch (Exception e) { 
			System.out.println(e.getMessage());
			lrs = null;
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return lrs;
	}
	public int addPersion(Person p) {
		int i= -1;
		String sql = "INSERT INTO user(name,password) VALUES(?,?)";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = super.getConnection();
			preparedStatement =(PreparedStatement) connection.prepareStatement(sql);
			preparedStatement.setObject(1, p.getName());
			preparedStatement.setObject(2, p.getPsw());
			i=preparedStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i;
		
		}
}

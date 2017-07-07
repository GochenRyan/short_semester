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
}
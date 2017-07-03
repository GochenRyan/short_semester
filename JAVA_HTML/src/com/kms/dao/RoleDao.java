package com.kms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kms.pojo.Role;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class RoleDao extends BaseDao{
	public List<Role> lrs(){
		List<Role> lrs = new ArrayList<Role>();
		String sql = "SELECT  `name`,`sex` FROM `test`.`role`";
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = getConnection();
			statement = (Statement) connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
			Role role = new Role();
			role.setName(resultSet.getString("name"));
			role.setSex(resultSet.getString("sex"));
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

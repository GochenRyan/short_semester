package com.login.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.login.pojo.Role;

public class RoleDao extends BaseDao{
	
	//找到数据库中管理员的账号密码
		public List<Role> lrs() {
			List<Role> lrs=new ArrayList<Role>();
			String sql="SELECT \r\n" + 
					"  `username`,\r\n" + 
					"  `password` \r\n" + 
					"FROM\r\n" + 
					"  `mng`.`user` ";
			Connection connection=null;
			java.sql.Statement statement=null;
			ResultSet resultSet = null;
			try {
				connection=getConnection();
				statement=connection.createStatement();
				resultSet=statement.executeQuery(sql);
				while(resultSet.next()) {
					Role role=new Role();
					role.setUsername(resultSet.getString("username"));
					role.setPassword(resultSet.getString("password"));
					lrs.add(role);
				}
			}
			catch (Exception e) {
				e.getMessage();
				lrs=null;
			}
			
			finally {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return lrs;
		}
	}


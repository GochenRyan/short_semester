package com.pro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.emp.pojo.Role;

import com.dept.pojo.Dept;

import com.pro.pojo.Pro;

public class ProDao extends BaseDao {
	
	//试用结束成功入职
	public int come(int id){
		int i=0;
		String sql = "UPDATE \r\n" + 
				"  `mng`.`emp` \r\n" + 
				"SET\r\n" + 
				"  `if_pro` = \"否\"\r\n" + 
				"WHERE `empno` = ?  ";
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			statement.setObject(1, id);
			i= statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				statement.close();
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
	
	//未能成功入职
	public int go(int id){
		int i=0;
		String sql = "UPDATE \r\n" + 
				"  `mng`.`emp` \r\n" + 
				"SET\r\n" + 
				"  `if_dim` = \"是\"\r\n" + 
				"WHERE `empno` = ？ ";
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			statement.setObject(1, id);
			i= statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				statement.close();
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
	
	public int wait(int id){
		int i=0;
		Date date=new Date();
		String sql = "SELECT DATE_ADD(proEndDate, INTERVAL 15 DAY) \r\n" + 
				"FROM  mng.`emp_probation`\r\n" + 
				"WHERE empno= ? ";
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet=null;
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			statement.setObject(1, id);
			resultSet= statement.executeQuery();
			while(resultSet.next()){
				date=resultSet.getDate(1);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} 
		sql = "UPDATE mng.`emp_probation`\r\n" + 
				"SET proEndDate= ?\r\n" + 
				"WHERE empno= ?";
		connection = null;
		statement = null;
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			statement.setObject(2, id);
			statement.setObject(1, date);
			i= statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				statement.close();
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
	
	//删除培训信息
	public int delete(int id){
		int i=0;
		String sql = "DELETE \r\n" + 
				"FROM\r\n" + 
				"  `mng`.`emp_probation` \r\n" + 
				"WHERE empno = ? ";
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			statement.setObject(1, id);
			i= statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				statement.close();
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
	
	//由编号找到员工具体信息
	public Pro find(int id) {
		Pro pro = new Pro();
		String sql = "SELECT \r\n" + 
				"  `id`,\r\n" + 
				"  `empno`,\r\n" + 
				"  `pro_state`,\r\n" + 
				"  `proStartDate`,\r\n" + 
				"  `proEndDate` \r\n" + 
				"FROM\r\n" + 
				"  `mng`.`emp_probation` \r\n" + 
				"WHERE empno= ? \r\n" + 
				"";
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			statement.setObject(1, id);
			resultSet = statement.executeQuery();

			while (resultSet.next()) {
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				statement.close();
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
		return pro;
	}
	
	//试用期员工的所有信息
	public List<Pro> lp(){
		List<Pro> lp = new ArrayList<Pro>();
		String sql="SELECT \r\n" + 
				"  \r\n" + 
				"  `mng`.`emp_probation`.`empno`,\r\n" + 
				"  `mng`.`emp`.`ename`,\r\n" + 
				"  `mng`.`emp`.`dname`,\r\n" + 
				"  `mng`.`emp`.`pname`,\r\n" + 
				"  `pro_state`,\r\n" + 
				"  `proStartDate`,\r\n" + 
				"  `proEndDate` \r\n" + 
				"FROM\r\n" + 
				"  `mng`.`emp_probation`  ,`mng`.`emp`\r\n" + 
				"  WHERE \r\n" + 
				"  `mng`.`emp_probation`.`empno`=`mng`.`emp`.`empno`";  
			
		Connection connection=null;
		java.sql.Statement statement=null;
		ResultSet resultSet = null;
		try {
			connection=getConnection();
			statement=connection.createStatement();
			resultSet=statement.executeQuery(sql);
			while(resultSet.next()) {
				Pro pro=new Pro();
				
				pro.setEmpno(resultSet.getInt("empno"));
				pro.setEname(resultSet.getString("ename"));
				pro.setDname(resultSet.getString("dname"));
				pro.setPname(resultSet.getString("pname"));
				pro.setPro_state(resultSet.getString("pro_state"));
				pro.setProStartDate(resultSet.getDate("proStartDate"));
				pro.setProEndDate(resultSet.getDate("proEndDate"));
				lp.add(pro);
			}
		}
		catch (Exception e) {
			e.getMessage();
		}

		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		return lp;
	}


}

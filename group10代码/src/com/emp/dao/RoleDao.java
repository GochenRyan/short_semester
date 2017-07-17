package com.emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.emp.pojo.Role;

public class RoleDao extends BaseDao{
	//列出所有员工的部分部分员工信息
	public List<Role> listpart(){		
		List<Role> lrs = new ArrayList<Role>();
		String sql="SELECT \r\n" + 
				"  `empno`,\r\n" + 
				"  `ename`,\r\n" + 
				"  `esex`,\r\n" + 
				"  `bornDate`,\r\n" + 
				"  `dname`,\r\n" + 
				"  `pname`,\r\n" + 
				"  `if_pro`,\r\n" + 
				"  `if_train`,\r\n" + 
				"  `if_dim`,\r\n" + 
				"  `etel`,\r\n" + 
				"  `email`\r\n" + 
				"FROM\r\n" + 
				"  `mng`.`emp` ";
		Connection connection=null;
		java.sql.Statement statement=null;
		ResultSet resultSet = null;
		try {
			connection=getConnection();
			statement=connection.createStatement();
			resultSet=statement.executeQuery(sql);
			while(resultSet.next()) {
				if(!"是".equals(resultSet.getString("if_dim"))){
					Role role=new Role();
					role.setEmpno(resultSet.getInt("empno"));
					role.setEname(resultSet.getString("ename"));
					role.setEsex(resultSet.getString("esex"));
					role.setBornDate(resultSet.getDate("bornDate"));
					role.setDname(resultSet.getString("dname"));
					role.setPname(resultSet.getString("pname"));
					role.setIf_pro(resultSet.getString("if_pro"));
					role.setIf_train(resultSet.getString("if_train"));
					role.setIf_dim(resultSet.getString("if_dim"));
					role.setEtel(resultSet.getString("etel"));
					role.setEmail(resultSet.getString("email"));
					lrs.add(role);
				}
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
		return lrs;
	}
	//列出所有员工的全部信息
	public List<Role> lrs() {
		List<Role> lrs = new ArrayList<Role>();
		String sql="SELECT \r\n" + 
				"  `empno`,\r\n" + 
				"  `ename`,\r\n" + 
				"  `esex`,\r\n" + 
				"  `bornDate`,\r\n" + 
				"  `identityId`,\r\n" + 
				"  `dname`,\r\n" + 
				"  `pname`,\r\n" + 
				"  `entryDate`,\r\n" + 
				"  `if_pro`,\r\n" + 
				"  `if_train`,\r\n" + 
				"  `if_dim`,\r\n" + 
				"  `workDate`,\r\n" + 
				"  `workWay`,\r\n" + 
				"  `employeeOrigin`,\r\n" + 
				"  `politicalStatus`,\r\n" + 
				"  `enation`,\r\n" + 
				"  `etel`,\r\n" + 
				"  `email`,\r\n" + 
				"  `bloodType`,\r\n" + 
				"  `marriageStatus`,\r\n" + 
				"  `enative`,\r\n" + 
				"  `hometown`,\r\n" + 
				"  `registerPlace`,\r\n" + 
				"  `qualification`,\r\n" + 
				"  `graduatedSchool`,\r\n" + 
				"  `emajor`,\r\n" + 
				"  `graduatedDate` \r\n" + 
				"FROM\r\n" + 
				"  `mng`.`emp` ";
		Connection connection=null;
		java.sql.Statement statement=null;
		ResultSet resultSet = null;
		try {
			connection=getConnection();
			statement=connection.createStatement();
			resultSet=statement.executeQuery(sql);
			while(resultSet.next()) {
				if(!"是".equals(resultSet.getString("if_dim"))){
					Role role=new Role();
					role.setEmpno(resultSet.getInt("empno"));
					role.setEname(resultSet.getString("ename"));
					role.setEsex(resultSet.getString("esex"));
					role.setBornDate(resultSet.getDate("bornDate"));
					role.setDname(resultSet.getString("dname"));
					role.setPname(resultSet.getString("pname"));
					role.setIf_pro(resultSet.getString("if_pro"));
					role.setIf_train(resultSet.getString("if_train"));
					role.setIf_dim(resultSet.getString("if_dim"));
					role.setEtel(resultSet.getString("etel"));
					role.setEmail(resultSet.getString("email"));
					role.setIdentityId(resultSet.getString("identityId"));
					role.setEntryDate(resultSet.getString("entryDate"));
					role.setWorkDate(resultSet.getDate("workDate"));
					role.setWorkWay(resultSet.getString("workWay"));
					role.setEmployeeOrigin(resultSet.getString("employeeOrigin"));
					role.setPoliticalStatus(resultSet.getString("politicalStatus"));
					role.setEnation(resultSet.getString("enation"));
					role.setBloodType(resultSet.getString("bloodType"));
					role.setMarriageStatus(resultSet.getString("marriageStatus"));
					role.setEnative(resultSet.getString("enative"));
					role.setHometown(resultSet.getString("hometown"));
					role.setRegisterPlace(resultSet.getString("registerPlace"));
					role.setQualification(resultSet.getString("qualification"));
					role.setGraduatedSchool(resultSet.getString("graduatedSchool"));
					role.setEmajor(resultSet.getString("emajor"));
					role.setGraduatedDate(resultSet.getDate("graduatedDate"));
					lrs.add(role);}
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
		return lrs;
	}
	//由员工编号找到员工的信息（用于员工信息的修改）
	public Role findrole(int id) {
		Role role = new Role();
		String sql="SELECT \r\n" + 
				"  `empno`,\r\n" + 
				"  `ename`,\r\n" + 
				"  `esex`,\r\n" + 
				"  `bornDate`,\r\n" + 
				"  `identityId`,\r\n" + 
				"  `dname`,\r\n" + 
				"  `pname`,\r\n" + 
				"  `entryDate`,\r\n" + 
				"  `if_pro`,\r\n" + 
				"  `if_train`,\r\n" + 
				"  `if_dim`,\r\n" + 
				"  `workDate`,\r\n" + 
				"  `workWay`,\r\n" + 
				"  `employeeOrigin`,\r\n" + 
				"  `politicalStatus`,\r\n" + 
				"  `enation`,\r\n" + 
				"  `etel`,\r\n" + 
				"  `email`,\r\n" + 
				"  `bloodType`,\r\n" + 
				"  `marriageStatus`,\r\n" + 
				"  `enative`,\r\n" + 
				"  `hometown`,\r\n" + 
				"  `registerPlace`,\r\n" + 
				"  `qualification`,\r\n" + 
				"  `graduatedSchool`,\r\n" + 
				"  `emajor`,\r\n" + 
				"  `graduatedDate` \r\n" + 
				"FROM\r\n" + 
				"  `mng`.`emp` \r\n" + 
				"  WHERE empno= ? ";
		Connection connection = null;
		PreparedStatement statement = null;	
		ResultSet resultSet = null;
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			statement.setObject(1,id);
			resultSet=statement.executeQuery();
			while(resultSet.next()) {
				role.setEmpno(resultSet.getInt("empno"));
				role.setEname(resultSet.getString("ename"));
				role.setEsex(resultSet.getString("esex"));
				role.setBornDate(resultSet.getDate("bornDate"));
				role.setDname(resultSet.getString("dname"));
				role.setPname(resultSet.getString("pname"));
				role.setIf_pro(resultSet.getString("if_pro"));
				role.setIf_train(resultSet.getString("if_train"));
				role.setIf_dim(resultSet.getString("if_dim"));
				role.setEtel(resultSet.getString("etel"));
				role.setEmail(resultSet.getString("email"));
				role.setIdentityId(resultSet.getString("identityId"));
				role.setEntryDate(resultSet.getString("entryDate"));
				role.setWorkDate(resultSet.getDate("workDate"));
				role.setWorkWay(resultSet.getString("workWay"));
				role.setEmployeeOrigin(resultSet.getString("employeeOrigin"));
				role.setPoliticalStatus(resultSet.getString("politicalStatus"));
				role.setEnation(resultSet.getString("enation"));
				role.setBloodType(resultSet.getString("bloodType"));
				role.setMarriageStatus(resultSet.getString("marriageStatus"));
				role.setEnative(resultSet.getString("enative"));
				role.setHometown(resultSet.getString("hometown"));
				role.setRegisterPlace(resultSet.getString("registerPlace"));
				role.setQualification(resultSet.getString("qualification"));
				role.setGraduatedSchool(resultSet.getString("graduatedSchool"));
				role.setEmajor(resultSet.getString("emajor"));
				role.setGraduatedDate(resultSet.getDate("graduatedDate"));
			}
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
		return role;
	}

	//用于修改员工信息
	public int update(Role role) {
		int i = 0;
		String sql = "UPDATE \r\n" + 
				"  `mng`.`emp` \r\n" + 
				"SET\r\n" + 
				"  `empno` =  ? ,\r\n"+
				"  `ename` =  ? ,\r\n" + 
				"  `esex` =  ? ,\r\n" + 
				"  `bornDate` = ? ,\r\n" + 
				"  `identityId` = ? ,\r\n" + 
				"  `dname` =  ? ,\r\n" + 
				"  `pname` =  ? ,\r\n" + 
				"  `entryDate` =  ? ,\r\n" + 
				"  `if_pro` =  ? ,\r\n" + 
				"  `if_train` =  ? ,\r\n" + 
				"  `if_dim` =  ? ,\r\n" + 
				"  `workDate` =  ? ,\r\n" + 
				"  `workWay` =  ? ,\r\n" + 
				"  `employeeOrigin` =  ? ,\r\n" + 
				"  `politicalStatus` =  ? ,\r\n" + 
				"  `enation` =  ? ,\r\n" + 
				"  `etel` =  ? ,\r\n" + 
				"  `email` =  ? ,\r\n" + 
				"  `bloodType` =  ? ,\r\n" + 
				"  `marriageStatus` =  ? ,\r\n" + 
				"  `enative` =  ? ,\r\n" + 
				"  `hometown` =  ? ,\r\n" + 
				"  `registerPlace` =  ? ,\r\n" + 
				"  `qualification` =  ? ,\r\n" + 
				"  `graduatedSchool` =  ? ,\r\n" + 
				"  `emajor` =  ? ,\r\n" + 
				"  `graduatedDate` =  ? \r\n" + 
				"WHERE `empno` = ? ;\r\n" + 
				"\r\n" + 
				"";
		Connection connection = null;
		PreparedStatement statement = null;		 
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			statement.setObject(1, role.getEmpno());
			statement.setObject(2, role.getEname());
			statement.setObject(3, role.getEsex());
			statement.setObject(4, role.getBornDate());
			statement.setObject(5, role.getIdentityId());
			statement.setObject(6, role.getDname());
			statement.setObject(7, role.getPname());
			statement.setObject(8, role.getEntryDate());
			statement.setObject(9, role.getIf_pro());
			statement.setObject(10, role.getIf_train());
			statement.setObject(11, role.getIf_dim());
			statement.setObject(12, role.getWorkDate());
			statement.setObject(13, role.getWorkWay());
			statement.setObject(14, role.getEmployeeOrigin());
			statement.setObject(15, role.getPoliticalStatus());
			statement.setObject(16, role.getEnation());
			statement.setObject(17, role.getEtel());
			statement.setObject(18, role.getEmail());
			statement.setObject(19, role.getBloodType());
			statement.setObject(20, role.getMarriageStatus());
			statement.setObject(21, role.getEnative());
			statement.setObject(22, role.getHometown());
			statement.setObject(23, role.getRegisterPlace());
			statement.setObject(24, role.getQualification());
			statement.setObject(25, role.getGraduatedSchool());
			statement.setObject(26, role.getEmajor());
			statement.setObject(27, role.getGraduatedDate());
			statement.setObject(28, role.getEmpno());
			i = statement.executeUpdate();
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

	//添加新的员工
	public int add(Role role) {
		int i = 0;
		String sql = "INSERT INTO `mng`.`emp` (\r\n" + 
				"  `empno`,\r\n" + 
				"  `ename`,\r\n" + 
				"  `esex`,\r\n" + 
				"  `bornDate`,\r\n" + 
				"  `identityId`,\r\n" + 
				"  `dname`,\r\n" + 
				"  `pname`,\r\n" + 
				"  `entryDate`,\r\n" + 
				"  `if_pro`,\r\n" + 
				"  `if_train`,\r\n" + 
				"  `if_dim`,\r\n" + 
				"  `workDate`,\r\n" + 
				"  `workWay`,\r\n" + 
				"  `employeeOrigin`,\r\n" + 
				"  `politicalStatus`,\r\n" + 
				"  `enation`,\r\n" + 
				"  `etel`,\r\n" + 
				"  `email`,\r\n" + 
				"  `bloodType`,\r\n" + 
				"  `marriageStatus`,\r\n" + 
				"  `enative`,\r\n" + 
				"  `hometown`,\r\n" + 
				"  `registerPlace`,\r\n" + 
				"  `qualification`,\r\n" + 
				"  `graduatedSchool`,\r\n" + 
				"  `emajor`,\r\n" + 
				"  `graduatedDate`\r\n" + 
				") \r\n" + 
				"VALUES\r\n" + 
				"  (\r\n" + 
				"   ?  ,\r\n" + 
				"    ?  ,\r\n" + 
				"   ?  ,\r\n" + 
				"    ?  ,\r\n" + 
				"   ?  ,\r\n" + 
				"   ?  ,\r\n" + 
				"  ?  ,\r\n" + 
				"   ? ,\r\n" + 
				"   ? ,\r\n" + 
				"   ? ,\r\n" + 
				"  ?  ,\r\n" + 
				"   ? ,\r\n" + 
				"   ? ,\r\n" + 
				"   ? ,\r\n" + 
				"  ? ,\r\n" + 
				"  ? ,\r\n" + 
				"   ? ,\r\n" + 
				"   ? ,\r\n" + 
				"   ? ,\r\n" + 
				"   ? ,\r\n" + 
				"    ?  ,\r\n" + 
				"   ? ,\r\n" + 
				"    ? ,\r\n" + 
				"    ? ,\r\n" + 
				"    ? ,\r\n" + 
				"    ? ,\r\n" + 
				"    ?\r\n" + 
				"  ) ;";
		Connection connection = null;
		PreparedStatement statement = null;		 
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			statement.setObject(1, role.getEmpno());
			statement.setObject(2, role.getEname());
			statement.setObject(3, role.getEsex());
			statement.setObject(4, role.getBornDate());
			statement.setObject(5, role.getIdentityId());
			statement.setObject(6, role.getDname());
			statement.setObject(7, role.getPname());
			statement.setObject(8, role.getEntryDate());
			statement.setObject(9, role.getIf_pro());
			statement.setObject(10, role.getIf_train());
			statement.setObject(11, role.getIf_dim());
			statement.setObject(12, role.getWorkDate());
			statement.setObject(13, role.getWorkWay());
			statement.setObject(14, role.getEmployeeOrigin());
			statement.setObject(15, role.getPoliticalStatus());
			statement.setObject(16, role.getEnation());
			statement.setObject(17, role.getEtel());
			statement.setObject(18, role.getEmail());
			statement.setObject(19, role.getBloodType());
			statement.setObject(20, role.getMarriageStatus());
			statement.setObject(21, role.getEnative());
			statement.setObject(22, role.getHometown());
			statement.setObject(23, role.getRegisterPlace());
			statement.setObject(24, role.getQualification());
			statement.setObject(25, role.getGraduatedSchool());
			statement.setObject(26, role.getEmajor());
			statement.setObject(27, role.getGraduatedDate());
			i = statement.executeUpdate();
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

	//删除员工
	public int delete(Role role) {
		int i = 0;
		String sql = "DELETE \r\n" + 
				"FROM\r\n" + 
				"  `mng`.`emp` \r\n" + 
				"WHERE `empno` = ?  ";
		Connection connection = null;
		PreparedStatement statement = null;		 
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			statement.setObject(1, role.getEmpno());
			i = statement.executeUpdate();
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

}
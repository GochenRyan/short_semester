package com.kms.dao;

import java.sql.SQLException;

import com.kms.pojo.Persion;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class PersiondDao extends BaseDao{
	public int addPersion(Persion p) {
	int i= -1;
	String sql = "INSERT INTO persion(pnm,pwd,bdate,rid,mgid,icon) VALUES(?,?,?,?,?,?)";
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	//System.out.println("123456");
	try {
		connection = super.getConnection();
		preparedStatement =(PreparedStatement) connection.prepareStatement(sql);
		//System.out.println("xfvg");
		preparedStatement.setObject(1, p.getPnm());
		preparedStatement.setObject(2, p.getPwd());
		preparedStatement.setObject(3, p.getBdate());
		preparedStatement.setObject(4, p.getRid());
		preparedStatement.setObject(5, p.getMgid());
		preparedStatement.setObject(6, p.getIcon());
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

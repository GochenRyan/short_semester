package dao;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.*;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;;

public class EmpDao {
	private static final String DriverName = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://127.0.0.1:3306/test";
	private static final String user = "root";
	private static final String password = "root";
	static {
		try {
			Class.forName(DriverName);
		}catch(ClassNotFoundException e) {
			System.err.println("加载驱动失败："+e.getMessage());
		}
	}
	@Test
	public void addEmp() {
		String sql = "select * from dept where deptno=?";//?+?+?
		//建立到数据库的连接
		try {
			Connection connection = (Connection)DriverManager.getConnection(url,user,password);
			//建立传输SQL语句的Statement
			//Statement statement = (Statement) connection.createStatement();
			PreparedStatement Pt = (PreparedStatement)connection.prepareStatement(sql);
			Pt.setObject(1,50);
			ResultSet resultSet = Pt.executeQuery();
			while(resultSet.next()) {
				String string1 =resultSet.getString(1);
				String string2 =(String)resultSet.getObject(2);
				String string3 =(String)resultSet.getObject(3);
				System.out.println(string1);
				System.out.println(string2);
				System.out.println(string3);
			}
			connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}	
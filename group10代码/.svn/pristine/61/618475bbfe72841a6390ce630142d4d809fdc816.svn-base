package com.dept.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dept.pojo.Dept;
import com.dept.pojo.DeptEmp;
import com.dept.pojo.DeptTransfer;
import com.emp.pojo.Role;



public class DeptDao extends BaseDao {
	/*返回指定部门员工信息*/
	public List<DeptEmp> listDe(int id) {
		List<DeptEmp> lds = new ArrayList<DeptEmp>();



		String sql = "SELECT dptno,d.`dname`,e.`ename`,e.empno,e.`esex`,e.`if_pro`,e.`if_train`,e.`if_dim` FROM mng.dept d INNER JOIN mng.emp e ON d.`dname`= e.`dname` WHERE d.dptno= ? ";

		Connection connection = null;
		PreparedStatement statement = null;	
		ResultSet resultSet = null;
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			statement.setObject(1,id);
			resultSet= statement.executeQuery();
			while(resultSet.next()) {
				DeptEmp dept=new DeptEmp();
				dept.setDptno(resultSet.getInt("dptno"));
				dept.setDname(resultSet.getString("dname"));
				dept.setEmpno(resultSet.getInt("empno"));
				dept.setEname(resultSet.getString("ename"));
				dept.setEsex(resultSet.getString("esex"));
				dept.setIf_dim(resultSet.getString("if_pro"));
				dept.setIf_pro(resultSet.getString("if_train"));
				dept.setIf_train(resultSet.getString("if_dim"));
				lds.add(dept);
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
		return lds;
	}
	
	public List<DeptTransfer> listTransfer() {
		List<DeptTransfer> deptTransfers =new ArrayList<DeptTransfer>();
		String sql = "SELECT \r\n" + 
				"  `id`,\r\n" + 
				"  `empno`,\r\n" + 
				"  `oldDptno`,\r\n" + 
				"  `newDptno`,\r\n" + 
				"  `dptTransferType`,\r\n" + 
				"  `dptTransferCause`,\r\n" + 
				"  `dptTransferRemark`,\r\n" + 
				"  `dptTransferDate` \r\n" + 
				"FROM\r\n" + 
				"  `mng`.`dpt_transfer` ";

		Connection connection=null;
		java.sql.Statement statement=null;
		ResultSet resultSet = null;
		try {
			connection=getConnection();
			statement=connection.createStatement();
			resultSet=statement.executeQuery(sql);
			while(resultSet.next()) {
				DeptTransfer dept=new DeptTransfer();
				dept.setDptTransferType(resultSet.getString("dptTransferType"));
				dept.setDptTransferRemark(resultSet.getString("dptTransferRemark"));
				dept.setEmpno(resultSet.getInt("empno"));
				dept.setOldDptno(resultSet.getInt("oldDptno"));
				dept.setNewDptno(resultSet.getInt("newDptno"));
				dept.setDptTransferCause(resultSet.getString("dptTransferCause"));
				dept.setDptTransferDate(resultSet.getDate("dptTransferDate"));
				deptTransfers.add(dept);
			}
		}catch (SQLException e) {
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
		return deptTransfers;
	}

	//列出所有部门信息
	public List<Dept> lds(){
		List<Dept> lds = new ArrayList<Dept>();
		String sql="SELECT \r\n" + 
				"  `dptno`,\r\n" + 		
				"  `dname`,\r\n" + 
				"  `dptTel`,\r\n" + 
				"  `upDpt`,\r\n" + 
				"  `setupDate` \r\n" + 
				"FROM\r\n" + 
				"  `mng`.`dept`  ";
		Connection connection=null;
		java.sql.Statement statement=null;
		ResultSet resultSet = null;
		try {
			connection=getConnection();
			statement=connection.createStatement();
			resultSet=statement.executeQuery(sql);
			while(resultSet.next()) {
				Dept dept=new Dept();
				dept.setDptno(resultSet.getInt("dptno"));
				dept.setDname(resultSet.getString("dname"));
				dept.setDptTel(resultSet.getString("dptTel"));
				dept.setUpDpt(resultSet.getString("upDpt"));
				dept.setSetupDate(resultSet.getDate("setupDate"));
				lds.add(dept);
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
		return lds;


	}
	/*添加部门*/

	//进行部门调动
	public int tran(DeptTransfer deptTransfer) {
		int j = 0;
		String sql = "UPDATE\r\n" + 
				"mng.`emp`,mng.`dept`\r\n" + 
				"SET\r\n" + 
				"emp.`dname`= dept.`dname`\r\n" + 
				"WHERE emp.`empno`= ?  AND dept.`dptno`= ?  ";
		Connection connection = null;
		PreparedStatement statement = null;		 
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			statement.setObject(2,deptTransfer.getNewDptno());
			statement.setObject(1,deptTransfer.getEmpno());
			j = statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {			
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return j;
	}
	public int addtransfer(DeptTransfer deptTransfer) {
		int j = 0;
		String sql = "INSERT INTO `mng`.`dpt_transfer` (\r\n" + 
				"  `empno`,\r\n" + 
				"  `oldDptno`,\r\n" + 
				"  `newDptno`,\r\n" + 
				"  `dptTransferType`,\r\n" + 
				"  `dptTransferCause`,\r\n" + 
				"  `dptTransferRemark`,\r\n" + 
				"  `dptTransferDate`\r\n" + 
				") \r\n" + 
				"VALUES\r\n" + 
				"  (\r\n" + 
				"    ?  ,\r\n" + 
				"     ?  ,\r\n" + 
				"     ?  ,\r\n" + 
				"    ?  ,\r\n" + 
				"     ?  ,\r\n" + 
				"    ?  ,\r\n" + 
				"    ? \r\n" + 
				"  ) ";
		Connection connection = null;
		PreparedStatement statement = null;		 
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			statement.setObject(1,deptTransfer.getEmpno());
			statement.setObject(2,deptTransfer.getOldDptno());
			statement.setObject(3,deptTransfer.getNewDptno());
			statement.setObject(4,deptTransfer.getDptTransferType());
			statement.setObject(5,deptTransfer.getDptTransferCause());
			statement.setObject(6,deptTransfer.getDptTransferRemark());
			statement.setObject(7,deptTransfer.getDptTransferDate());
			j = statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {			
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return j;
	}

	public int adddept(Dept dept) {
		int j = 0;
		String sql = "INSERT INTO `mng`.`dept` (\r\n" + 

				"  `dptno`,\r\n" + 
				"  `dname`,\r\n" + 
				"  `dptTel`,\r\n" + 
				"  `upDpt`,\r\n" + 
				"  `setupDate`\r\n" + 
				") \r\n" + 
				"VALUES\r\n" + 
				"  (\r\n" + 
				"    ?  ,\r\n" + 
				"    ? ,\r\n" + 
				"    ? ,\r\n" + 
				"    ? ,\r\n" + 
				"    ? \r\n" + 
				"  ) ";
		Connection connection = null;
		PreparedStatement statement = null;		 
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			statement.setObject(1,dept.getDptno());
			statement.setObject(2,dept.getDname());
			statement.setObject(3,dept.getDptTel());
			statement.setObject(4,dept.getUpDpt());
			statement.setObject(5,dept.getSetupDate());
			j = statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {			
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return j;
	}
	/*删除部门*/
	public int delete(Dept dept) {
		int i = 0;
		String sql =  "  DELETE FROM    `mng`.`dept`  WHERE `dptno` = ? ";
		Connection connection = null;
		PreparedStatement statement = null;		 
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			statement.setObject(1, dept.getDptno());
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
	//修改部门信息
	public int editdept(Dept dept) {
		int i = 0;
		String sql =  " UPDATE \r\n" + 
				"  `mng`.`dept` \r\n" + 
				"SET\r\n" + 
				"  `dptno` =  ? ,\r\n" + 
				"  `dname` =  ? ,\r\n" + 
				"  `dptTel` =  ? ,\r\n" + 
				"  `upDpt` =  ? ,\r\n" + 
				"  `setupDate` =  ?  \r\n" + 
				"WHERE `dptno` =  ?    ";
		Connection connection = null;
		PreparedStatement statement = null;		 
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			statement.setObject(1, dept.getDptno());
			statement.setObject(2, dept.getDname());
			statement.setObject(3, dept.getDptTel());
			statement.setObject(4, dept.getUpDpt());
			statement.setObject(5, dept.getSetupDate());
			statement.setObject(6, dept.getDptno());
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


	public List<Role> check(String dname){
		List<Role> llrs=null;
		return  llrs;
	}


	//由部门编号找到对应的部门（用于修改部门信息）
	public Dept finddept(int dptno) {
		Dept dept = null;
		String sql = "  SELECT \r\n" + 
				"  `dptno`,\r\n" + 
				"  `dname`,\r\n" + 
				"  `dptTel`,\r\n" + 
				"  `upDpt`,\r\n" + 
				"  `setupDate` \r\n" + 
				"FROM  `mng`.`dept`    WHERE dptno =  ?  ";
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			statement.setObject(1, dptno);
			resultSet = statement.executeQuery();

			while (resultSet.next()) {
				dept = new Dept();
				dept.setDptno(resultSet.getInt("dptno"));
				dept.setDname(resultSet.getObject("dname") == null ? "" : resultSet.getString("dname"));
				dept.setDptTel(resultSet.getObject("dptTel") == null ? "" : resultSet.getString("dptTel"));
				dept.setUpDpt(resultSet.getObject("upDpt") == null ? "" : resultSet.getString("upDpt"));
				//dept.setSetupDate(resultSet.getDate("setupDate") == null ? "" : resultSet.getDate("setupDate"));// right
				dept.setSetupDate(resultSet.getDate("setupDate"));
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
		return dept;
	}
}

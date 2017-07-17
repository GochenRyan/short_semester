package com.posts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.posts.pojo.PostEmp;
import com.posts.pojo.PostTransfer;
import com.posts.pojo.Posts;

public class PostDao extends BaseDao {
	
	
	public List<PostTransfer> listTransfer() {
		List<PostTransfer> deptTransfers =new ArrayList<PostTransfer>();
		String sql = "SELECT \r\n" + 
				"  `id`,\r\n" + 
				"  `empno`,\r\n" + 
				"  `oldPno`,\r\n" + 
				"  `newPno`,\r\n" + 
				"  `postTransferType`,\r\n" + 
				"  `postTransferCause`,\r\n" + 
				"  `postTransferRemark`\r\n" + 
				"FROM\r\n" + 
				"  `mng`.`post_transfer` ";

		Connection connection=null;
		java.sql.Statement statement=null;
		ResultSet resultSet = null;
		try {
			connection=getConnection();
			statement=connection.createStatement();
			resultSet=statement.executeQuery(sql);
			while(resultSet.next()) {
				PostTransfer dept=new PostTransfer();
				dept.setPostTransferType(resultSet.getString("postTransferType"));
				dept.setPostTransferRemark(resultSet.getString("postTransferRemark"));
				dept.setEmpno(resultSet.getInt("empno"));
				dept.setOldPno(resultSet.getInt("oldPno"));
				dept.setNewPno(resultSet.getInt("newPno"));
				dept.setPostTransferCause(resultSet.getString("postTransferCause"));
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
	
	//返回指定岗位员工信息
	public List<PostEmp> listDe(int id) {
		List<PostEmp> lds = new ArrayList<PostEmp>();
		String sql = "SELECT \r\n" + 
				"  `pno`,\r\n" + 
				"   `mng`.`dpt_post`.`pname`,\r\n" + 
				"    `empno`,\r\n" + 
				" `ename`,\r\n" + 
				"  `esex`,\r\n" + 
				"  `if_pro`,\r\n" + 
				"  `if_train`,\r\n" + 
				"  `if_dim`\r\n" + 
				"  FROM\r\n" + 
				"  `mng`.`dpt_post` \r\n" + 
				"  INNER JOIN\r\n" + 
				"  `mng`.`emp` \r\n" + 
				"  ON\r\n" + 
				"   `mng`.`dpt_post`.`pname`=`mng`.`emp`.`pname`\r\n" + 
				"  WHERE pno= ? ";
		Connection connection = null;
		PreparedStatement statement = null;	
		ResultSet resultSet = null;
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			statement.setObject(1,id);
			System.out.println(id);
			resultSet= statement.executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getInt("pno"));
				System.out.println(resultSet.getString("pname"));
				System.out.println(resultSet.getInt("empno"));
				
				PostEmp postemp=new PostEmp();
				postemp.setPno(resultSet.getInt("pno"));
				postemp.setPname(resultSet.getString("pname"));
				postemp.setEmpno(resultSet.getInt("empno"));
				postemp.setEname(resultSet.getString("ename"));
				postemp.setEsex(resultSet.getString("esex"));
				postemp.setIf_dim(resultSet.getString("if_dim"));
				postemp.setIf_pro(resultSet.getString("if_pro"));
				postemp.setIf_train(resultSet.getString("if_train"));
				lds.add(postemp);
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
	//找到所有岗位的信息
    public List<Posts> lps(){
    	List<Posts> lps = new ArrayList<Posts>();
    	String sql="SELECT \r\n" + 
    			"  `pno`,\r\n" + 
    			"  `pname`,\r\n" + 
    			"  `pum` \r\n" + 
    			"FROM\r\n" + 
    			"  `mng`.`dpt_post` ";
    	Connection connection=null;
		java.sql.Statement statement=null;
		ResultSet resultSet = null;
		try {
			connection=getConnection();
			statement=connection.createStatement();
			resultSet=statement.executeQuery(sql);
			while(resultSet.next()) {
				Posts posts=new Posts();
				posts.setPno(resultSet.getInt("pno"));
				posts.setPname(resultSet.getString("pname"));
				posts.setPum(resultSet.getInt("pum"));
				lps.add(posts);
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
		return lps;
	} 	
    //岗位调动
    public int tran(PostTransfer postTransfer) {
		int j = 0;
		String sql = "UPDATE\r\n" + 
				"mng.`emp`,mng.`dpt_post`\r\n" + 
				"SET\r\n" + 
				"emp.`pname`= dpt_post.`pname`\r\n" + 
				"WHERE emp.`empno`= ? \r\n" + 
				"AND dpt_post.`pno`=  ?  ";
		Connection connection = null;
		PreparedStatement statement = null;		 
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			statement.setObject(2,postTransfer.getNewPno());
			statement.setObject(1,postTransfer.getEmpno());
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
	public int addtransfer(PostTransfer postTransfer) {
		int j = 0;
		String sql = "INSERT INTO `mng`.`post_transfer` (\r\n" + 
				"  \r\n" + 
				"  `empno`,\r\n" + 
				"  `oldPno`,\r\n" + 
				"  `newPno`,\r\n" + 
				"  `postTransferType`,\r\n" + 
				"  `postTransferCause`,\r\n" + 
				"  `postTransferRemark`\r\n" + 
				") \r\n" + 
				"VALUES\r\n" + 
				"  (\r\n" + 
				"    \r\n" + 
				"    ?  ,\r\n" + 
				"    ? ,\r\n" + 
				"     ? ,\r\n" + 
				"    ?  ,\r\n" + 
				"     ? ,\r\n" + 
				"    ?  \r\n" + 
				"  ) ";
		Connection connection = null;
		PreparedStatement statement = null;		 
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			statement.setObject(1,postTransfer.getEmpno());
			statement.setObject(2,postTransfer.getOldPno());
			statement.setObject(3,postTransfer.getNewPno());
			statement.setObject(4,postTransfer.getPostTransferType());
			statement.setObject(5,postTransfer.getPostTransferCause());
			statement.setObject(6,postTransfer.getPostTransferRemark());
			
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
    
    //由岗位编号找到对应的岗位全部信息
    public Posts findpost(int pno) {
		Posts posts = new Posts();
		String sql="SELECT \r\n" + 
    			"  `pno`,\r\n" + 
    			"  `pname`,\r\n" + 
    			"  `pum` \r\n" + 
    			"FROM\r\n" + 
    			"  `mng`.`dpt_post` "+ 
				"WHERE pno= ? \r\n" ;
		Connection connection = null;
		PreparedStatement statement = null;	
		ResultSet resultSet = null;
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			statement.setObject(1, pno);
			resultSet=statement.executeQuery();
			while(resultSet.next()) {
				posts.setPno(resultSet.getInt("pno"));
				posts.setPname(resultSet.getString("pname"));
				posts.setPum(resultSet.getInt("pum"));
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
		return posts;
	}
   /* public List<Posts> check(String pname)
    {
    	List<Posts> llps = null;
    	return llps;
    	
    }*/
    //修改岗位信息
	public int editpost(Posts posts) {
		int i = 0;
		String sql = "UPDATE \r\n" + 
				"  `mng`.`dpt_post` \r\n" + 
				"SET\r\n" + 
				"  `pno` = ? ,\r\n" + 
				"  `pname` = ? ,\r\n" + 
				"  `pum` = ?  \r\n" + 
				"WHERE `pno` = ?  ";
		Connection connection = null;
		PreparedStatement statement = null;		 
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			statement.setObject(1, posts.getPno());
			statement.setObject(2, posts.getPname());
			statement.setObject(3, posts.getPum());
			statement.setObject(4, posts.getPno());
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
	
	//添加岗位
	public int add(Posts posts) {
		int i = 0;
		String sql = "  INSERT INTO `mng`.`dpt_post` (`pno`, `pname`, `pum`) \r\n" + 
				"VALUES\r\n" + 
				"  (  ? , ? ,  ? )    ";
		Connection connection = null;
		PreparedStatement statement = null;		 
		try {
			connection = getConnection();
			
			statement = connection.prepareStatement(sql);
			statement.setObject(1, posts.getPno());
			statement.setObject(2, posts.getPname());
			statement.setObject(3, posts.getPum());
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
	
	//删除一个岗位
	public int delete(Posts posts) {
		int i = 0;
		String sql = "DELETE \r\n" + 
				"FROM\r\n" + 
				"  `mng`.`dpt_post` \r\n" + 
				"WHERE `pno` = ? ";
		Connection connection = null;
		PreparedStatement statement = null;		 
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			statement.setObject(1, posts.getPno());
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
    


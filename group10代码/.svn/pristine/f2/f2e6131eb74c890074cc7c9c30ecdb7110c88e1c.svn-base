package com.posts.action;

import java.util.ArrayList;
import java.util.List;

import com.dept.dao.DeptDao;
import com.dept.pojo.DeptTransfer;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.posts.dao.PostDao;
import com.posts.pojo.ClassAll;
import com.posts.pojo.PostTransfer;


public class PostAction extends ActionSupport implements ModelDriven<ClassAll> {
     private ClassAll classAll = new ClassAll();
     private List<PostTransfer> deptTransfers =new ArrayList<PostTransfer>();
 	public String listTransfer() throws Exception{
 		PostDao deptDao=new PostDao();
 		deptTransfers=deptDao.listTransfer();
 		return "listTransfer";
 	}
     //列出某一岗位中所有员工
     public String findrole() throws Exception{
    	 PostDao pd = new PostDao();
    	 classAll.setLpe(pd.listDe(classAll.getPosts().getPno()));
    	 return "findrole";
     }
    //找到一个岗位
     public String findpost() throws Exception{
    	 PostDao pd = new PostDao();
    	 classAll.setPosts(pd.findpost(classAll.getPosts().getPno()));
    	 return "editpost";
     }
 	//列出所有部门信息
		public String listpost() throws Exception {
			 PostDao pd = new PostDao();
	    
			classAll.setLps(pd.lps());
			return "listpost";
		}
		
		//添加岗位信息
		public String add() throws Exception {
			 PostDao pd = new PostDao();
			 System.out.println(classAll.getPosts().getPno());
				System.out.println(classAll.getPosts().getPname());
				System.out.println(classAll.getPosts().getPum());
			int j = pd.add(this.classAll.getPosts());
			if ( j== 0) {
				return ERROR;
			} else {
				return this.listpost();
			}
		}
     
		//删除一个部门
		public String delete() throws Exception {
			PostDao pd = new PostDao();
			int i = pd.delete(this.classAll.getPosts());
			if (i == 0) {
				return ERROR;
			} else {
				return this.listpost();
			}
		}
		
		//编辑岗位信息
				public String editpost() throws Exception {
					PostDao pd = new PostDao();
					int i = pd.editpost(this.classAll.getPosts());
					if (i == 0) {
						return ERROR;
					} else {
						return this.listpost();
					}
				}
		
				public String beforetransfer()throws Exception{
					PostDao pd = new PostDao();
					classAll.setLps(pd.lps());
					return "before";
				}
				public String transfer()throws Exception{
					PostDao pd = new PostDao();
					int j;
				//	System.out.println(classAll.getPostTransfer().getEmpno());
				//	System.out.println(classAll.getPostTransfer().getOldPno());
				//	System.out.println(classAll.getPostTransfer().getPostTransferCause());
					j= pd.tran(classAll.getPostTransfer());
					if ( j== 0) {
						return ERROR;
					} else {		
						j=pd.addtransfer(classAll.getPostTransfer());
						if ( j== 0) {
							return ERROR;
						}else{
						return this.listpost();
						}
					}
				}


				public List<PostTransfer> getDeptTransfers() {
					return deptTransfers;
				}
				public void setDeptTransfers(List<PostTransfer> deptTransfers) {
					this.deptTransfers = deptTransfers;
				}
				public ClassAll getClassAll() {
					return classAll;
				}
				public void setClassAll(ClassAll classAll) {
					this.classAll = classAll;
				}
				/*
				 * 向页面传值
				 */
				@Override
				public ClassAll getModel() {
					// TODO Auto-generated method stub
					return null;
				}


			
}

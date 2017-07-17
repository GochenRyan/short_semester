package com.emp.action;


import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.struts2.ServletActionContext;

import com.emp.dao.RoleDao;
import com.emp.poi.ExcelReport;
import com.emp.pojo.Role;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import jxl.Sheet;



public class RoleAction extends ActionSupport implements ModelDriven<Role>{
	private Role role=new Role();
	private List<Role> lrs;
	//生成员工报表
	
	//列出全部员工
	public String list() throws Exception {
		RoleDao roleDao=new RoleDao();
		lrs=roleDao.lrs();
		return "list";
	}
	//列出全部员工的部分重要信息
	public String listpart() throws Exception {
		RoleDao roleDao=new RoleDao();
		lrs=roleDao.listpart();
		return "listpart";
	}
	//由职工号找到职工
	public String findrole() throws Exception {
		RoleDao rd = new RoleDao();
		this.role=rd.findrole(this.role.getEmpno());
		return "find";
	}
	
	public String findrole2() throws Exception {
		RoleDao rd = new RoleDao();
		this.role=rd.findrole(this.role.getEmpno());
		return "find2";
	}
	//编辑职工信息
	public String update() throws Exception {
		RoleDao rd = new RoleDao();
		int i = rd.update(this.role);
		if (i == 0) {
			return ERROR;
		} else {
			return "jump";
		}
	}
	//添加职工信息
	public String add() throws Exception {
		RoleDao rd = new RoleDao();
		int i = rd.add(this.role);
		if (i == 0) {
			return ERROR;
		} else {
			return "jump";
		}
	}
	public String delete() throws Exception {
		RoleDao rd = new RoleDao();
		int i = rd.delete(this.role);
		if (i == 0) {
			return ERROR;
		} else {
			return "jump";
		}
	}



	public void setLrs(List<Role> lrs) {
		this.lrs = lrs;
	}

	public List<Role> getLrs() {
		return lrs;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public Role getModel() {
		// TODO Auto-generated method stub
		if (this.role ==null) {
			this.role = new Role();
		}
		return this.role;
	}
}


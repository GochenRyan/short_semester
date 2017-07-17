package com.dismission.action;

import java.util.List;

import com.dismission.dao.DisDao;
import com.dismission.pojo.DisEmp;
import com.emp.dao.RoleDao;
import com.emp.pojo.Role;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DisAction extends ActionSupport implements ModelDriven<DisEmp>{
	private List<DisEmp> disEmps;

	private List<Role> lrs;

	private DisEmp disEmp=new DisEmp();
	
	public String apart() throws Exception {
		RoleDao roleDao=new RoleDao();
		lrs=roleDao.lrs();
		return "listrole";
	}
	
	//离职员工加入离职员工列表

	public String add() throws Exception {
		DisDao disDao = new DisDao();
		int i=0;
		i=disDao.add(disEmp);
		if ( i== 0) {
			return ERROR;
		} else {
			i=disDao.dis(disEmp.getEmpno());
			if ( i== 0) {
				return ERROR;
			}
			else{
				return this.list();
			}
		}

	}
	
	//列出所有离职职工信息
	public String list() throws Exception {
		DisDao disDao = new DisDao();
		disEmps = disDao.list();
		return "list";
	}
 
	/*private String dis() throws Exception{
		 DisDao disDao = new DisDao();
		int id;
		 id= disDao.dis(this.disEmp.getEmpno());
		 return "dis";
	 }*/
	

	public List<Role> getLrs() {
		return lrs;
	}

	public void setLrs(List<Role> lrs) {
		this.lrs = lrs;
	}

	public List<DisEmp> getDisEmps() {
		return disEmps;
	}

	public void setDisEmps(List<DisEmp> disEmps) {
		this.disEmps = disEmps;
	}
	
	public DisEmp getDisEmp() {
		return disEmp;
	}
	public void setDisEmp(DisEmp disEmp) {
		this.disEmp = disEmp;
	}

	@Override
	public DisEmp getModel() {
		// TODO Auto-generated method stub
		return null;
	}


}

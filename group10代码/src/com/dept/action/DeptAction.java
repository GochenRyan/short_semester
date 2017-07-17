package com.dept.action;


import java.util.ArrayList;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import com.dept.dao.DeptDao;
import com.dept.pojo.ClassBag;
import com.dept.pojo.DeptTransfer;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DeptAction  extends ActionSupport implements ModelDriven<ClassBag>{
	private ClassBag classBag=new ClassBag();
	//调动信息
	private JFreeChart chart;
	private List<DeptTransfer> deptTransfers =new ArrayList<DeptTransfer>();
	public String listTransfer() throws Exception{
		DeptDao deptDao=new DeptDao();
		deptTransfers=deptDao.listTransfer();
		return "listTransfer";
	}
	public String report() throws Exception{
		DefaultPieDataset data = new DefaultPieDataset(); 
        data.setValue("Java", new Double(43.2)); 
        data.setValue("Visual Basic", new Double(1.0)); 
        data.setValue("C/C++", new Double(17.5)); 
        data.setValue("tangjun", new Double(60.0)); 
        //生成JFreeChart对象 
        chart = ChartFactory.createPieChart("Pie Chart", data, true,true, false); 
		return "show";
	}
	//列出部门中所有员工的信息
	public String findrole() throws Exception{
		DeptDao dd = new DeptDao();
		classBag.setLrd(dd.listDe(classBag.getDept().getDptno()));
		return "findrole";
	}
	/*找到一个部门*/
	public String finddept() throws Exception{
		DeptDao dd = new DeptDao();
		classBag.setDept(dd.finddept(classBag.getDept().getDptno()));
		return "editdept";
	}
	//列出所有部门信息
	public String listDpt() throws Exception {
		DeptDao rd = new DeptDao();
		classBag.setLds(rd.lds());
		return "listDpt";
	}
	/*添加部门信息*/
	public String adddept() throws Exception {
		DeptDao dd = new DeptDao();
		int j = dd.adddept(this.classBag.getDept());
		if ( j== 0) {
			return ERROR;
		} else {
			return this.listDpt();
		}
	}
	/*删除一个部门*/
	public String delete() throws Exception {
		DeptDao dd = new DeptDao();
		int i = dd.delete(this.classBag.getDept());
		if (i == 0) {
			return ERROR;
		} else {
			return this.listDpt();
		}
	}
	//编辑部门信息
	public String editdept() throws Exception {
		DeptDao dd = new DeptDao();
		int i = dd.editdept(this.classBag.getDept());
		if (i == 0) {
			return ERROR;
		} else {
			return this.listDpt();
		}
	}

	public String beforetransfer()throws Exception{
		DeptDao rd = new DeptDao();
		classBag.setLds(rd.lds());
		return "before";
	}
	public String transfer()throws Exception{
		DeptDao deptDao = new DeptDao();
		int j;
		System.out.println(classBag.getDeptTransfer().getEmpno());
		System.out.println(classBag.getDeptTransfer().getOldDptno());
		System.out.println(classBag.getDeptTransfer().getDptTransferCause());
		j= deptDao.tran(classBag.getDeptTransfer());
		if ( j== 0) {
			return ERROR;
		} else {

			j=deptDao.addtransfer(classBag.getDeptTransfer());
			if ( j== 0) {
				return ERROR;
			}else{
				return this.listDpt();
			}
		}
	}


	public JFreeChart getChart() {
		return chart;
	}
	public void setChart(JFreeChart chart) {
		this.chart = chart;
	}
	public List<DeptTransfer> getDeptTransfers() {
		return deptTransfers;
	}

	public void setDeptTransfers(List<DeptTransfer> deptTransfers) {
		this.deptTransfers = deptTransfers;
	}

	public ClassBag getClassBag() {
		return classBag;
	}
	public void setClassBag(ClassBag classBag) {
		this.classBag = classBag;
	}
	/*
	 * 向页面传值
	 */


	@Override
	public ClassBag getModel() {
		// TODO Auto-generated method stub
		return null;
	}
}

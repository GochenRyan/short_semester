package com.dept.pojo;

import java.util.List;

public class ClassBag {
	private Dept dept= new Dept(); //单个部门
	private DeptTransfer deptTransfer=new DeptTransfer(); //部门调动信息
	private List<Dept> lds; //部门列表
	private List<DeptEmp> lrd;  //部门中的职工
	public List<Dept> getLds() {
		return lds;
	}
	public void setLds(List<Dept> lds) {
		this.lds = lds;
	}
	public List<DeptEmp> getLrd() {
		return lrd;
	}
	public void setLrd(List<DeptEmp> lrd) {
		this.lrd = lrd;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public DeptTransfer getDeptTransfer() {
		return deptTransfer;
	}
	public void setDeptTransfer(DeptTransfer deptTransfer) {
		this.deptTransfer = deptTransfer;
	}
}

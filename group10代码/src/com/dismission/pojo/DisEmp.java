package com.dismission.pojo;

import java.util.Date;

public class DisEmp {
	private int id;
	private int empno;
	private Date dimissionDate;
	private String dimissionType;
	private String dimissionRemark;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public Date getDimissionDate() {
		return dimissionDate;
	}
	public void setDimissionDate(Date dimissionDate) {
		this.dimissionDate = dimissionDate;
	}
	public String getDimissionType() {
		return dimissionType;
	}
	public void setDimissionType(String dimissionType) {
		this.dimissionType = dimissionType;
	}
	public String getDimissionRemark() {
		return dimissionRemark;
	}
	public void setDimissionRemark(String dimissionRemark) {
		this.dimissionRemark = dimissionRemark;
	}

}

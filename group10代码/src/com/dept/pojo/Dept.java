package com.dept.pojo;

import java.util.Date;

public class Dept {
	private int dptno;
	private String dname;
	private String dptTel;
	private String upDpt;
	private Date setupDate;
	public int getDptno() {
		return dptno;
	}
	public void setDptno(int dptno) {
		this.dptno = dptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDptTel() {
		return dptTel;
	}
	public void setDptTel(String dptTel) {
		this.dptTel = dptTel;
	}
	public String getUpDpt() {
		return upDpt;
	}
	public void setUpDpt(String upDpt) {
		this.upDpt = upDpt;
	}
	public Date getSetupDate() {
		return setupDate;
	}
	public void setSetupDate(Date setupDate) {
		this.setupDate = setupDate;
	}
	
	

}

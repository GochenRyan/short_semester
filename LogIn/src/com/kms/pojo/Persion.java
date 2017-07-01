package com.kms.pojo;

import java.io.Serializable;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.jasper.tagplugins.jstl.core.If;

import com.sun.org.apache.bcel.internal.generic.I2F;

public class Persion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final SimpleDateFormat FORMAT =new SimpleDateFormat("yyyy-MM-dd");
	private int pid;
	private String pnm;
	private String pwd;
	private Date bdate;
	private int rid;
	private int mgid;
	private String icon;
	public Persion() {}
	
	public Persion(String pid, String pnm, String pwd, String bdate, String rid, String mgid, String icon) {
		if(pid!=null && pid.length()>0) {
		this.pid = Integer.parseInt(pid);
		}
		this.pnm = pnm;
		this.pwd = pwd;
		if(bdate!=null && bdate.length()>0) {
			try {
				this.bdate = (Date) FORMAT.parse(bdate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(rid!=null && rid.length()>0) {
			this.rid = Integer.parseInt(rid);
		}
		if(mgid!=null && mgid.length()>0) {
			this.mgid = Integer.parseInt(mgid);
		}
		this.icon = icon;
	}

	public String getPnm() {
		return pnm;
	}
	public void setPnm(String pnm) {
		this.pnm = pnm;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public int getMgid() {
		return mgid;
	}
	public void setMgid(int mgid) {
		this.mgid = mgid;
	}
	public static SimpleDateFormat getFormat() {
		return FORMAT;
	}
	
}

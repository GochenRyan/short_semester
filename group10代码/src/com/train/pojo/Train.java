package com.train.pojo;

import java.util.Date;

public class Train {

	private int empno;	
	private String trainName;
	private String trainType;
	private String trainCmp;
	private String trainLeader;
	private String trainRange;
	private String trainLoc;
	private Date trainStart;
	private Date trainEnd;
	private float trainCost;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getTrainType() {
		return trainType;
	}
	public void setTrainType(String trainType) {
		this.trainType = trainType;
	}
	public String getTrainCmp() {
		return trainCmp;
	}
	public void setTrainCmp(String trainCmp) {
		this.trainCmp = trainCmp;
	}
	public String getTrainLeader() {
		return trainLeader;
	}
	public void setTrainLeader(String trainLeader) {
		this.trainLeader = trainLeader;
	}
	public String getTrainRange() {
		return trainRange;
	}
	public void setTrainRange(String trainRange) {
		this.trainRange = trainRange;
	}
	public String getTrainLoc() {
		return trainLoc;
	}
	public void setTrainLoc(String trainLoc) {
		this.trainLoc = trainLoc;
	}
	public Date getTrainStart() {
		return trainStart;
	}
	public void setTrainStart(Date trainStart) {
		this.trainStart = trainStart;
	}
	public Date getTrainEnd() {
		return trainEnd;
	}
	public void setTrainEnd(Date trainEnd) {
		this.trainEnd = trainEnd;
	}
	public float getTrainCost() {
		return trainCost;
	}
	public void setTrainCost(float trainCost) {
		this.trainCost = trainCost;
	}


}

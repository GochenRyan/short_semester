package com.kms.pojo;

public class Person {
	private String name;
	private String psw;
	public Person(String name2, String pwd) {
		this.name = name2;
		this.psw = pwd;
	}
	public Person() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
}
package com.kms.action;

import java.util.Collection;

import com.kms.dao.PersonDao;
import com.kms.pojo.Person;

public class PersonAction extends MyActionSupport{
	Collection<Person> cbs;
	public String list() {
		PersonDao ud = new PersonDao();
		cbs = ud.lrs();
		return LIST;	
	}
	
	public Collection<Person> getCbs(){
		return cbs;
	}
}

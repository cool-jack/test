package com.practice.Dao;

import java.util.List;

import com.practice.Bean.PersonBean;

public interface PersonDAO {

	public void addPerson(PersonBean personBean);
	public void UpdatePerson(PersonBean personBean);
	public List<PersonBean> listPerson();
	public PersonBean getPersonById(int id);
	public void removePersonById(int id);
	
}

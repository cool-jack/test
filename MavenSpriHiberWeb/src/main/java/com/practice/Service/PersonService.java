package com.practice.Service;

import java.util.List;

import com.practice.Bean.PersonBean;

public interface PersonService {

	public void addPerson(PersonBean person);
	public void updatePerson(PersonBean person);
	public List<PersonBean> getAllPerson();
	public PersonBean getPersonById(int id);
	public void removePersonById(int id);
	
}

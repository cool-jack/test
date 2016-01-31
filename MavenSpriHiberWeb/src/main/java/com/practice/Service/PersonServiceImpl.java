package com.practice.Service;

import java.util.List;

import com.practice.Bean.PersonBean;
import com.practice.Dao.PersonDAO;
import com.practice.Dao.PersonDAOImpl;

public class PersonServiceImpl implements PersonService {

	private PersonDAO DAOImpl; 
	
	public void setPersonDAO(PersonDAO personDAO){
		DAOImpl= personDAO;
	}
	
	public void addPerson(PersonBean person) {
		DAOImpl.addPerson(person);
		
	}

	public void updatePerson(PersonBean person) {
	DAOImpl.UpdatePerson(person);	
	}

	public List<PersonBean> getAllPerson() {
		List<PersonBean> personList = null;
		personList = DAOImpl.listPerson();
		return personList;
	}

	public PersonBean getPersonById(int id) {
		PersonBean personBean = DAOImpl.getPersonById(id);
		
		return personBean;
	}

	public void removePersonById(int id) {
		DAOImpl.removePersonById(id);
		
	}

}

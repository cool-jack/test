package com.practice.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practice.Bean.PersonBean;
import com.practice.Dao.PersonDAO;
import com.practice.Dao.PersonDAOImpl;

@Service
public class PersonServiceImpl implements PersonService {

	private PersonDAO DAOImpl; 
	
	public void setPersonDAO(PersonDAO personDAO){
		DAOImpl= personDAO;
	}
	
	@Transactional
	public void addPerson(PersonBean person) {
		DAOImpl.addPerson(person);
		
	}
	
	@Transactional
	public void updatePerson(PersonBean person) {
	DAOImpl.UpdatePerson(person);	
	}
	
	@Transactional
	public List<PersonBean> getAllPerson() {
		List<PersonBean> personList = null;
		personList = DAOImpl.listPerson();
		return personList;
	}
	
	@Transactional
	public PersonBean getPersonById(int id) {
		PersonBean personBean = DAOImpl.getPersonById(id);
		
		return personBean;
	}
	
	
	@Transactional
	public void removePersonById(int id) {
		DAOImpl.removePersonById(id);
		
	}

}

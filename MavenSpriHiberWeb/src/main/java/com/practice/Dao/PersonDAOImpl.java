package com.practice.Dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.practice.Bean.PersonBean;

public class PersonDAOImpl implements PersonDAO {
	
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(PersonBean.class);
	
	private SessionFactory sessionFactory;
	Session session = this.sessionFactory.getCurrentSession();
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory  = sf;
	}
	
	public void addPerson(PersonBean personBean) {
		session.save(personBean);
		logger.info("peson is saved successfully  for id: "+personBean.getId());
		
	}

	public void UpdatePerson(PersonBean personBean) {
		session.update(personBean);
		logger.info("person is successfully updated for id : "+ personBean.getId());
		
	}

	@SuppressWarnings("unchecked")
	public List<PersonBean> listPerson() {
		
		List<PersonBean> personList = session.createQuery("from Person").list();
		for( PersonBean person : personList)
		{
			logger.info("information for person  : "+ person);
		}
		
		return personList;
	}

	public PersonBean getPersonById(int id) {
		PersonBean person = null;
		PersonBean person1 = (PersonBean) session.load(PersonBean.class, new Integer(id));
		if(person1 !=null)
		{
			person = person1;
		}
		logger.info("person details by id : "+person.getId());
		return person;
	}

	public void removePersonById(int id) {
		PersonBean person = (PersonBean) session.load(PersonBean.class, new Integer(id));
		if(person != null)
		{
			session.delete(person);
		}
		logger.info("person deleted successfully for person : "+person);
	}

}

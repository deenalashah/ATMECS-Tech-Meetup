package com.meetup.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.meetup.model.MeetUpRegister;
import com.meetup.model.Register;

@Transactional
@Repository
public class RegisterForMeetupDaoImpl implements RegistrationForMeetUpDao {

	MeetUpRegister meetUpRegistration = new MeetUpRegister();
	@Autowired
	SessionFactory sf;

	public void registerationforMeetup(int employeeId) {
		String hql = "select r from Register r where r.id='"+employeeId+"'";
		Register emp = (Register) sf.getCurrentSession().createQuery(hql)
				.uniqueResult();
		System.out.println(emp);

		meetUpRegistration.setEmployee_email(emp.getEmail());
		meetUpRegistration.setEmployee_id(employeeId);
		meetUpRegistration.setEmployee_name(emp.getName());

		sf.getCurrentSession().save(meetUpRegistration);

	}

}

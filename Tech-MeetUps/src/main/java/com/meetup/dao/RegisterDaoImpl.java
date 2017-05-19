package com.meetup.dao;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.meetup.model.MeetUps;
import com.meetup.model.Register;

@Transactional
@Repository
public class RegisterDaoImpl implements RegisterDao {
	@Autowired
	private SessionFactory sf;

	public void register(Register register) {

		sf.getCurrentSession().save(register);

	}

	public List<Register> viewEmployees() {

		List<Register> list = sf.getCurrentSession().createCriteria(Register.class).list();

		return list;
	}

}

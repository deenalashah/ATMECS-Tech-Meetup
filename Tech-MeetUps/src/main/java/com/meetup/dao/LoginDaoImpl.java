package com.meetup.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.meetup.model.Login;
import com.meetup.model.Register;

@Transactional
@Repository
public class LoginDaoImpl implements LoginDao {
	@Autowired
	private SessionFactory sf;

	public boolean validateLogin(String email, String password) {

		
		Query query =  sf.getCurrentSession().createQuery("from Register where email = '"+email+"' and password='"+password+"' ");
		
		List<Login> list = query.list();
		if(list.isEmpty())
			return false;
		else
			return true;

	}

}

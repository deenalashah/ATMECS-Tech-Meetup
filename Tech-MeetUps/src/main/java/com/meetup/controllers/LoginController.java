package com.meetup.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.meetup.dao.LoginDao;
import com.meetup.dao.RegisterDao;
import com.meetup.model.Login;
import com.meetup.model.Register;

@RestController
public class LoginController {

	@Autowired
	private LoginDao loginDao;
	@CrossOrigin
	@RequestMapping(value = "/valEmp/{email}/{password}", method = RequestMethod.POST, headers = "Accept=application/json")
	public void valEmp(@PathVariable("email")String email,@PathVariable("password")String password) {
	
		boolean flag= loginDao.validateLogin(email, password);
		if(flag)
			System.out.println("User Present");
		else
			System.out.println("invalid credentials");
	}

}

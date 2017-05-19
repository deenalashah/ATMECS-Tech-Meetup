package com.meetup.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.meetup.dao.RegistrationForMeetUpDao;
@RestController
public class RegisterForMeetUpController {
	@Autowired
	RegistrationForMeetUpDao registerMeetUpdao;
	
	@CrossOrigin
	@RequestMapping(value = "/registrationMeetUp/{employee_id}", method = RequestMethod.POST, headers = "Accept=application/json")
	
	public void registrationMeetUp( @PathVariable("employee_id") int employeeId) {
		registerMeetUpdao.registerationforMeetup(employeeId);
	}

}

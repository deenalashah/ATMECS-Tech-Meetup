package com.meetup.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.meetup.dao.RegisterDao;
import com.meetup.model.MeetUps;
import com.meetup.model.Register;

@RestController
public class RegisterController {
	@Autowired
	private RegisterDao regDao;
	@CrossOrigin
	@RequestMapping(value = "/addEmp", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addEmp(@RequestBody Register reg) {

		System.out.println("inside add employee");
		regDao.register(reg);
	}
	@CrossOrigin
	@RequestMapping(value = "/viewAllEmp", method = RequestMethod.GET, headers = "Accept=application/json")

	public List<Register> viewAllEmp() {

		System.out.println("inside view employees");
		return regDao.viewEmployees();
	}

}

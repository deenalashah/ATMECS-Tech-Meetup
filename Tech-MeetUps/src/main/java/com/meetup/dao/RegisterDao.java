package com.meetup.dao;

import java.util.List;

import com.meetup.model.MeetUps;
import com.meetup.model.Register;

public interface RegisterDao {
	void register(Register register);
	List<Register> viewEmployees();

}

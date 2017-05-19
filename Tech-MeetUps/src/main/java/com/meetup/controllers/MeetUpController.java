package com.meetup.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.meetup.dao.MeetUpDao;
import com.meetup.model.MeetUps;

@RestController
public class MeetUpController {
	@Autowired
	private MeetUpDao meetupdao;
	@CrossOrigin
	@RequestMapping(value = "/addMeet", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addMeet(@RequestBody MeetUps meetups) {

		System.out.println("inside add meetups");
		meetupdao.addMeetUp(meetups);
	}
	@CrossOrigin
	@RequestMapping(value = "/viewMeets", method = RequestMethod.GET, headers = "Accept=application/json")

	public List<MeetUps> viewMeets() {

		System.out.println("inside viewmeetups");
		return meetupdao.viewMeetUps();
	}
	@CrossOrigin
	@RequestMapping(value = "/updateMeets", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateMeets(@RequestBody MeetUps meetups) {
		meetupdao.updateMeetUp(meetups);
	}
	@CrossOrigin
	@RequestMapping(value="/deleteMeets/{id}", method=RequestMethod.DELETE,headers="Accept=application/json")
	public  void deleteMeets(@PathVariable int id)
	{
		meetupdao.DeleteMeetUp(id);
	}
	@CrossOrigin
	@RequestMapping(value = "/viewMeetsbyName/{presentor}", method = RequestMethod.GET, headers = "Accept=application/json")

	public List<MeetUps> viewMeetsbyName(@PathVariable String presentor) {

		System.out.println("inside viewmeetups by name");
		System.out.println("presentor is "+presentor);
		return meetupdao.viewMeetUpsByPresentor(presentor);
	}
}

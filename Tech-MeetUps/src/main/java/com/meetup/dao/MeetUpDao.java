package com.meetup.dao;

import java.util.List;

import com.meetup.model.MeetUps;

public interface MeetUpDao {
	
	public void addMeetUp(MeetUps meetup);
	List<MeetUps> viewMeetUps();
	public void updateMeetUp(MeetUps meetups);
	public void DeleteMeetUp(int id);
	public List<MeetUps> viewMeetUpsByPresentor(String presentor);
	
	

}

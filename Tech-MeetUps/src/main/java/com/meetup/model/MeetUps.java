package com.meetup.model;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class MeetUps {
	@Id
	@GeneratedValue
	private int meetup_id;

	public int getMeetup_id() {
		return meetup_id;
	}

	public void setMeetup_id(int meetup_id) {
		this.meetup_id = meetup_id;
	}

	private String title;
	private String presentor;
	private String description;
	@DateTimeFormat(pattern = "HH:mm:ss")
	private Time startTime;
	//@Type(type="date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String meetup_date;

	public String getTitle() {
		return title;
	}

	

	public String getMeetup_date() {
		return meetup_date;
	}

	public void setMeetup_date(String meetup_date) {
		this.meetup_date = meetup_date;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPresentor() {
		return presentor;
	}

	public void setPresentor(String presentor) {
		this.presentor = presentor;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public String getGuests() {
		return guests;
	}

	public void setGuests(String guests) {
		this.guests = guests;
	}

	@DateTimeFormat(pattern = "HH:mm:ss")
	private Time endTime;
	private String guests;


}




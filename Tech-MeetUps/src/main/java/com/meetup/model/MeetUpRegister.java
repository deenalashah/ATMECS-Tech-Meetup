package com.meetup.model;

import javax.persistence.*;

@Entity
public class MeetUpRegister {
	
	
	@Override
	public String toString() {
		return "MeetUpRegister [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_email="
				+ employee_email + "]";
	}
	@Id
	@GeneratedValue
	private int employee_id;
	public MeetUpRegister() {
		super();
		
	}
	
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getEmployee_email() {
		return employee_email;
	}
	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}
	private String employee_name;
	private String employee_email;
	
}

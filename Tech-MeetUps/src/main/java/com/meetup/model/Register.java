package com.meetup.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="register")
public class Register {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private String password;
	private String company;
	private String company_address;
	private int years_exp;
	private long phone;
	private String technical_capabilities;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompany_address() {
		return company_address;
	}

	public void setCompany_address(String company_address) {
		this.company_address = company_address;
	}

	public int getYears_exp() {
		return years_exp;
	}

	public void setYears_exp(int years_exp) {
		this.years_exp = years_exp;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getTechnical_capabilities() {
		return technical_capabilities;
	}

	public void setTechnical_capabilities(String technical_capabilities) {
		this.technical_capabilities = technical_capabilities;
	}

}

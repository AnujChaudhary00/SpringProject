package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class Library {

	@Id
	private String name;
	private String emailId;
	private Integer contactno;
	private String gender;
	private String bloodgroup;
	private String dob;
	private String address;
	
	
	public Library()
	{
		
	}




	
	public Library(String name, String emailId, Integer contactno, String gender, String bloodgroup, String dob,
			String address) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.contactno = contactno;
		this.gender = gender;
		this.bloodgroup = bloodgroup;
		this.dob = dob;
		this.address = address;

	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getEmailId() {
		return emailId;
	}





	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}





	public Integer getContactno() {
		return contactno;
	}





	public void setContactno(Integer contactno) {
		this.contactno = contactno;
	}





	public String getGender() {
		return gender;
	}





	public void setGender(String gender) {
		this.gender = gender;
	}





	public String getBloodgroup() {
		return bloodgroup;
	}





	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}





	public String getDob() {
		return dob;
	}





	public void setDob(String dob) {
		this.dob = dob;
	}





	public String getAddress() {
		return address;
	}





	public void setAddress(String address) {
		this.address = address;
	}








	

	

}


package com.spring.validation.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



import org.hibernate.validator.constraints.Email;
import org.springframework.stereotype.Component;

@Component
public class Register {
	@NotNull(message="please enter Name")
	@Size(min=4,max=20,message="Name should be between 4 to 20 Charactors")
	private String name;
	
	@NotNull(message="Please Enter Email ID")
	@Email(message="Enter Valid Mail ID")
	private String email;
	
	@NotNull(message="please Enter Mobile NUmber")
	@Size(min=10, max=10, message="Enter Valid Number")
	private String contactNumber;
	
	@NotNull(message="please Provide Current City")
	private String city;
	
	@NotNull(message="please Provide Highest Qualification")
	private String highestQualification;
	
	@NotNull(message="please provide Education Interest")
	private String educationInterest;
	
	@NotNull(message="please provide Degree Mode")
	private String modeOfDegree;
	
	
	public String getModeOfDegree() {
		return modeOfDegree;
	}
	public void setModeOfDegree(String modeOfDegree) {
		this.modeOfDegree = modeOfDegree;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHighestQualification() {
		return highestQualification;
	}
	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}
	public String getEducationInterest() {
		return educationInterest;
	}
	public void setEducationInterest(String educationInterest) {
		this.educationInterest = educationInterest;
	}
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
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	
	

}

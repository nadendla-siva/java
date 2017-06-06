package com.spring.validation.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Repository;

@Entity
@Repository
@Table(name="register")
public class RegisterEntity implements Serializable{
	
	@Column(length=20)
	private String name;
	@Column
	@Id
	private String email;
	@Column(name="contact_number", length=10)
	private String contactNumber;
	@Column(length=20)
	private String city;
	@Column(length=15)
	private String highestQualification;
	@Column(length=15)
	private String educationInterest;
	@Column(name="degree_mode", length=15)
	private String modeOfDegree;
	@Column(length=16)
	private String password;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public String getModeOfDegree() {
		return modeOfDegree;
	}
	public void setModeOfDegree(String modeOfDegree) {
		this.modeOfDegree = modeOfDegree;
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
	
	
	

}

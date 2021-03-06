package com.spring.validation.entity;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.springframework.stereotype.Repository;

@Entity
@Repository
@Table(name="edu_insts")
public class InstEntity implements Serializable{
	
	@Column(length=20)
	private String name;
	@Column(length=200)
	private String description;
	@Column(length=20)
	private String city;
	@Column(length=20)
	private String state;
	@Id
	@Column(length=20)
	private String inst_id;
	@Column(length=40)
	private String anchor;
	@Lob
	private byte[] logo;
	
	@OneToMany(targetEntity=CourseEntity.class, fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="college_id_ref",referencedColumnName="inst_id")
	private Set<CourseEntity> courseList;
	
	
	public Set<CourseEntity> getCourseList() {
		return courseList;
	}
	public void setCourseList(Set<CourseEntity> courseList) {
		this.courseList = courseList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getInst_id() {
		return inst_id;
	}
	public void setInst_id(String inst_id) {
		this.inst_id = inst_id;
	}
	public String getAnchor() {
		return anchor;
	}
	public void setAnchor(String anchor) {
		this.anchor = anchor;
	}
	public byte[] getLogo() {
		return logo;
	}
	public void setLogo(byte[] logo) {
		this.logo = logo;
	}
	

}

package com.noah.domain;

import java.util.List;

public class Tutor {
	
	private Integer tutorId;
	private String name;
	private String email;
	private List<Course> courses;
	
	public Integer getTutorId() {
		return tutorId;
	}
	public void setTutorId(Integer tutorId) {
		this.tutorId = tutorId;
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
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	@Override
	public String toString() {
		return "Tutor [tutorId=" + tutorId + ", name=" + name + ", email=" + email + ", courses=" + courses + "]";
	}
	
	
	
	
}

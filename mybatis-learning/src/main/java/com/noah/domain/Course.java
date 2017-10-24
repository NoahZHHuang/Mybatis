package com.noah.domain;

import java.util.Date;

public class Course {
	
	private Integer courseId;
	private String name;
	private String description;
	private Date startDate;
	private Date endDate;
	private Tutor tutor;
	
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Tutor getTutor() {
		return tutor;
	}
	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}
	
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", name=" + name + ", description=" + description + ", startDate="
				+ startDate + ", endDate=" + endDate + ", tutor=" + tutor + "]";
	}
	
	
	
	

}

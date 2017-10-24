package com.noah.domain;

public class TutorCourseCount {
	
	private Integer tutorId;
	private String tutorName;
	private Integer courseCount;
	
	public Integer getTutorId() {
		return tutorId;
	}
	public void setTutorId(Integer tutorId) {
		this.tutorId = tutorId;
	}
	public String getTutorName() {
		return tutorName;
	}
	public void setTutorName(String tutorName) {
		this.tutorName = tutorName;
	}
	public Integer getCourseCount() {
		return courseCount;
	}
	public void setCourseCount(Integer courseCount) {
		this.courseCount = courseCount;
	}
	
	@Override
	public String toString() {
		return "TutorCourseCount [tutorId=" + tutorId + ", tutorName=" + tutorName + ", courseCount=" + courseCount
				+ "]";
	}
	
	
	

}

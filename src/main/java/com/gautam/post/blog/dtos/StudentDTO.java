package com.gautam.post.blog.dtos;

public class StudentDTO {
	Long rollNumber;
	String name;
	String phNumber;
	CourseDTO course;
	String std;

	public Long getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Long rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}

	public CourseDTO getCourse() {
		return course;
	}

	public void setCourse(CourseDTO course) {
		this.course = course;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	@Override
	public String toString() {
		return "StudentDTO [rollNumber=" + rollNumber + ", name=" + name + ", phNumber=" + phNumber + ", course="
				+ course + ", std=" + std + "]";
	}

}

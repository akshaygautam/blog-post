package com.gautam.post.blog.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class StudentModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long rollNumber;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "phNumber")
	String phNumber;
	
	@Column(name = "std")
	String std;

	@ManyToOne(fetch = FetchType.LAZY)
	CourseModel course;

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

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public CourseModel getCourse() {
		return course;
	}

	public void setCourse(CourseModel course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "StudentModel [rollNumber=" + rollNumber + ", name=" + name + ", phNumber=" + phNumber + ", std=" + std
				+ ", course=" + course + "]";
	}
	
	
}

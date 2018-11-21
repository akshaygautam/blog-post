package com.gautam.post.blog.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class CourseModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "duration")
	Double duration;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "course_subject", 
		joinColumns = @JoinColumn(name = "courses_id", referencedColumnName = "id"), 
		inverseJoinColumns = @JoinColumn(name = "subjects_id", referencedColumnName= "id"))
	List<SubjectModel> subjects;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public List<SubjectModel> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<SubjectModel> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "CourseModel [id=" + id + ", name=" + name + ", duration=" + duration + ", subjects=" + subjects + "]";
	}


	
}

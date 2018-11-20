package com.gautam.post.blog.dtos;

import java.util.List;

public class CourseDTO {
	Long id;
	String name;
	Double duration;
	List<SubjectDTO> subjects;

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

	public List<SubjectDTO> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<SubjectDTO> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "CourseDTO [id=" + id + ", name=" + name + ", duration=" + duration + "]";
	}

}

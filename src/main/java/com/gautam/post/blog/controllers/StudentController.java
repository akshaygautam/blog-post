package com.gautam.post.blog.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gautam.post.blog.dtos.StudentDTO;
import com.gautam.post.blog.services.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/student/:rollNumber")
	public StudentDTO getStudentByRollNumber(@PathParam(value = "rollNumber") Long rollNumber) {
		return studentService.getStudentByRollNumber(rollNumber);
	}
	
	@GetMapping("/students")
	public List<StudentDTO> getStudents() {
		return studentService.getStudents();
	}
	
	@PostMapping("/student")
	public StudentDTO saveStudent(StudentDTO student) {
		return studentService.saveStudent(student);
	}
	
	@DeleteMapping("/student/:rollNumber")
	public StudentDTO deleteStudent(@PathParam(value="rollNumber") Long rollNumber) {
		return studentService.deleteStudent(rollNumber);
	}
	
	
}

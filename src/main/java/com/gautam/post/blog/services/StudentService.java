package com.gautam.post.blog.services;

import java.util.List;

import com.gautam.post.blog.dtos.StudentDTO;

public interface StudentService {

	StudentDTO getStudentByRollNumber(Long rollNumber);

	List<StudentDTO> getStudents();

	StudentDTO deleteStudent(Long rollNumber);

	StudentDTO saveStudent(StudentDTO student);

}

package com.gautam.post.blog.serviceImpls;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gautam.post.blog.dtos.StudentDTO;
import com.gautam.post.blog.repositories.StudentRepository;
import com.gautam.post.blog.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	private StudentRepository studentRepository;
	
	@Override
	public StudentDTO getStudentByRollNumber(Long rollNumber) {
		return null;
	}

	@Override
	public List<StudentDTO> getStudents() {
		return null;
	}

	@Override
	public StudentDTO deleteStudent(Long rollNumber) {
		return null;
	}

	@Override
	public StudentDTO saveStudent(StudentDTO student) {
		return null;
	}

}

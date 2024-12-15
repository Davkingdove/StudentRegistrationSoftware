package com.example.registrationSoftware.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registrationSoftware.dao.StudentRepository;
import com.example.registrationSoftware.model.Student;

@Service
public class StudentServiceImple implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student findById(int theId) {
		// TODO Auto-generated method stub
		Optional<Student> result = studentRepository.findById(theId);
Student theStudent = null;
		
		if (result.isPresent()) {
			theStudent = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find student id - " + theId);
		}
		return theStudent;
	}

	@Override
	public void save(Student theStudentudent) {
		// TODO Auto-generated method stub
		studentRepository.save(theStudentudent);
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(theId);;
		
	}

}

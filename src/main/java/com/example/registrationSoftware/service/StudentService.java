package com.example.registrationSoftware.service;

import java.util.List;

import com.example.registrationSoftware.model.Student;

public interface StudentService {
List<Student> findAll();
	
	Student findById(int theId);
	
	void save(Student theEmployee);
	
	void deleteById(int theId);

}

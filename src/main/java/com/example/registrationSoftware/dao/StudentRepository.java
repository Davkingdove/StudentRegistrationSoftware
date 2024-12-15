package com.example.registrationSoftware.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.registrationSoftware.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	//Optional<Student> findByNameAndDob(String firstName, String lastName,String DateOfBirth);

}

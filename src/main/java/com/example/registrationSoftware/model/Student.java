package com.example.registrationSoftware.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "registration")
public class Student {
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int Id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "year")
	private int year;
	@Column(name = "date_of_birth")
	private String dateOfBirth;
	@Column(name = "previous_jhs")
	private String previousJhs;
	@Column(name = "bece_grade")
	private int beceGrade;
	@Column(name = "program")
	private String program;
	@Column(name = "maths")
	private String maths;
	@Column(name = "science")
	private String science;
	@Column(name = "ict")
	private String ict;
	@Column(name = "rme")
	private String rme;
	@Column(name = "social_studies")
	private String socialStudies;
	@Column(name = "english")
	private String english;
	@Column(name = "mother_name")
	private String motherName;
	@Column(name = "mother_contact")
	private String motherContact;
	@Column(name = "father_name")
	private String fatherName;
	@Column(name = "father_contact")
	private String fatherContact;
	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName, int year, String dateOfBirth, String previousJhs,
			int beceGrade, String program, String maths, String science, String ict, String rme, String socialStudies,
			String english, String motherName, String motherContact, String fatherName, String fatherContact) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.year = year;
		this.dateOfBirth = dateOfBirth;
		this.previousJhs = previousJhs;
		this.beceGrade = beceGrade;
		this.program = program;
		this.maths = maths;
		this.science = science;
		this.ict = ict;
		this.rme = rme;
		this.socialStudies = socialStudies;
		this.english = english;
		this.motherName = motherName;
		this.motherContact = motherContact;
		this.fatherName = fatherName;
		this.fatherContact = fatherContact;
	}


	public Student(String firstName, String lastName, int year, String dateOfBirth, String previousJhs,
			int beceGrade, String program, String maths, String science, String ict, String rme, String socialStudies,
			String english, String motherName, String motherContact, String fatherName, String fatherContact) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.year = year;
		this.dateOfBirth = dateOfBirth;
		this.previousJhs = previousJhs;
		this.beceGrade = beceGrade;
		this.program = program;
		this.maths = maths;
		this.science = science;
		this.ict = ict;
		this.rme = rme;
		this.socialStudies = socialStudies;
		this.english = english;
		this.motherName = motherName;
		this.motherContact = motherContact;
		this.fatherName = fatherName;
		this.fatherContact = fatherContact;
	}


	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPreviousJhs() {
		return previousJhs;
	}
	public void setPreviousJhs(String previousJhs) {
		this.previousJhs = previousJhs;
	}
	public int getBeceGrade() {
		return beceGrade;
	}
	public void setBeceGrade(int beceGrade) {
		this.beceGrade = beceGrade;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public String getMaths() {
		return maths;
	}
	public void setMaths(String maths) {
		this.maths = maths;
	}
	public String getScience() {
		return science;
	}
	public void setScience(String science) {
		this.science = science;
	}
	public String getIct() {
		return ict;
	}
	public void setIct(String ict) {
		this.ict = ict;
	}
	public String getRme() {
		return rme;
	}
	public void setRme(String rme) {
		this.rme = rme;
	}
	public String getSocialStudies() {
		return socialStudies;
	}
	public void setSocialStudies(String socialStudies) {
		this.socialStudies = socialStudies;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getMotherContact() {
		return motherContact;
	}
	public void setMotherContact(String motherContact) {
		this.motherContact = motherContact;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getFatherContact() {
		return fatherContact;
	}
	public void setFatherContact(String fatherContact) {
		this.fatherContact = fatherContact;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	

}


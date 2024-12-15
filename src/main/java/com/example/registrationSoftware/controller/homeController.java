package com.example.registrationSoftware.controller;

import java.time.Year;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.registrationSoftware.dao.StudentRepository;
import com.example.registrationSoftware.model.Student;
import com.example.registrationSoftware.service.StudentService;

@Controller
public class homeController {
	private StudentService studentService;
	

	
	public homeController(StudentService studentService) {
		
		this.studentService = studentService;
	}
	@GetMapping("/")
	public String studentHome(Model model) {
		 Student student = new Student(); // Assuming you have a Student class
	        model.addAttribute("student", student);  // Add 'student' to the model	
	        model.addAttribute("programOptions", new String[]{"General Science", "General Arts", "Home Economics", "Bussiness", "Visual Arts"});
		return "student-form";		
	}
	@PostMapping("/save")
	public String Save(@ModelAttribute("student") Student theStudent,RedirectAttributes redirectAttributes) {
		try{int currentYear = Year.now().getValue();
theStudent.setYear(currentYear);
		studentService.save(theStudent);
		redirectAttributes.addFlashAttribute("successMessage", "Student data saved successfully!");
		 redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		} catch (Exception e) {
	        redirectAttributes.addFlashAttribute("errorMessage", "An error occurred while saving student data. Please try again.");
	    }
		 return "redirect:/";		
	}
	
	
//	@GetMapping("/list")
//	public String StudentList(Model model) {
//		 Student student = new Student(); // Assuming you have a Student class
//	        model.addAttribute("student", student);  // Add 'student' to the model	       
//		return "master-page";		
//	}
	@GetMapping("/list")
	public String listEmployees(Model theModel) {

		// get the employees from db
		List<Student> theStudent = studentService.findAll();

		// add to the spring model
		theModel.addAttribute("student", theStudent);

		return "master-page";
	}
}


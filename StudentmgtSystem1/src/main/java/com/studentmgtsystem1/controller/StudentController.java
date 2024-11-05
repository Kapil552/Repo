package com.studentmgtsystem1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.studentmgtsystem1.entity.Student;
import com.studentmgtsystem1.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/home")
	String homePage() {
		return "Home";// View Page
	}

	@GetMapping("/dashboard")
	public String getAllStudent(Model model) {

		model.addAttribute("students", studentService.getAllStudent());

		return "Dashboard";
	}

	@GetMapping("/dashboard/new")
	public String createNewStudentForm(Model model) {
		Student student = new Student(); // To hold student Object
		model.addAttribute("student", student);
		return "AddNewStudent";// View
	}

	@PostMapping("/dashboard")
	public String saveNewStudent(@ModelAttribute("student") Student student) {
		studentService.saveNewStudent(student);
		return "redirect:/dashboard";
	}
}

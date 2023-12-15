package edu.yacoubi.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.yacoubi.sm.model.Student;
import edu.yacoubi.sm.service.StudentServiceImpl;

@Controller
public class StudentController {
	@Autowired
	private StudentServiceImpl service;
   
	@GetMapping("/showStudentList")
    public String showStudentsList(Model model) {
		List<Student> studentList = service.getAllStudents();
		model.addAttribute("students", studentList);
        return "student_list";
    }
	
	@GetMapping("/showStudentForm")
    public String showStudentForm(Model model) {
		model.addAttribute("student", new Student());
        return "add_student_form";
    }
	
	// post, redirect and get
	@PostMapping("/saveStudent")
    public String saveStudent(Student student) {
		service.saveStudent(student);
		//return "redirect:/thankYou";
        return "redirect:/showStudentList";
    }
	
	@ResponseBody
	@GetMapping("/thankYou")
	public String thankYou() {
		return "Thank you, Your record has been added to the database.";
	}
	
}

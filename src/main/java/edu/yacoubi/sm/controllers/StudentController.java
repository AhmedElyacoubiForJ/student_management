package edu.yacoubi.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.yacoubi.sm.dao.StudentDAO;
import edu.yacoubi.sm.model.Student;

@Controller
public class StudentController {
	
	@Autowired
	private StudentDAO dao;
   
	@GetMapping("/showStudentList")
    public String showStudentsList(Model model) {
		List<Student> studentList = dao.loadStudents();
		model.addAttribute("students", studentList);
        return "student_list";
    }
	
	@GetMapping("/showStudentForm")
    public String showStudentForm(Model model) {
		model.addAttribute("student", new Student());
        return "add_student_form";
    }
	
	@PostMapping("/saveStudent")
    public String saveStudent(Student student) {
		dao.save(student);
        return "redirect:/showStudentList";
    }
	
}

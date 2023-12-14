package edu.yacoubi.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.yacoubi.sm.dao.StudentDAO;
import edu.yacoubi.sm.model.Student;

@Controller
public class StudentController {
	
	@Autowired
	private StudentDAO studentDAO;
   
	@GetMapping("/students")
    public String showStudentsList(Model model) {
		List<Student> studentList = studentDAO.loadStudents();
		studentList.forEach(System.out::println);
		model.addAttribute("students", studentList);
        return "student_list";
    }
}

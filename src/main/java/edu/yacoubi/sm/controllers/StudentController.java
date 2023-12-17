package edu.yacoubi.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.yacoubi.sm.model.Student;
import edu.yacoubi.sm.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService service;
   
	@GetMapping("/showStudentList")
    public String showStudentsList(Model model) {
		List<Student> studentList = service.getAllStudents();
		model.addAttribute("students", studentList);
        return "student-list";
    }
	
	@GetMapping("/createStudentForm")
    public String showCreateStudentForm(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("create", true);
		model.addAttribute("action", "saveStudent");
        return "student-form";
    }
	
	// post, redirect and get
	@PostMapping("/saveStudent")
    public String saveStudent(Student student) {
		service.saveStudent(student);
        return "redirect:/showStudentList";
    }
	
	@GetMapping("/updateStudentForm")
    public String showUpdateStudentForm(@RequestParam("id") int id, Model model) {
		Student student = service.getStudentById(id);
		model.addAttribute("student", student);
		model.addAttribute("action", "updateStudent");
		return "student-form";
    }
	
	@GetMapping("deleteStudent")
	public String deleteStudent(@RequestParam("id") int id) {
		service.deleteStudentById(id);
		return "redirect:/showStudentList";
	}
	
	@PostMapping("/updateStudent")
    public String updateStudent(Student student) {
		service.updateStudent(student);
        return "redirect:/showStudentList";
    }
	
	@ResponseBody
	@GetMapping("/thankYou")
	public String thankYou() {
		return "Thank you, Your record has been added to the database.";
	}
	
}

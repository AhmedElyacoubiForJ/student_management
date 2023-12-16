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
        return "student_list";
    }
	
	@GetMapping("/showStudentForm")
    public String showStudentForm(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("isNew", true);
        return "add_student_form";
    }
	
	// post, redirect and get
	@PostMapping("/saveOrUpdateStudent")
    public String saveStudent(Student student) {
		if (student.getId() == 0) {
			service.saveStudent(student);
		} else {
			service.updateStudent(student);
		}
        return "redirect:/showStudentList";
    }
	
	@GetMapping("/showUpdateForm")
    public String showUpdateForm(Model model, @RequestParam("id") int id) {
		Student student = service.getStudentById(id);
		model.addAttribute("student", student);
        return "add_student_form";
    }
	
//	@PostMapping("/updateStudent")
//    public String updateStudent(Student student) {
//		service.updateStudent(student);
//        return "redirect:/showStudentList";
//    }
	
	@ResponseBody
	@GetMapping("/thankYou")
	public String thankYou() {
		return "Thank you, Your record has been added to the database.";
	}
	
}

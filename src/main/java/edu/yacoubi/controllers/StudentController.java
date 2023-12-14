package edu.yacoubi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
	 //@RequestMapping(value = "/students", method = GET)
    @GetMapping("/students")
    public String showStudentsList() {

        return "student_list";
    }
}

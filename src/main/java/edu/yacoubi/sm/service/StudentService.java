package edu.yacoubi.sm.service;

import java.util.List;

import edu.yacoubi.sm.model.Student;

public interface StudentService {
	List<Student> getAllStudents();
	void saveStudent(Student student);
}

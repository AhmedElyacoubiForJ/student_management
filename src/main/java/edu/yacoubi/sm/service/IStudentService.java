package edu.yacoubi.sm.service;

import java.util.List;

import edu.yacoubi.sm.model.Student;

public interface IStudentService {
	List<Student> getAllStudents();
	void saveStudent(Student student);
	Student getStudentById(int id);
	void updateStudent(Student student);
}

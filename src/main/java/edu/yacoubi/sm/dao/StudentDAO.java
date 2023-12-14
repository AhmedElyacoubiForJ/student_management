package edu.yacoubi.sm.dao;

import java.util.List;

import edu.yacoubi.sm.model.Student;

public interface StudentDAO {
	List<Student> loadStudents();
}

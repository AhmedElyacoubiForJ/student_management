package edu.yacoubi.sm.dao;

import java.util.List;

import edu.yacoubi.sm.model.Student;

public interface StudentDAO {
	List<Student> findAll();
	void save(Student student);
	Student findById(int id);
	void update(Student student);
}

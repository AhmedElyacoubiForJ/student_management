package edu.yacoubi.sm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.yacoubi.sm.dao.StudentDAO;
import edu.yacoubi.sm.model.Student;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private final StudentDAO dao;
	
	@Override
	public List<Student> getAllStudents() {
		return dao.loadStudents();
	}

	@Override
	public void saveStudent(Student student) {
		dao.save(student);
	}
}

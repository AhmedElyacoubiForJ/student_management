package edu.yacoubi.sm.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.yacoubi.sm.dao.StudentDAO;
import edu.yacoubi.sm.model.Student;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService implements IStudentService {
	private final StudentDAO dao;
	private List<String> countryAllowed =
			Arrays.asList("DE", "MA", "USA", "UK", "FR");
	@Override
	public List<Student> getAllStudents() {
		return dao.findAll();
	}

	@Override
	public void saveStudent(Student student) {
		// business as example
		if (!countryAllowed.contains(student.getCountry().toUpperCase())) {
			System.out.println("Student not allowed...");
			return;
		}
		dao.save(student);
		System.out.println("send email...");
	}

	@Override
	public Student getStudentById(int id) {
		return dao.findById(id);
	}

	@Override
	public void updateStudent(Student student) {
		dao.update(student);
	}
}

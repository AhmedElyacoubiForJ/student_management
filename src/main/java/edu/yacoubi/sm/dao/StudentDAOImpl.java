package edu.yacoubi.sm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import edu.yacoubi.sm.model.Student;
import edu.yacoubi.sm.rowmapper.StudentRowMapper;

@Repository
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	private JdbcTemplate template;

	@Override
	public List<Student> loadStudents() {
		String sql = "SELECT * FROM students";
		List<Student> queryResult = template.query(sql, new StudentRowMapper());
		return queryResult;
	}
}

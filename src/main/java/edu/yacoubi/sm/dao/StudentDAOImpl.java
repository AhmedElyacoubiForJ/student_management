package edu.yacoubi.sm.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import edu.yacoubi.sm.model.Student;
import edu.yacoubi.sm.rowmapper.StudentRowMapper;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class StudentDAOImpl implements StudentDAO {

	private final JdbcTemplate template;
	
	private final String SQL_FIND_ALL 	= "SELECT * FROM students";
	private final String SQL_SAVE     	= "INSERT INTO students (name,mobile,country) VALUES (?,?,?)";
	private final String SQL_UPDATE   	= "UPDATE students SET name=?, mobile=?, country=? WHERE id=?";
	private final String SQL_FIND_BY_ID = "SELECT * FROM students WHERE id=?";
	private final String SQL_DELETE 	= "DELETE from Students where id = ?";

	@Override
	public List<Student> findAll() {
		return template.query(SQL_FIND_ALL, new StudentRowMapper());
	}

	@Override
	public void save(Student student) {
		Object[] parameters = {
				student.getName(),
				student.getMobile(),
				student.getCountry()};
		template.update(SQL_SAVE, parameters);
	}

	@Override
	public Student findById(int id) {
//		Student student = template.queryForObject(
//				SQL_FIND_BY_ID,
//				new Object[]{id},
//				new StudentRowMapper());
		
		Student student = template.queryForObject(
				SQL_FIND_BY_ID,
				new StudentRowMapper(),
				id);
		return student;
	}

	@Override
	public void update(Student student) {
		template.update(
				SQL_UPDATE,
				student.getName(),
				student.getMobile(),
				student.getCountry(),
				student.getId());
	}

	@Override
	public void delete(int id) {
		template.update(SQL_DELETE, id);
	}
}

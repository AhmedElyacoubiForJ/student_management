package edu.yacoubi.sm.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.yacoubi.sm.model.Student;

public class StudentRowMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Student(
				rs.getInt("id"),
				rs.getString("name"),
				rs.getLong("mobile"),
				rs.getString("country"));
	}
}

package edu.yacoubi.sm.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Student {
	private int id;
	private String name;
	private Long mobile;
	private String country;
	
	public Student(
			String name,
			long mobile,
			String country) {
		this.name = name;
		this.mobile = mobile;
		this.country = country;
	}
}

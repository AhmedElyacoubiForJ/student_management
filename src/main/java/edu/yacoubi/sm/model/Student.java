package edu.yacoubi.sm.model;

public class Student {
	private int id;
	private String name;
	private long mobile;
	private String country;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public Student() {}
	
	public Student(
			int id,
			String name,
			long mobile,
			String country) {
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobile=" + mobile
				+ ", country=" + country + "]";
	}	
}

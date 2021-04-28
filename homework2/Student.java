package hw2;

import java.util.ArrayList;

public class Student {
	
	private String name;
	private String surname;
	private String emailAddress;
	private ArrayList<Course> courses;
	

	// constructor
	public Student(String name, String surname, String emailAddress) {
		super();
		this.name = name;
		this.surname = surname;
		this.emailAddress = emailAddress;
		courses = new ArrayList<Course>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	

}

package kodlamaio;

import java.util.ArrayList;

public class Student extends User {

	private ArrayList<Course> registeredCourses;
	
	public Student() {
		
	}
	
	public Student(int idNo, String name, String surname, String emailAddress, String password) {
		super(idNo, name, surname, emailAddress, password);
		this.registeredCourses = new ArrayList<Course>();
	}

	public ArrayList<Course> getRegisteredCourses() {
		return registeredCourses;
	}

	public void setRegisteredCourses(ArrayList<Course> registeredCourses) {
		this.registeredCourses = registeredCourses;
	}

	
	
}

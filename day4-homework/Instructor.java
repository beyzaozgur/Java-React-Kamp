package kodlamaio;

import java.util.ArrayList;

public class Instructor extends User {
	
	private ArrayList<Course> givenCourses;
	
	public Instructor() {
		
	}

	public Instructor(int idNo, String name, String surname, String emailAddress, String password) {
		super(idNo, name, surname, emailAddress, password);
		this.givenCourses = new ArrayList<Course>();
	}

	public ArrayList<Course> getGivenCourses() {
		return givenCourses;
	}

	public void setGivenCourses(ArrayList<Course> givenCourses) {
		this.givenCourses = givenCourses;
	}

	

}

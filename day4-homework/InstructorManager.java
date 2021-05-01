package kodlamaio;

import java.util.Iterator;

public class InstructorManager extends UserManager {
	
	public InstructorManager() {
		super();
	}
	
    public void startNewCourse(Instructor instructor, Course course) {
		
		System.out.println(instructor.getName() + " has started a new course --> " + course.getCourseName());
		
		instructor.getGivenCourses().add(course);
		
	}
    
    //method overriding
    public void displayInfo(Instructor instructor) {
    	
	    System.out.println("INSTRUCTOR INFO------------------------------------");

    	
    	super.displayInfo(instructor);
    	
    	for(Course course : instructor.getGivenCourses()) {
    		System.out.println(course.getCourseName());
    	
		}
    	System.out.println();
    	
    }



}

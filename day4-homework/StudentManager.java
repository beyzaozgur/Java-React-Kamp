package kodlamaio;

public class StudentManager extends UserManager {
	
	public StudentManager() {
		super();
	}
	
	public void registerToCourse(Student student, Course course) {
		
		System.out.println(student.getName() + "has registered to " + course.getCourseName());
		
		student.getRegisteredCourses().add(course);
		
	}
	
	//method overriding
   public void displayInfo(Student student) {
	   
	    System.out.println("STUDENT INFO------------------------------------");
    	
    	super.displayInfo(student);
    	
    	for(Course course : student.getRegisteredCourses()) {
    		System.out.println(course.getCourseName());
    	
		}
    	
    	System.out.println();
    	
    }
	

}

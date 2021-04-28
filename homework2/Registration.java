package hw2;

public class Registration {
	
	public static void registerToCourse(Student student, Course course) {
		student.getCourses().add(course);
		System.out.println(student.getName() + ", " + course.getCourseName() + " dersine kaydoldunuz.");
		System.out.println();
	}
	
	public static void deleteCourse(Student student, Course course) {
		student.getCourses().remove(course);
		System.out.println("Art�k " + course.getCourseName() + " dersine kay�tl� degilsiniz.");
		System.out.println();
	}

	public static void showRegisteredCourses(Student student) {
		
		System.out.println("Kaytl� oldugunuz kurslar:");
		
		for(Course course : student.getCourses()) {
			System.out.println(course.getCourseName());
		}
		
		System.out.println();
		
	}
		
	public static void showStudentProfile(Student student) {
		
		System.out.println("Name: " + student.getName());
		System.out.println("Surname: " + student.getSurname());
		System.out.println("E-mail: " + student.getEmailAddress());
        System.out.println("Kaytl� oldugunuz kurslar:");
		
		for(Course course : student.getCourses()) {
			System.out.println(course.getCourseName());
		}
		
		System.out.println();
		
	}
		
}

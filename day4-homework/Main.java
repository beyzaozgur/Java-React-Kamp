package kodlamaio;

public class Main {

	public static void main(String[] args) {
		
		InstructorManager instructorManager = new InstructorManager();
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demirog", "e@gmail.com", "abc123");
		instructorManager.register(instructor1);
		instructorManager.displayInfo(instructor1);
				
		Course course1 = new Course(1, "Yazilim Gelistirici Yetistirme Kampi (JAVA + REACT)", instructor1 , "21.04.2021", "16 days", 0);
		instructorManager.startNewCourse(instructor1, course1);
		
		Course course2 = new Course(2, "Yazilim Gelistirici Yetistirme Kampi (C# + ANGULAR)", instructor1 , "09.01.2021", "16 days", 0);
		instructorManager.startNewCourse(instructor1, course2);
		
		Course course3 = new Course(3, "Programlamaya Giris Icin Temel Kurs", instructor1, "-", "-", 0);
		instructorManager.startNewCourse(instructor1, course3);
		
		System.out.println();
		Course.displayCourseInfo(course1);
		Course.displayCourseInfo(course2);
		Course.displayCourseInfo(course3);
		
		StudentManager studentManager = new StudentManager();
		
		Student student1 = new Student(1, "Beyza", "Ozgur", "b@gmail.com", "def456");
		studentManager.register(student1);
		
		student1.getRegisteredCourses().add(course1);
		student1.getRegisteredCourses().add(course2);
		student1.getRegisteredCourses().add(course3);
		
		studentManager.displayInfo(student1);
		
		
		
		
	}

}

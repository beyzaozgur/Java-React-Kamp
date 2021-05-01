package hw2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course course1 = new Course(1, "Yazilim Gelistirici Yetistirme Kampi (JAVA + REACT)", "Engin Demirog", "21.04.2021", "16 days", 0);
		Course course2 = new Course(2, "Yazilim Gelistirici Yetistirme Kampi (C# + ANGULAR)", "Engin Demirog", "09.01.2021", "16 days", 0);
		Course course3 = new Course(3, "Programlamaya Giris Icin Temel Kurs", "Engin Demirog", "yok", "yok", 0);
				
				
		Student student1 = new Student("Beyza", "Ozgur", "abc35@gmail.com");
		
		
		Registration.registerToCourse(student1, course1);
		Registration.registerToCourse(student1, course2);
		Registration.registerToCourse(student1, course3);
		
		Registration.showRegisteredCourses(student1);
		
		Registration.deleteCourse(student1, course2);
		Registration.deleteCourse(student1, course3);
		
		
		System.out.println();
		
		Registration.showRegisteredCourses(student1);
		
		Registration.showStudentProfile(student1);
	}

}

package kodlamaio;

public class Course {
	
	private int courseId;
	private String courseName;
	private Instructor instructor;
	private String courseStartDate;
	private String coursePeriod;
	private int price;
	private int completitionRate;
	
	public Course() {
		
	}
	
	public Course(int courseId, String courseName, Instructor instructor, String courseDate, String coursePeriod, int price) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.instructor = instructor;
		this.courseStartDate = courseDate;
		this.coursePeriod = coursePeriod;
		this.price = price;
	}
	
	public int getCourseId() {
		return courseId;
	}
	
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseStartDate() {
		return courseStartDate;
	}

	public void setCourseStartDate(String courseStartDate) {
		this.courseStartDate = courseStartDate;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getCoursePeriod() {
		return coursePeriod;
	}
	
	public void setCoursePeriod(String coursePeriod) {
		this.coursePeriod = coursePeriod;
	}
	
	public int getCompletitionRate() {
		return completitionRate;
	}

	public void setCompletitionRate(int completitionRate) {
		this.completitionRate = completitionRate;
	}
	
	public static void displayCourseInfo(Course course) {
		
		System.out.println("COURSE INFO---------------------------------");
		System.out.println("Name: " + course.getCourseName());
		System.out.println("ID: " + course.getCourseId());
		System.out.println("Start Date: " + course.getCourseStartDate());
		System.out.println("Instructor: " + course.getInstructor().getName() + " " + course.getInstructor().getSurname());
		System.out.println("Price: " + course.getPrice());
		System.out.println("Course Period: " + course.getCoursePeriod());
		System.out.println();

	}
	
}

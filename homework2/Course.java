package hw2;

public class Course {
	
	private int courseId;
	private String courseName;
	private String lecturer;
	private String courseStartDate;
	private String coursePeriod;
	private int price;
	
	
	// constructor
	public Course(int courseId, String courseName, String lecturer, String courseDate, String coursePeriod, int price) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.lecturer = lecturer;
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
	
	public String getLecturer() {
		return lecturer;
	}
	
	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}
	
	public String getCourseDate() {
		return courseStartDate;
	}
	
	public void setCourseDate(String courseDate) {
		this.courseStartDate = courseDate;
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
	
	
}

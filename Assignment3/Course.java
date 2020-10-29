class Course
{
	String courseName;
	String college;
	String year;
	public Course(String courseName,String college,String year) {
		this.courseName=courseName;
		this.college=college;
		this.year=year;
	}
	public String getCname() {
		return courseName;
	}
	public String getCollege() {
		return college;
	}
	public String getYear() {
		return year;
	}	
	public void setCname(String courseName) {
		this.courseName=courseName;
	}
	public void setCollege(String college) {
		this.college=college;
	}
	public void setYear(String year) {
		this.year=year;
	}
	public void show() {
		System.out.println("Course Name: "+courseName);
		System.out.println("College: "+college);
		System.out.println("Year of Study: "+year);
	}
}
    
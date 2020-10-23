package Assignment3;

public class Student {
    private String studentName;
    private double mathMarks;
    private double scienceMarks;
    private double socialStudiesMarks;

    public Student(String studentName, double mathMarks, double scienceMarks,double socialStudiesMarks) {
        this.studentName = studentName;
        this.mathMarks = mathMarks<0?0:mathMarks;
        this.scienceMarks = scienceMarks<0?0:scienceMarks;
        this.socialStudiesMarks = socialStudiesMarks<0?0:socialStudiesMarks;    
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setMathMarks(double mathMarks) {
        this.mathMarks = mathMarks<0?0:mathMarks;
    }
    public void setScienceMarks(double scienceMarks) {
        this.scienceMarks = scienceMarks<0?0:scienceMarks;
    }
    public void setSocialStudiesMarks(double socialStudiesMarks) {
        this.socialStudiesMarks = socialStudiesMarks<0?0:socialStudiesMarks;
    }
    public String getStudenName() {
        return this.studentName;
    }
    public double getMathMarks() {
        return this.mathMarks;
    }
    public double getScienceMarks() {
        return this.scienceMarks;
    }
    public double getSocialStudiesMarks() {
        return this.socialStudiesMarks;
    }
    public double percentage() {
        return (this.mathMarks+this.scienceMarks+this.socialStudiesMarks)/3;
    }
    public void DisplayStudentname() {
        System.out.println("Student Name: "+this.studentName);
    }
}

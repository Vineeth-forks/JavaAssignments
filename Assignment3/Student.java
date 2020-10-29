public class Student extends Course {
    private String studentName;
    private double mathMarks;
    private double scienceMarks;
    private double socialStudiesMarks;
    private int regNo;
    public Student(String studentName, double mathMarks, double scienceMarks,double socialStudiesMarks,String courseName,String collegeName,String year, int regNo) {
        super(courseName,collegeName,year);
        this.studentName = studentName;
        this.mathMarks = mathMarks<0?0:mathMarks;
        this.scienceMarks = scienceMarks<0?0:scienceMarks;
        this.socialStudiesMarks = socialStudiesMarks<0?0:socialStudiesMarks;
        this.regNo = regNo;    
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
    public void setRegNo(int regNo){
        this.regNo = regNo;
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
    public int getRegNo(){
        return this.regNo;
    }
    public double percentage() {
        return (this.mathMarks+this.scienceMarks+this.socialStudiesMarks)/3;
    }
    public void DisplayStudentname() {
        System.out.println("Student Name: "+this.studentName);
    }
    public double cgpa(){
        int mathGrade = 0;
        int scienceGrade = 0;
        int socialGrade = 0;
        if(this.mathMarks>=90)
            mathGrade = 9;
        else if(this.mathMarks>=80)
            mathGrade = 8;
        else if(this.mathMarks>=70)
            mathGrade = 7;
        else if(this.mathMarks>=60)
            mathGrade = 6;
        else if(this.mathMarks>=50)
            mathGrade = 5;
        else
            mathGrade = 4;
        if(this.socialStudiesMarks>=90)
            socialGrade = 9;
        else if(this.socialStudiesMarks>=80)
            socialGrade = 8;
        else if(this.socialStudiesMarks>=70)
            socialGrade = 7;
        else if(this.socialStudiesMarks>=60)
            socialGrade = 6;
        else if(this.socialStudiesMarks>=50)
            socialGrade = 5;
        else
            socialGrade = 4;
        if(this.scienceMarks>=90)
            scienceGrade = 9;
        else if(this.scienceMarks>=80)
            scienceGrade = 8;
        else if(this.scienceMarks>=70)
            scienceGrade = 7;
        else if(this.scienceMarks>=60)
            scienceGrade = 6;
        else if(this.scienceMarks>=50)
            scienceGrade = 5;
        else
            scienceGrade = 4;
        return (double)((mathGrade+scienceGrade+socialGrade)/3);
        
    }
}

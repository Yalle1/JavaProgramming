package week5.day30_Inheritence.TypesOfInheritence;

import java.time.LocalDate;
public class Student extends Person{

    private char grade;
    private String studentID;

    public Student(String name, char gender, LocalDate dateOfBirth, char grade, String studentID) {
        super(name, gender, dateOfBirth);
        setGrade(grade);
        setStudentID(studentID);
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }



}

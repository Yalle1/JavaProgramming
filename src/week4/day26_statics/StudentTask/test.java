package week4.day26_statics.StudentTask;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {

        Student student1 = new Student("George","1A1",18,'M');
        Student student2 = new Student("Peter","1A2",18,'M');
        Student student3 = new Student("Miskinaget","1A3",18,'M');
        Student student4 = new Student("Johnsonella","1A4",17,'F');

        StudentGroup group1 = new StudentGroup("Rottenfield","1A");

        Student[] students = {student1,student2,student3,student4};
        System.out.println(Arrays.toString(students));


    }
}

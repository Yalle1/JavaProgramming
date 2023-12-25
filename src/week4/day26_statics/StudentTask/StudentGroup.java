package week4.day26_statics.StudentTask;

import week4.day26_statics.StudentTask.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentGroup {

    public String groupName, groupId;
    public ArrayList<Student> students;

    public StudentGroup(String groupName, String groupId) {  //creates the studentGroup object bt setting the groupName and groupId
        this.groupName = groupName;
        this.groupId = groupId;
        students = new ArrayList<Student>();
    }

    public void addStudent(Student student){
        students.add(student);
    }//takes one student object and adds it to the arraylist of students.

    public void removeStudent(String id){
        students.removeIf(p -> p.id.equals(id));
    } // takes the id of a student and then removes the student object with the specified id from the arraylist of students

    public void addStudent(Student[] students){
        this.students.addAll(Arrays.asList(students));
    } //takes one array of students and adds the array to the arraylist



    public String toString() {
        return "StudentGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId='" + groupId + '\'' +
                ", students=" + students +
                '}';
    }
}

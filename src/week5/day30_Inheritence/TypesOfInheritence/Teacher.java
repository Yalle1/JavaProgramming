package week5.day30_Inheritence.TypesOfInheritence;

import java.time.LocalDate;

public class Teacher extends Employee {

    public Teacher(String name, char gender, LocalDate dateOfBirth, String jobTitle, String employeeID, double salary) {
        super(name, gender, dateOfBirth, jobTitle, employeeID, salary);
    }

    public void teach(){
        System.out.println(getName()+" is teaching");
    }

}

package week4.day25_constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee2 {


    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public LocalDate hireDate;

    public Employee2(String name, int age, char gender, String jobTitle, double salary, LocalDate hireDate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hireDate = hireDate;
    } // allows us to set all the instance variables of the object as soon as it is created.

    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", hireDate=" + hireDate.format(DateTimeFormatter.ofPattern("MMMM/d/y")) +
                '}';
    }
}

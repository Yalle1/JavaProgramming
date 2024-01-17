package week5.day33_abstraction.EmployeeTask;

import week1.day03_variables.PrimitiveDataTypesIntro;

public abstract class Employee {

    private String name, jobTitle, id;
    private int age;
    private char gender;
    private double salary;

    public Employee(String name, int age, char gender, String id, String jobTitle, double salary) {
        setName(name);
        setJobTitle(jobTitle);
        setId(id);
        setAge(age);
        setGender(gender);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id='" + id + '\'' +
                ", age='" + age + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }

    public abstract void work();

}

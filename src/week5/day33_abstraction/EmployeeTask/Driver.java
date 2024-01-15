package week5.day33_abstraction.EmployeeTask;

public class Driver extends Employee{
    public Driver(String name, String jobTitle, String id, String age, char gender, double salary) {
        super(name, jobTitle, id, age, gender, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is driving");
    }
}

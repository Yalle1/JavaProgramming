package week4.day28_encapsulation.Encapsulation;

public class Employee {

   private double salary;
   private String name;





    public Employee(double salary, String name) {
        setName(name);
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.err.println("Salary cannot be negative");
            System.exit(1);
        }
    }

    public String getName() {
        if (name == null || name.isBlank()){
            System.err.println("Name can not be empty or black");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

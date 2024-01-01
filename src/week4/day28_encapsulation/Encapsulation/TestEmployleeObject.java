package week4.day28_encapsulation.Encapsulation;

public class TestEmployleeObject {

    public static void main(String[] args) {

        Employee employee = new Employee(11,"Josh");
         

        employee.setSalary(11);

        System.out.println(employee.getSalary());


    }
}

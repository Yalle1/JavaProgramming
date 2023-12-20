package day10_string;

import java.util.Scanner;

public class EmployeeInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.print("Enter your age: ");
        byte age = input.nextByte();

        input.nextLine();

        System.out.print("Enter your gender: ");
        String gender = input.nextLine();

        System.out.print("Enter your company name: ");
        String companyName = input.nextLine();

        System.out.print("Enter your job title: ");
        String jobTitle = input.nextLine();

        System.out.print("Enter your salary: ");
        int salary = input.nextInt();

        // String employeeInfo = fullName + "\n" + age + "\n" + gender + "\n" + companyName + "\n" + jobTitle + "\n" + salary;

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("companyName = " + companyName);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("salary = $" + salary);

        input.close();

    }
}

package day05_operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        int a = 20;

        System.out.println(a); // 20

        a = 40;
        System.out.println(a); // 40

        System.out.println("-------------------------------------");

        int balance = 100;

        balance += 1000; // balance = 100 + 1000 = 1100

        System.out.println("Balance = $" + balance); // 1100
        
        balance += 500;

        System.out.println("balance = $" + balance);
        
        balance -= 1000;

        System.out.println("balance = $" + balance);

        System.out.println("-------------------------------------");

        int salary = 45000;
        
        salary *= 2; // salary * 2

        System.out.println("salary = $" + salary);
        
        salary *= 3; // salary * 3

        System.out.println("salary = $" + salary);

        System.out.println("-------------------------------------");
        
        int eth = 4;
        
        eth *= 250;

        System.out.println("eth = $" + eth);

        eth /= 2;

        System.out.println("eth = $" + eth);

        System.out.println("-------------------------------------");

        System.out.println("salary = $" + salary);

        salary /= 2;

        System.out.println("salary = $" + salary);

        System.out.println("-------------------------------------");

        int remainder = 39;
        remainder %= 7; // remainder = 39 % 7

        System.out.println("remainder = " + remainder);

    }
}

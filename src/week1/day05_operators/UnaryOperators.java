package week1.day05_operators;

public class UnaryOperators {

    public static void main(String[] args) {

        // pre increment/decrement

        int x = 10;

        System.out.println(++x);
        System.out.println(x);

        System.out.println("--------");

        int y = 100;

        System.out.println(--y);
        System.out.println(y);

        System.out.println("----------------------------------");

        // post increment/decrement

        int a = 50;
        System.out.println("a before post increment " + a++); // 50
        System.out.println("a after post increment: " + a); // 51

        System.out.println("--------");

        int b = 30;
        System.out.println("b before post decrement: " + b--); // 30
        System.out.println("b after post decrement: " + b);    // 29

        System.out.println("----------------------------------");

        int n = 60;
        int m = n++;

        System.out.println(n); // 60
        System.out.println(m); // 60
        System.out.println(m); // 61

        System.out.println("--------");

        int t = 20;
        int u = t--;

        System.out.println(t); // 20
        System.out.println(u); // 20
        System.out.println(u); // 19

    }
}

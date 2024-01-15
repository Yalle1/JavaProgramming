package week5.day33_abstraction.CalculationTask;

public class Test {



    public static void main(String[] args) {

        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();

        int sum = addition.calculate(1,2);
        int sum2 = subtraction.calculate(1,2);
        int sum3 = multiplication.calculate(1,2);

        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);

    }
}

package day07_ifStatements;

public class NetIncomeCalc {
    public static void main(String[] args) {

        double salaryBeforeTax = 200000;

        System.out.println("salaryBeforeTax = $" + Math.round(salaryBeforeTax));
        boolean isMarried = true;


        double taxRate = 0;

        if (salaryBeforeTax >= 130000) {
            taxRate = 0.35;

        } else if (salaryBeforeTax >= 100000 && salaryBeforeTax <= 129000) {
            taxRate = 0.30;
        } else if (salaryBeforeTax >= 80000 && salaryBeforeTax <= 99000) {
            taxRate = 0.25;
        } else if (salaryBeforeTax <= 79000) {
            taxRate = 0.20;
        } else {
            System.err.println("Invalid Input");
        }

        if (isMarried) {
            taxRate -= 0.05;
        }


        double tax = salaryBeforeTax * taxRate;
        double salaryAfterTax = salaryBeforeTax - tax;
        System.out.println("Salary after tax = $" + Math.round(salaryAfterTax));


    }
}

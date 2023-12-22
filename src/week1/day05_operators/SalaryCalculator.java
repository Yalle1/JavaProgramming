package week1.day05_operators;

public class SalaryCalculator {

    public static void main(String[] args) {

        int     hourlyRate = 25,
                weeklyHours = 45;

        double  stateTaxRate = 0.06,
                federalTaxRate = 0.26;

        double  salaryBeforeTax = hourlyRate * weeklyHours * 52,
                stateTax = salaryBeforeTax * stateTaxRate,
                federalTax = salaryBeforeTax * federalTaxRate,
                totalTax = stateTax + federalTax,
                salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Hourly rate: $" + hourlyRate + "\n" + "Weekly hours: " + weeklyHours + "\n" + "State tax rate: " + stateTaxRate +
                           "\n" + "Federal tax rate: " + federalTaxRate);

        System.out.println("------------------------------------------");


        System.out.println("SalaryBeforeTax: $" + Math.round(salaryBeforeTax) + "\n" + "State tax: $" + Math.round(stateTax) + "\n" + "Federal tax: $" + Math.round(federalTax) +
                           "\n" + "Total tax: $" + Math.round(totalTax) + "\n" + "Salary after tax: $" + Math.round(salaryAfterTax));











    }
}

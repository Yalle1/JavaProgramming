package day12_customMethods;

import javax.crypto.spec.DESedeKeySpec;
import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No):");
        String split = input.next().toLowerCase().trim();

        System.out.println("Enter the number of people:");
        int people = input.nextInt();

        if (split.equals("yes") && people <= 1) {
            System.out.println("That is not possible!");
            System.exit(1);
        }

        System.out.println("Enter the check amount:");
        double check = input.nextDouble();

        input.nextLine();

        System.out.println("Service Quality: (Poor/Fair/Good/Great/Excellent)");
        String serviceQuality = input.nextLine().toLowerCase().trim();  // poor = 5%, fair = 10%, good = 15%, great = 20%, excellent = 25%


        double service = 0;


        switch (serviceQuality){
            case "poor":
                service = 0.05;
                break;
            case "fair":
                service = 0.10;
                break;
            case "good":
                service = 0.15;
                break;
            case "great":
                service = 0.20;
                break;
            case "excellent":
                service = 0.25;
                break;
            default:
                System.err.println("Invalid");
                System.exit(1);
        }
        
        double totalTip = check * service;
        double totalCost = check + totalTip;

        if (split.equals("yes") && people > 0) {
            System.out.println("Number of people: " + people);
            System.out.println("Total cost: $" + totalCost);
            totalCost /= people;
            System.out.println("Total cost per each person is: $" + totalCost + "\nTotal tip: $" + totalTip);
        } else if (split.equals("no") && people >= 1) {
            System.out.println("Number of people: " + people);
            System.out.println("Total cost for you is: $" + totalCost + "\nTotal tip: $" + totalTip);
        } else {
            System.err.println("Error!");
        }

        input.close();




    }
}

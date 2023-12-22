package week2.day10_string;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.print("Enter your building number: ");
        int buildingNumber = input.nextInt();

        input.nextLine();

        System.out.print("Enter your Street name: ");
        String streetName = input.nextLine();

        System.out.print("Enter your city name: ");
        String cityName = input.nextLine();

        System.out.print("Enter your zip code: ");
        int zipCode = input.nextInt();

        String shippingAddress = "Your shipping address is: \n\t" + fullName + "\n\t" + buildingNumber + " " + streetName + "\n\t" + cityName + " " + zipCode;

        System.out.println(shippingAddress);

        input.close();

    }
}

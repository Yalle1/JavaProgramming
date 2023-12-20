package day06_ifStatements;

public class OddOrEven {

    public static void main(String[] args) {

         int number = 8;


         boolean isEven = number % 2 == 0;      // When we divide a number by 2, if the remainder is 0, means it is an even number
         boolean isOdd = !isEven;               // When we divide a number by 2, if the remainder is not 0, means it is an odd number (shortened / opposite version)

        System.out.println(number + " is an even number: " + isEven);
        System.out.println(number + " is an odd number: " + isOdd);

    }
}

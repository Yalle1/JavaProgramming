package week2.day12_customMethods;

public class CustomMethodsTask2 {
    public static void main(String[] args) {

        maximumNumber(213,213);

    }
    public static void maximumNumber(int num1, int num2){
        if (num1 > num2) {
            System.out.println("First number is greater");
        } else if (num1 < num2) {
            System.out.println("Second number is greater");
        } else {
            System.out.println("Equal");
        }

    }

}

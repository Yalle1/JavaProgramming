package day11_string;

public class StringMethods3 {

    public static void main(String[] args) {

        String word = "Java";

        Boolean r1 = word.isEmpty();

        System.out.println(r1);

        System.out.println("-------------------------------------------------------------------");

        String str = "           ";
        Boolean r2 = str.isBlank();

        System.out.println(r2);

        System.out.println("-------------------------------------------------------------------");

        String str1 = "Cydeo";
        String str2 = new String("Cydeo");

        System.out.println(str2 == str1);

        System.out.println(str2.equals(str1));
    }
}

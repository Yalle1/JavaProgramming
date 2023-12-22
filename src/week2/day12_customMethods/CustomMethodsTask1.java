package week2.day12_customMethods;

public class CustomMethodsTask1 {

    public static void main(String[] args) {

        initials("Ensar","Yalap");

    }

    public static void initials(String firstName, String lastName){

        String initials = firstName.charAt(0) + "." + lastName.charAt(0);
        System.out.println(initials);

    }
}

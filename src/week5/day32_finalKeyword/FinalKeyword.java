package week5.day32_finalKeyword;

public class FinalKeyword {

    public static void main(String[] args) {

        final char gender = 'M';

        System.out.println(gender); // M

        // gender = 'F'; ====> Compile error because of final keyword which makes the variable unchangeable

        System.out.println(gender); // F

    }
}

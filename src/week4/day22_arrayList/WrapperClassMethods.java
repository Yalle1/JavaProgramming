package week4.day22_arrayList;

public class WrapperClassMethods {

    public static void main(String[] args) {



        String str = "10";

        int num1 = Integer.parseInt(str);

        System.out.println(num1 + 1 );

        Integer num2 = Integer.valueOf(str);

        System.out.println(num2);

        System.out.println("-------------------------------------");

        String s = "20.5";

        double s2 = Double.parseDouble(s);

        Double s3 = Double.valueOf(s);

        System.out.println(s3);

        System.out.println("-------------------------------------");

        String x = "true";

        Boolean x1 = Boolean.valueOf(x);

        System.out.println(x1);

        System.out.println("-------------------------------------");

        char ch = '=';

        boolean isLowerCaseLetter = Character.isLowerCase(ch),
                isUpperCaseLetter = Character.isUpperCase(ch),
                isDigit = Character.isDigit(ch),
                isLetter = Character.isLetter(ch),
                isSpecialCharacter = !Character.isLetterOrDigit(ch);

        System.out.println(ch);
        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter);
        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);
        System.out.println("isDigit = " + isDigit);
        System.out.println("isLetter = " + isLetter);
        System.out.println("isSpecialCharacter = " + isSpecialCharacter);

        System.out.println("-------------------------------------");

        String string = "a1b2c3d4e5";



        int sum = 0;

        for (char each : string.toCharArray()) {
            if (Character.isDigit(each)){
                sum += Integer.parseInt(""+each);

            }
        }

        System.out.println("sum = " + sum);

        System.out.println("-------------------------------------");







    }
}

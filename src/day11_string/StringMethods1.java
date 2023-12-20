package day11_string;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "Java Programming";

        str1 = str1.toLowerCase();

        System.out.println(str1);

        //----------------------------------------------

        String str2 = "Java Programming";

        str2 = str2.toUpperCase();

        System.out.println(str2);

        //----------------------------------------------

        String word = "Wooden Spoon";

        word.toUpperCase();

        //----------------------------------------------

        String sentence1 = "Today is the day which I would call wednesday";

        int senten = sentence1.indexOf("sday");

        System.out.println(senten);

        //----------------------------------------------

        String w = "Java";

        int b = w.indexOf('J');

        System.out.println(b);

        //----------------------------------------------

        String w2 = "Java Python JavaScript Cydeo Python";

        int w3 = w2.indexOf("aSc");
        System.out.println(w3);

    }
}

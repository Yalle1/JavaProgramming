package week2.day11_string;

public class StringMethods2 {

    public static void main(String[] args) {

         String sentence = "I love Python, Python is the best programming language so I will use Python ";

         sentence = sentence.replace("Python", "Java");

        System.out.println(sentence);

        System.out.println("-------------------------------------------------------------------");

        String sentence2 = "I love Python, Python is the best programming language so I will use Python";

        sentence2 = sentence2.replace(", Python", ", Java");

        System.out.println(sentence2);

        System.out.println("-------------------------------------------------------------------");

        String str = "I Love Cydeo School";

        str = str.substring(7,12);

        System.out.println(str);

        System.out.println("-------------------------------------------------------------------");

        String sentence5 = "Today is Sunday, Tomorrow is Monday";

        sentence5 = sentence5.substring(9, 15);

        System.out.println(sentence5);

        System.out.println("-------------------------------------------------------------------");

        String email = "ensaryalap1@outlook.com";

        int beginning = email.indexOf('@') + 1;
        int ending = email.lastIndexOf('.');
        String mail =  email.substring(beginning, ending);
        System.out.println(mail);

        System.out.println("-------------------------------------------------------------------");

        String sentence6 = "I Love Java programming";
        sentence6 = sentence6.substring(7);

        System.out.println(sentence6);

        System.out.println("-------------------------------------------------------------------");

        String sentence7 = "Today is Sunday, Tomorrow is Monday";

        String tomorrow = sentence7.substring(sentence7.lastIndexOf(' ') + 1);
        System.out.println(tomorrow);

        System.out.println("-------------------------------------------------------------------");

        String sentence8 = "I study at Cydeo School";

        sentence8 = sentence8.substring(sentence8.lastIndexOf('C'), sentence8.lastIndexOf(' ') + 1);

        System.out.println(sentence8);

        System.out.println("-------------------------------------------------------------------");

        String str1 = "Python";
        String result = (str1+"\n").repeat(10);
        System.out.println(result);

    }
}

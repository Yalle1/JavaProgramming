package day02_escapeSequences;

public class EscapeSequences {
    public static void main(String[] args) {

        System.out.println("Hello students\nToday we have a Java class");          // the \n breaks the text and continues it on the next line

        System.out.println("------------------------------------------");

        System.out.println("\tJava programming language");                         // horizontal tab aka paragraph space
        System.out.println("\t\tJava developer course batch 1");

        System.out.println("\\");                       // causes a backslash to be printed

        System.out.println("My favorite TV show is \"The Walking dead\"");      // You are able to include double quotes by using backslash before using the double quote
    }
}


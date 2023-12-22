package week3.day17_customClass;

public class UniqueCharacters2 {

    public static void main(String[] args) {

        String str = "aabcccd";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                unique += ch;
            }
        }

        System.out.println(unique);

    }
}

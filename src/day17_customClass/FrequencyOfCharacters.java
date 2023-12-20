package day17_customClass;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aaabbbcccccd";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char letter = str.charAt(i);
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == letter){
                    frequency++;
                }
            }

            if (result.contains(""+letter)){
                continue;
            }

            result += (""+ letter) + frequency;

        }

        System.out.println(result);








    }
}

package day21_multiDimensionalArray;

public class WUT1 {

    public static void main(String[] args) {

        String sentence = "   Hello world               I      love           Java           ";

        String[] arr = sentence.split(" ");
        String newSentence = "";

        for (String each : arr) {
            if (!each.isEmpty()) {
                newSentence += each+" ";
            }
        }

        newSentence = newSentence.trim();

        System.out.println(newSentence);
    }
}

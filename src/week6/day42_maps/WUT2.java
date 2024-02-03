package week6.day42_maps;

import java.util.*;

public class WUT2 {

    public static void main(String[] args) {

        String str = "aaaaaaabcccdeeef";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (String s : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), s);

            if (frequency == 1){
                map.put(s.charAt(0),frequency);
            }
        }

        System.out.println(map);



    }
}

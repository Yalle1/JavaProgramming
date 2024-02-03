package week6.day42_maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;


public class WUT1 {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";

        Map <Character, Integer> map = new LinkedHashMap<>();

        String [] strArr = str.split("");

        for (String s : strArr) {
            int frequency = Collections.frequency(Arrays.asList(strArr), s);

            map.put(s.charAt(0), frequency);
        }

        System.out.println(map);


    }
}

package week4.day24_dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeIntro {

    public static void main(String[] args) {

        LocalTime starting_Time = LocalTime.of(10,30);
        LocalTime currentTime = LocalTime.now();

        System.out.println(starting_Time);
        System.out.println(currentTime);

        System.out.println("----------------------------------");




    }
}

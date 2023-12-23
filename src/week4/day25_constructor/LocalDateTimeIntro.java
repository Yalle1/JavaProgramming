package week4.day25_constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeIntro {

    public static void main(String[] args) {

        LocalDateTime starts = LocalDateTime.now();

        System.out.println("starts = " + starts);

        LocalDateTime ends = LocalDateTime.of(2024, 5,18,11,0);

        System.out.println("ends = " + ends);


    }
}

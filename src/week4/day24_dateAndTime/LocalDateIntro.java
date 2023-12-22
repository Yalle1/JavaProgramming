package week4.day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalDate birthDay = LocalDate.of(2000, 3, 27);

        System.out.println(birthDay);



    }
}

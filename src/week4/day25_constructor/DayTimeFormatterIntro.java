package week4.day25_constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DayTimeFormatterIntro {

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM-dd-y (EEEE)");

        LocalDate today = LocalDate.now();

        System.out.println("today = " + today.format(df));

        System.out.println("------------------------------------------");
        
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("H:mm");
        
        LocalTime time = LocalTime.now();

        System.out.println("time = " + time.format(tf));

        System.out.println("------------------------------------------");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM-dd-y (E) - H:mm");

        LocalDateTime dateAndTime = LocalDateTime.now();

        System.out.println("dateAndTime: " + dateAndTime.format(dtf));


    }
}

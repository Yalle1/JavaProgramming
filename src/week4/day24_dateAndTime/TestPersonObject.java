package week4.day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObject {

    public static void main(String[] args) {

        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};

        people[0].setInfo("Daniel",'M', LocalDate.of(1989, 2, 25));
        people[1].setInfo("Daniella",'F', LocalDate.of(1933, 10, 5));
        people[2].setInfo("Osama",'M', LocalDate.of(1929, 3, 7));
        people[3].setInfo("George",'M', LocalDate.of(2000, 11, 1));
        people[4].setInfo("Miskinagella",'F', LocalDate.of(2020, 2, 20));

        ArrayList<Person> people1 = new ArrayList<>();

        people1.addAll(Arrays.asList(people));

        for (Person person : people1) {
            System.out.println(person.name + ": " + person.birthDay);
        }

        System.out.println("--------------------------------------------------");

        for (Person person : people1) {
            if (person.age > 55){
                continue;
            }
            System.out.println(person.name + " is younger than 55");
        }


    }
}

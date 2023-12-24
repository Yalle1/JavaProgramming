package week4.day25_constructor;

import java.time.LocalDate;

public class testEmployee2Objects {

    public static void main(String[] args) {

        Employee2 emp1 = new Employee2("George",60,'M',"Bedrotter",0, LocalDate.now());

        Employee2 emp2 = new Employee2("Peter",50,'M',"Meloneater",500,LocalDate.now());

        System.out.println(emp1);

        System.out.println(emp2);

    }
}

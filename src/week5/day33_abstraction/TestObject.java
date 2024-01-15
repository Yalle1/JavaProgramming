package week5.day33_abstraction;

import java.time.LocalDate;

public class TestObject {

    public static void main(String[] args) {

        CydeoDevStudents cydeoDevStudents = new CydeoDevStudents("Jafar",'M', LocalDate.of(2005,1,19),"123","Alumni Dev",1);



        System.out.println(cydeoDevStudents);

    }
}

package week4.day24_dateAndTime;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate birthDay;

    public void setInfo(String name, char gender, LocalDate birthDay) {
        this.name = name;
        this.gender = gender;
        this.birthDay = birthDay;
        age = LocalDate.now().getYear() - birthDay.getYear();
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", birthDay=" + birthDay +
                '}';

    }
}

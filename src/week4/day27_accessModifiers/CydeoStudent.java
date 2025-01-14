package week4.day27_accessModifiers;

import week4.day24_dateAndTime.Person;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;

    public static String schoolName;
    public static String secretCode;

    static {
        schoolName = "Cydeo School";
        secretCode = "Wooden Spoon";
    }


    public CydeoStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

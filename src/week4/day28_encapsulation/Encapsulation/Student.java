package week4.day28_encapsulation.Encapsulation;

import java.util.List;

public class Student {

    private int age;
    private String name;



    public void setAge(int age){

        if (age > 1){
        this.age = age;}
        else {
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }
    }
    public int getAge(){
        if (age == 0){
            System.err.println("Age has not been set");
            System.exit(1);
        }
        return age;
    }


    public String getName() {
        if (name == null){
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {

        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)){
                System.err.println("Contains digits");
                System.exit(1);
            }
        }
        this.name = name;
    }


}

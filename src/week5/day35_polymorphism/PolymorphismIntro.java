package week5.day35_polymorphism;

import week5.day29_inheritence.AnimalTask.Tiger;
import week5.day31_inheritance.Animal_methodOverriding.Animal;
import week5.day31_inheritance.Animal_methodOverriding.Cat;
import week5.day31_inheritance.Animal_methodOverriding.Dog;
import week5.day31_inheritance.Animal_methodOverriding.Test;
import week5.day33_abstraction.ShapeTask.Circle;
import week5.day34_abstraction.CarTask.Car;
import week5.day34_abstraction.CarTask.Tesla;


import java.util.Arrays;
import java.util.Objects;

public class PolymorphismIntro {

    public static void main(String[] args) {

        Dog dog = new Dog("Max","Husky","Large","White",'M',4);
        Cat cat = new Cat("Bax","Busky","Medium","Black",'F',2);

        Animal[] animals = {dog, cat};

        System.out.println(Arrays.toString(animals));

        System.out.println("--------------------------------------------");

        String str = "Java";

        Integer n = 100;

        Boolean r = false;

        Double d = 10.5;

        Circle circle = new Circle(5);

        Object[] objects = {str,n,r,d,circle};

        System.out.println(Arrays.toString(objects));

        System.out.println("--------------------------------------------");



    }
}

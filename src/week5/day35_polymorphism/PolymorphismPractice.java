package week5.day35_polymorphism;

import week1.day01_introToProgramming.HelloCydeo;
import week4.day27_accessModifiers.Car;
import week5.day34_abstraction.AnimalTask.Animal;
import week5.day34_abstraction.AnimalTask.Hunter;
import week5.day34_abstraction.AnimalTask.Tiger;

public class PolymorphismPractice {

    public static void main(String[] args) {

        Tiger tiger = new Tiger("Cevdet",5,'L');

        tiger.hunt();

        boolean isAnimal = tiger instanceof Hunter;

        System.out.println(isAnimal);



    }
}

package week6.day36_polymorphism;

import week5.day29_inheritence.AnimalTask.Dog;
import week5.day30_Inheritence.PhoneTask.Iphone;
import week5.day30_Inheritence.PhoneTask.Phone;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        Phone phone = new Iphone("Apple","Large","Black",3000); // implicit upcasting

        // Iphone iphone = (Iphone) phone; // explicit down-casting

        ((Iphone) phone).faceTime(12345); // down-casting

    }
}

//
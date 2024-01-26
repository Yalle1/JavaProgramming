package week6.day37_exceptions;

import week5.day34_abstraction.AnimalTask.Animal;
import week5.day34_abstraction.AnimalTask.Cat;

import java.util.ArrayList;

public class ErrorExample {
    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<>();

        byte i =  0;
        while (true) {
            System.out.println(i++);
            pizzas.add(new Pizza('s', 3, 4));
            pizzas.add(new Pizza('s', 3, 4));
            pizzas.add(new Pizza('s', 3, 4));
            pizzas.add(new Pizza('s', 3, 4));
            pizzas.add(new Pizza('s', 3, 4));
            pizzas.add(new Pizza('s', 3, 4));
            pizzas.add(new Pizza('s', 3, 4));
            pizzas.add(new Pizza('s', 3, 4));
            pizzas.add(new Pizza('s', 3, 4));
        }

        // will result in OutOfMemoryError and is not exception and can not be handled

    }
}

package week6.day38_exceptions.ShapeTask;

import week6.day38_exceptions.Person;

public class TestShapeObject {

    public static void main(String[] args) {

        Square square1 = new Square(2);
        Square square2 = new Square(2);

        System.out.println(square1);
        System.out.println(square1.equals(square2));


    }
}

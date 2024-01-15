package week5.day33_abstraction.ShapeTask;

public class TestShape {

    public static void main(String[] args) {

        Circle circle = new Circle(5);

        System.out.println(circle.area());

        System.out.println(circle.perimeter());

        circle.draw();


    }
}

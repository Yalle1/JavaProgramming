package week5.day33_abstraction.ShapeTask;

public final class Circle extends Shape {

    private double radius;

    private static final double pi = 3.14;

    public Circle(double radius) {
        setName(getClass().getSimpleName());
        setRadius(radius);
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi * getRadius() * getRadius();
    }

    @Override
    public double perimeter() {
        return (getRadius() * 2) * pi;
    }

    @Override
    public void draw() {
        System.out.println("Drawing "+ getClass().getSimpleName());
    }


}

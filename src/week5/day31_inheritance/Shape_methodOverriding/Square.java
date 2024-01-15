package week5.day31_inheritance.Shape_methodOverriding;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return getSide()*getSide();
    }

    @Override
    public String toString() {
        return super.toString().replace("}","")+"{" +
                "area='" + area() + '\'' +
                '}';
    }
}

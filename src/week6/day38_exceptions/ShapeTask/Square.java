package week6.day38_exceptions.ShapeTask;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
      if (side<0){
          throw new InvalidShapeException("Square side can not be zero or negative!");
      }
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "area=" + area() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Square)){
            System.err.println(obj.getClass().getSimpleName()+" is not an instance of "+getClass().getSimpleName());
            return false;
        }
        if (side == ((Square) obj).side){
            return true;
        } else return false;
    }
}

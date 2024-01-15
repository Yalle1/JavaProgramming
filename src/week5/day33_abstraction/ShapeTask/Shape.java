package week5.day33_abstraction.ShapeTask;

public abstract class Shape {

    private String name;

    public Shape() {
        setName(getClass().getSimpleName());
    }

    public abstract double area();
    public abstract double perimeter();
    public abstract void draw();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}



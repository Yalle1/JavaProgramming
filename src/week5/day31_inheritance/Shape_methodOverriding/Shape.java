package week5.day31_inheritance.Shape_methodOverriding;

public class Shape {

    private String name;

    public Shape(){
        setName(getClass().getSimpleName());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double area(){
        return 0;
    }


    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                '}';
    }
}

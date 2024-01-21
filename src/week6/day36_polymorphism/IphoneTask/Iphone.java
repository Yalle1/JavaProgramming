package week6.day36_polymorphism.IphoneTask;

public final class Iphone {

    private String model, color;

    public Iphone(String model, String color) {
        setModel(model);
        setColor(color);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Iphone)){
            System.err.println("Invalid object!");
            System.exit(1);
        }

        if (model.equalsIgnoreCase(((Iphone) obj).model)){
            if (color.equalsIgnoreCase( (    (Iphone)obj ).color   )   ){
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

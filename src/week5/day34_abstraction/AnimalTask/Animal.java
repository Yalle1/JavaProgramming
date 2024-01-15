package week5.day34_abstraction.AnimalTask;

public abstract class Animal {

    private final String name;
    private int age;
    private char size;

    public Animal(String name, int age, char size) {
        this.name = name;
        setAge(age);
        setSize(size);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", size=" + size +
                '}';
    }


}

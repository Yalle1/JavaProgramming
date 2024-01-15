package week5.day34_abstraction.AnimalTask;

public final class Dog extends Animal implements Play {

    public Dog(String name, int age, char size) {
        super(name, age, size);
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing with " + getClass().getSimpleName().toLowerCase()+" toys");
    }
}

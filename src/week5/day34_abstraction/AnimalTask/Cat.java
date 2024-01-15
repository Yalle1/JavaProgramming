package week5.day34_abstraction.AnimalTask;

public final class Cat extends Animal implements Play, Hunter {

    public Cat(String name, int age, char size) {
        super(name, age, size);
    }


    @Override
    public void play() {
        System.out.println(getName()+" is playing with " + getClass().getSimpleName().toLowerCase()+" toys");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting for mice!");
    }

    @Override
    public boolean isNocturnalHunter() {
        return true;
    }
}

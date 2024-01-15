package week5.day34_abstraction.AnimalTask;

public final class Lion extends Animal implements Hunter{
    public Lion(String name, int age, char size) {
        super(name, age, size);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting");
    }

    @Override
    public boolean isNocturnalHunter() {
        return false;
    }
}

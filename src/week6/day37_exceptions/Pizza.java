package week6.day37_exceptions;

public final class Pizza {

    private final char size;
    private int numberOfCheeseToppings, numberOfPepperoniToppings;

    public Pizza(char size, int numberOfCheeseToppings, int numberOfPepperoniToppings) {
        this.size = size;
        setNumberOfCheeseToppings(numberOfCheeseToppings);
        setNumberOfPepperoniToppings(numberOfPepperoniToppings);
    }

    public char getSize() {
        return size;
    }

    public int getNumberOfCheeseToppings() {
        return numberOfCheeseToppings;
    }

    private void setNumberOfCheeseToppings(int numberOfCheeseToppings) {
        this.numberOfCheeseToppings = numberOfCheeseToppings;
    }

    public int getNumberOfPepperoniToppings() {
        return numberOfPepperoniToppings;
    }

    private void setNumberOfPepperoniToppings(int numberOfPepperoniToppings) {
        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", numberOfPepperoniToppings=" + numberOfPepperoniToppings +
                '}';
    }

    public double calcCost(){
        double cost = 0;
        switch (Character.toLowerCase(size)){
            case 's':
                cost = 10;
                break;
            case 'm':
                cost = 12;
                break;
            case 'l':
                cost = 14;
                break;
            default:
                System.exit(1);
        }

         return cost += (numberOfPepperoniToppings + numberOfCheeseToppings) * 2;

    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pizza)){
            System.err.println("Invalid Object!");
            System.exit(1);
        }
        return size == ((Pizza) obj).size && numberOfCheeseToppings == ((Pizza) obj).numberOfCheeseToppings && numberOfPepperoniToppings == ((Pizza) obj).numberOfPepperoniToppings;
    }
}

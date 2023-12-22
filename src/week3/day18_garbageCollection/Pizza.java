package week3.day18_garbageCollection;

public class Pizza {

    public char size;
    public int numberOfCheeseToppings;
    public int numberOfPepperoniToppings;


    // calculates total price of pizza and returns it as a double
    public double price(){

        double totalPrice = 0;

        switch (Character.toUpperCase(size)){
            case 'S':
                if (numberOfPepperoniToppings > -1 && numberOfCheeseToppings > -1){
                totalPrice = 10 + 2 *(numberOfCheeseToppings + numberOfPepperoniToppings);
                } else {
                    System.err.println("Invalid toppings amount!");
                    break;}
                break;

            case 'M':
                if (numberOfPepperoniToppings > -1 && numberOfCheeseToppings > -1) {
                    totalPrice = 12 + 2 * (numberOfCheeseToppings + numberOfPepperoniToppings);
                } else {
                    System.err.println("Invalid toppings amount!");
                    break;}
                break;

            case 'L':
                if (numberOfPepperoniToppings > -1 && numberOfCheeseToppings > -1) {
                    totalPrice = 14 + 2 *(numberOfCheeseToppings + numberOfPepperoniToppings);
                } else {
                    System.err.println("Invalid toppings amount!");
                    break;}
                break;
            default:
                System.err.println("Invalid Size!");
        }
        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", numberOfPepperoniToppings=" + numberOfPepperoniToppings +
                ", total price" + price() +
                '}';
    }
    public void setInfo(char size, int numberOfCheeseToppings, int numberOfPepperoniToppings) {
        this.size = size;
        this.numberOfCheeseToppings = numberOfCheeseToppings;
        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }
}


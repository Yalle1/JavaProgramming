package day08_ternaries_switch;

public class Elevator {

    public static void main(String[] args) {

        int floorNumber = 4;
        String floor = "";
        String companies = "";

        if (floorNumber > 0 && floorNumber <= 3) {
            if (floorNumber == 1) {
                floor = "Floor 1 selected";
                companies = "Lobby, Verizon, Starbucks";

            } else if (floorNumber == 2) {
                floor = "Floor 2 selected";
                companies = "Cydeo, NASA, Intelsat";

            } else if (floorNumber == 3) {
                floor = "Floor 3 selected";
                companies = "Lyft, BofA, Stake house";
            }
        } else {
            floor = "Invalid floor";
            companies = "None";
        }

        System.out.println(floor + ". Companies: " + companies);

        System.out.println("-------------------------------------------------------------------");

        int floorNumber2 = 4;
        String result = "invalid floor";

        if (floorNumber2 > 0 && floorNumber2 <= 3) {

            result = "Floor " + floorNumber2 + " is selected. Companies: ";

            if (floorNumber2 == 1) {
                result += "Lobby, Verizon, Starbucks";
            } else if (floorNumber2 == 2) {
                result += "Cydeo, NASA, Intelsat";
            } else if (floorNumber2 == 3) {
                result +=  "Lyft, BofA, Stake house";
            }
        }
        System.out.println(result);



    }



}

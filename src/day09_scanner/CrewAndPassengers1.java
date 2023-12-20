package day09_scanner;

public class CrewAndPassengers1 {

    public static void main(String[] args) {

        int numberOfPeople = 100;


        String result = (numberOfPeople == 50 || numberOfPeople == 75 || numberOfPeople == 100) ?

                        (numberOfPeople == 50) ? "20 crew, 30 passengers" :
                        (numberOfPeople == 75) ? "25 crew, 50 passengers" :
                        "30 crew, 70 passengers"
                :
                "Invalid";

        System.out.println("result = " + result);





        System.out.println("----------------------------------------------------");
        
        int numberOfPeople2 = 100;
        String result2 = "";
        
        switch (numberOfPeople2) {
            
            case 50:
                result2 = "20 crew, 30 passengers";
                break;
                
            case 75:
                result2 = "25 crew, 50 passengers";
                break;
                
            case 100:
                result2 = "30 crew, 70 passengers";
                break;

                
            default:
                result2 = "Invalid Input";
        }

        System.out.println("result2 = " + result2);
        
    }
}

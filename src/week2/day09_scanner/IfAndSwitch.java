package week2.day09_scanner;

public class IfAndSwitch {

    public static void main(String[] args) {

        int number = 101;
        String result = "";

        if (number == 50 || number == 75 || number == 100) {

            switch (number){
                case 50:
                    result = "20 crew, 30 passengers";
                    break;
                case 75:
                    result = "25 crew, 50 passengers";
                    break;
                case 100:
                    result = "30 crew, 70 passengers";
            }

            System.out.println("result = " + result);

        } else {
            System.err.println("Invalid Number");
        }



    }
}

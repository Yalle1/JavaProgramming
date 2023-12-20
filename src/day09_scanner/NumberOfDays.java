package day09_scanner;

public class NumberOfDays {

    public static void main(String[] args) {

        int month = 12;
        String result = "";

        switch (month){

            case 1:
                result = "31 days";
                break;
            case 2:
                result = "28 days";
                break;
            case 3:
                result = "31 days";
                break;
            case 4:
                result = "30 days";
                break;
            case 5:
                result = "31 days";
                break;
            case 6:
                result = "30 days";
                break;
            case 7:
                result = "31 days";
                break;
            case 8:
                result = "31 days";
                break;
            case 9:
                result = "30 days";
                break;
            case 10:
                result = "31 days";
                break;
            case 11:
                result = "30 days";
                break;
            case 12:
                result = "31 days";
                break;
        }
        System.out.println("Month " + month + " = " + result);

    }
}

package week3.day15_whileLoop;

public class BreakStatement {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 6){
                break;
            }
            System.out.println(i);

        }

        System.out.println("---------------------------------");

        for (char i = 'A'; i <= 'Z'; i++){
            System.out.println(i);
            if (i == 'L'){
                break;
            }

        }

        System.out.println("-----------------------------------");


        for (int i = 0; i <= 30; i++) {
            System.out.println(i);



        }

    }
}

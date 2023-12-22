package week2.day13_customMethods;

public class ReturnMethodIntro {

    public static void main(String[] args) {

        // int total = sum(20,40); (sum is a void method and won't return any data)

        int total = sum(1,2);

        System.out.println(total);

        int sq = square(5);

        System.out.println(sq);

        int cb = cube(3);

        System.out.println(cb);



    }


    /*public static void sum(int n1, int n2){

        int result = n1 + n2;
*/

    public static int sum(int n1, int n2){

        int result = n1 + n2;

        return result;
    }

    public static int square(int num) {
        int square = num * num;

        return square;
    }

    public static int cube(int num) {
        int cube = square(num) * num;
        return cube;
    }
}



package week2.day14_forLoop;

public class MethodOverloadingIntro {

    public static void main(String[] args) {


        System.out.println(addInt(1, 2, 3, 4));

    }

    public static int addInt(int num1, int num2) {
        return num1 + num2;
    }

    public static int addInt(int num1, int num2, int num3) {
        return addInt(num1, num2 + num3);
    }

    public static int addInt(int num1, int num2, int num3, int num4) {
        return addInt(num1, num2, num3 + num4);
    }
}

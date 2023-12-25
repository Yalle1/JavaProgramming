package week4.day26_statics;

public class constructorCalls {

    public constructorCalls(){
        System.out.println("Default constructor");
    }

    public constructorCalls(int a){
        // constructorCalls() (Cannot call by its name, this() method needs to be used && and it needs to be at the first step)
        this(); //
        System.out.println("Constructor with int argument");
    }

    public constructorCalls(double b){
        System.out.println("Constructor with double argument");
    }

    public constructorCalls(String c){
        this(2.5);
        System.out.println("Constructor with String argument");
    }

    // Constructors cant call themselves
    // Cannot call more than one constructor
    // Only a constructor can call a constructor (normal methods cant)
    // When calling a constructor it needs to be the first step
    // Needs to use this() method

    public static void main(String[] args) {

        method1();

        System.out.println("---------------------------");

        method2();

        System.out.println("---------------------------");

        constructorCalls c = new constructorCalls(1);

    }

    public static void method1() {
        System.out.println("Method 1");
    }


    public static void method2() {
        method1();
        System.out.println("Method 2");
    }


}

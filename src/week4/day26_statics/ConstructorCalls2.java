package week4.day26_statics;

public class ConstructorCalls2 {

    public ConstructorCalls2(){

        System.out.println("Default");
    }

    public ConstructorCalls2(int a){
        this(); // calling the default constructor
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls2(String a){
        this(3);
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        ConstructorCalls2 obj1 = new ConstructorCalls2();

        System.out.println("-----------------------------");

        ConstructorCalls2 obj2 = new ConstructorCalls2(10);

        System.out.println("-----------------------------");

        ConstructorCalls2 obj3 = new ConstructorCalls2("Java");


    }
}

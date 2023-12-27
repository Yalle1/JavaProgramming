package week4.day27_accessModifiers;

public class AccessModifiers {

    public static int publicData = 200;

    protected static int protectedData = 300;

    static int defaultData = 400;

    private static int privateData = 500;

    public AccessModifiers() {
        System.out.println("public Constructor");
    }

    public static void publicMethod(){
        System.out.println("Public");
    }
    protected static void protectedMethod(){
        System.out.println("Protected");
    }
    static void defaultMethod(){
        System.out.println("Default");
    }

    private static void privateMethod(){
        System.out.println("Private");
    }


    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(protectedData);
        System.out.println(defaultData);
        System.out.println(privateData);

        System.out.println("-------------------");

        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();



    }




}

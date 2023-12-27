package week4.day27_accessModifiers;

import static week4.day27_accessModifiers.StaticInitializationBlock.*;

public class Test {

    public static void main(String[] args) {

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        System.out.println("--------------------------------------");

        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.protectedData);
        System.out.println(AccessModifiers.defaultData);
        // System.out.println(AccessModifiers.privateData);

        AccessModifiers.publicMethod();
        AccessModifiers.protectedMethod();
        AccessModifiers.defaultMethod();
        // AccessModifiers.privateMethod();



    }
}

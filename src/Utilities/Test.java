package Utilities;

import week4.day27_accessModifiers.AccessModifiers;
import week4.day27_accessModifiers.Data;

public class Test {

    public static void main(String[] args) {

        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();
        Data.method4();

        Data obj1 = new Data();

        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(obj1.c);

        obj1.method1();
        obj1.method2();

        System.out.println("----------------------------------");

        System.out.println(AccessModifiers.publicData);
        // System.out.println(AccessModifiers.protectedData);
        // System.out.println(AccessModifiers.defaultData);
        // System.out.println(AccessModifiers.privateData);

        AccessModifiers.publicMethod();

        System.out.println("----------------------------------");







    }


}

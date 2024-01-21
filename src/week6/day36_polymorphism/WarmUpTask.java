package week6.day36_polymorphism;

import week5.day30_Inheritence.PhoneTask.Nokia;
import week5.day30_Inheritence.PhoneTask.Phone;
import week5.day30_Inheritence.PhoneTask.Samsung;

public class WarmUpTask {

    public static void main(String[] args) {

        Phone[] phones = {

                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Silver", 850),
                new Samsung("Galaxy S21", "Large", "Black", 950),
                new Nokia("XR20", "Small", "Blue", 350),
                new Nokia("G10", "Medium", "Gray", 99),
                new Nokia("G50", "Large", "Silver", 250),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
        };

        for (Phone phone : phones){
            System.out.println(phone.getModel()+" - "+phone.getColor()+" - "+phone.getPrice());
        }

        System.out.println("---------------------------------------------------------");

        int n = 0;
        int b = 0;
        for (Phone phone : phones){
            if (phone instanceof Samsung){
                n++;
            } else if (phone instanceof Nokia) {
                b++;
            }
        }

        System.out.println("Number of Samsung's: "+n+"\nNumber of Nokia's: "+b);

        System.out.println("---------------------------------------------------------");

        for (Phone phone : phones){
            if (phone.getPrice()< 600){
                System.out.println(phone.getModel());
            }
        }

    }
}

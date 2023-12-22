package week4.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);

        list.addAll(1,numbers);

        System.out.println("list = " + list);

        System.out.println("----------------------------------");
        
        ArrayList<Integer> scores = new ArrayList<>();
        
        scores.addAll( Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println("scores = " + scores);

        System.out.println("----------------------------------");

        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList( "Gadir", "Hasan", "Abidullah", "Bilal" ));

        students.addAll(2,Arrays.asList("Bombaclat"));

        System.out.println("students = " + students);

        System.out.println("----------------------------------");
        
        Integer[] nums = {1,2,23,3,23,432,4};
        
        ArrayList<Integer> l1 = new ArrayList<>();
        
        l1.addAll(Arrays.asList(nums));

        System.out.println("l1 = " + l1);

        System.out.println("----------------------------------");

        Integer[] num = {1,2,23,3,23,432,4};

        ArrayList<Integer> k1 = new ArrayList<>(Arrays.asList(num));

        l1.addAll(Arrays.asList(nums));

        System.out.println("k1 = " + k1);

        System.out.println("----------------------------------");
        
        ArrayList<String> employeeList =  new ArrayList<>();
        
        employeeList.addAll(Arrays.asList("Alena","Muhtar","Gadir","Ali"));
        
        boolean hasAlena = employeeList.contains("Alena");
        boolean hasNames = employeeList.containsAll(Arrays.asList("Gadir","Ali"));

        boolean hasNames2 = employeeList.containsAll(Arrays.asList("Isam, Gadir, Ali"));

        System.out.println("hasAlena = " + hasAlena);
        System.out.println("hasNames = " + hasNames);
        System.out.println("hasNames2 = " + hasNames2);

        System.out.println("----------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(10,10,20,32,3,20,20,20,3423,412,10,10,10,323));

        list2.removeAll(Arrays.asList(10, 20));


        System.out.println("list2 = " + list2);

        System.out.println("----------------------------------");
        
        ArrayList<String> developers = new ArrayList<>();
        
        developers.addAll(Arrays.asList("Alena","Muhtar","Gadir","Ali","Muhtar","Gadir","Ali"));

        
        developers.retainAll(Arrays.asList("Muhtar", "Ali"));

        System.out.println("developers = " + developers);
        
        
        
        
        
        




    }
}

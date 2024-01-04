package week5.day30_Inheritence.TypesOfInheritence;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        Student student = new Student("Lucy",'F', LocalDate.now(),'A',"A123");
        President president = new President("Gucy",'M', LocalDate.now(),LocalDate.now());
        Teacher teacher = new Teacher("Ducy",'M', LocalDate.now(),"Teacher","d3d",5000);

        System.out.println(student);
        System.out.println(teacher);
        System.out.println(president);

        student.study();
        teacher.teach();
        president.lie();

        System.out.println("-----------------------------------------------------------");

        student.eat("Baklava");
        teacher.eat("Kebab");
        president.eat("Burek");

    }
}

package week4.day27_accessModifiers;

public class TestCydeoStudentObjects {
    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("George", 23,'M');
        CydeoStudent student2 = new CydeoStudent("Peter", 23,'M');
        CydeoStudent student3 = new CydeoStudent("Miskinaget", 23,'M');

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println(CydeoStudent.schoolName);


    }

}

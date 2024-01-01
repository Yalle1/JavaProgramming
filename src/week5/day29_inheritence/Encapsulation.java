package week5.day29_inheritence;

public class Encapsulation {

    private String name;
    private int age;
    private char gender, grade;
    private static String schoolName;

    static {
        schoolName = "Cydeo School";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 4 && age < 91) {
            this.age = age;
        } else {
            System.err.println("Invalid age!");
            System.exit(1);
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F'){
            this.gender = gender;
        }else {
            System.err.println("Invalid gender!");
            System.exit(1);
        }
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (grade == 'A' || grade == 'B' ||grade == 'C' ||grade == 'D' ||grade == 'F') {
            this.grade = grade;
        }else {
            System.err.println("Invalid grade!");
            System.exit(1);
        }
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        Encapsulation.schoolName = schoolName;
    }

    public Encapsulation(String name, int age, char gender, char grade) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
    }


    public void study(){
        System.out.println(name + " is studying");
    }

    public String toString() {
        return "Encapsulation{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}

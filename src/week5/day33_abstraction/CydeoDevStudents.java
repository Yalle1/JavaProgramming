package week5.day33_abstraction;

import week5.day32_finalKeyword.Person;

import java.time.LocalDate;

public final class CydeoDevStudents extends Person {

    private final String id;
    private String batchName;
    private int batchNumber;
    public static final String programmingLanguage;

    static {
        programmingLanguage = "Java";
    }

    public CydeoDevStudents(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth);
        ageControl();
        this.id = id;
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        if (!(batchName.equalsIgnoreCase("zero to hero") || batchName.equalsIgnoreCase("alumni dev"))){
            System.err.println("Batch name must be either: \"Zero to Hero\" or \"Alumni Dev\"");
            System.exit(1);
        }
        this.batchName = batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber <= 0){
            System.err.println("Batch number can not be 0 or negative!");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    private void ageControl() {
        if (getAge() < 18) {
            System.err.println("Age must be over 18!");
            System.exit(1);
        }
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating " + programmingLanguage);;
    }

    @Override
    public void drink() {
        System.out.println(getName()+" is drinking " + programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" does not need to sleep");
    }



    @Override
    public String toString() {
        return super.toString().replace("}","")+
        ", id='" + getId() + "\'" +
        ", batchName='" + getBatchName() + "\'" +
                ", batchNumber=" + getBatchNumber() +
                ", programmingLanguage=" + programmingLanguage + "}";

    }
}

package day08_ternaries_switch;

import java.util.SplittableRandom;

public class FieldTrip {

    public static void main(String[] args) {

        int gradeNumber = 6;
        String location = "Unknown";
        int numberOfGroups = 0;
        String teacherInCharge = "unknown";

        if (gradeNumber > 0 && gradeNumber < 7) {

            if (gradeNumber == 1) {
                location = "Apple orchard";
                numberOfGroups = 3;
                teacherInCharge = "Ms. Smith";
            } else if (gradeNumber == 2) {
                location = "Zoo";
                numberOfGroups = 7;
                teacherInCharge = "Mr. Lee";
            } else if (gradeNumber == 3) {
                location = "Aquarium";
                numberOfGroups = 5;
                teacherInCharge = "Ms. Wilson";
            } else if (gradeNumber == 4) {
                location = "Movie Theater";
                numberOfGroups = 2;
                teacherInCharge = "Ms. Reyes";
            } else if (gradeNumber == 5) {
                location = "Museum";
                numberOfGroups = 5;
                teacherInCharge = "Ms. Leila";
            } else if (gradeNumber == 6) {
                location = "Six Flags";
                numberOfGroups = 8;
                teacherInCharge = "Mr. Watt";
            }

            System.out.println("Grade - " + gradeNumber + "\n\tLocation - " + location + "\n\tNumber of groups - " + numberOfGroups + "\n\tTeacher in charge - " + teacherInCharge);

        } else {
            System.err.println("Invalid Grade");
        }


    }
}

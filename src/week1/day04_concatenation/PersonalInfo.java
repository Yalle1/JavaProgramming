package week1.day04_concatenation;

public class PersonalInfo {

    public static void main(String[] args) {

        String firstName = "Eyyup",
            lastName = "Yalap",
            from = "Sweden",
            favoriteMusic = "\"Skyrim ambience\"",
            favoriteBook = "\"Atomic Habits\"",
            favoriteShow = "\"Vinland Saga\"",
            favoriteColor = "Blue";
        char gender = 'M';
        int age = 18;
        boolean marriedStatus = false;

        System.out.println("My name is " + firstName + " " + lastName + " and my gender is " + gender + ". I am " + age +
                " years old and Im from " + from + "." + "\nFavorite music: " + favoriteMusic + "\nFavorite book: " +
                favoriteBook + "\nFavorite show: " + favoriteShow + "\nFavorite color: " + favoriteColor + "\nMarried status: " + marriedStatus);
    }
}

package week1.day07_ifStatements;

public class LoanApplication {
    public static void main(String[] args) {

        int salary = 44;
        int creditScore = 700;
        boolean eligible = salary >= 45 && creditScore >= 700;

        if (eligible) {
            System.out.println("Eligable");
        } else {
            System.out.println("Not eligible");
        }


    }
}

package day18_garbageCollection;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;


    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance: $" + balance);
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited $" + amount);
    }

    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Withdrew $" + amount);
    }


}

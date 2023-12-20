package day18_garbageCollection;



public class TestBankAccountClass {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.setInfo("Eyyup Yalap",32467372);

        bankAccount1.checkBalance();

        bankAccount1.deposit(5000);
        bankAccount1.checkBalance();

        bankAccount1.withdraw(1000);
        bankAccount1.checkBalance();
    }
}

package encapsulation;

public class BankSystem {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(1028993, "Dhani", 5000);

        // b1.balance = 10000;  // gives error as it is private

        b1.deposit(2000);
        b1.withdraw(1000);

        b1.getAccountDetails();
    }
}
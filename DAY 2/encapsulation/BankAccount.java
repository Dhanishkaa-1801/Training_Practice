package encapsulation;

public class BankAccount {

    private long accNo;
    private String name;
    private float balance;

    static String bankName = "SREC Bank";

    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public BankAccount(long accNo, String name, float balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    void deposit(float amount) {
        this.balance = balance + amount;
    }

    void withdraw(float amount) {
        this.balance = balance - amount;
    }

    void getAccountDetails() {
        System.out.println(this.accNo + " " + this.name + " " + this.balance);
    }
}
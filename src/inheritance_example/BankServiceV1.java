package inheritance_example;

public class BankServiceV1 {
	void deposit(long accNo, float amount ) {
		System.out.println("Amount "+amount+" deposited to "+accNo);
	}
	void withdraw(long accNo, float amount) {
		System.out.println("Amount "+amount+" withdrawn from "+accNo);
	}
	void printReceipt() {
		System.out.println("Account No ");
		System.out.println("Account Holder Name");
		System.out.println("Balance");
	}
}

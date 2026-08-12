package polymorphism;

public class BankService {
	
	double currentBalance = 2000.00;
	
	void deposit(String empId, long challanNo, float amount) {
		currentBalance = currentBalance+amount;
		System.out.println("Amount: "+amount);
		System.out.println("Employee ID: "+empId);
		System.out.println("Amount deposited successfully... ");
		System.out.println("Current balance is : "+ currentBalance);
	}
	
	void deposit(String upiId, int upiPin, float amount) {
		currentBalance = currentBalance+amount;
		System.out.println("Amount: "+amount);
		System.out.println("UPI ID: "+upiId);
		System.out.println("Amount transfered successfully...");
		System.out.println("Current balance is : "+ currentBalance);
	}
	
	void deposit(long custId, String password, float amount) {
		currentBalance = currentBalance+amount;
		System.out.println("Amount: "+amount);
		System.out.println("Netbanking ID: "+custId);
		System.out.println("Amount transfered successfully...");
		System.out.println("Current balance is : "+ currentBalance);
	}
}

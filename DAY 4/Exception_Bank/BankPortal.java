package bank_app;
import java.util.Scanner;

public class BankPortal {

	public static void main(String[] args) {
		
		BankService service=new BankService();
		
		System.out.println("Bank Portal");
		System.out.println("1. Search Account \n2. Withdraw Money \n3. Login Account ");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("Type acc no: ");
				int accNo=sc.nextInt();
			try {
				service.searchAccount(accNo);
			} catch (AccountNotFoundException e) {
				System.out.println(e.getMessage());
			}
			     break;
			case 2:
				System.out.println("Type your amount ");
				float amt=sc.nextFloat();
			try {
				service.withdrawl(amt);
			} catch (InsufficientBalanceException | InvalidAmountException e) {
				System.out.println(e.getMessage());
			}
				break;
			case 3:
				System.out.println("Type your card no:");
				int amt1 = sc.nextInt();
				System.out.println("Type your pin no: ");
				int pin1 = sc.nextInt();
			try {
				service.login(amt1, pin1);
			} catch (InvalidAmountException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}

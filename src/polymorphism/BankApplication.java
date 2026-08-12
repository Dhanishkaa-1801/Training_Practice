package polymorphism;
import java.util.Scanner;
public class BankApplication {
	public static void main(String[] args) {
		//basic java example
        String s = "Computer Science";
        System.out.println(s.substring(3));
        System.out.println(s.substring(3,7));
        
        //in constructors, the overloading is in the constrcutors
//        String str = new String();
//        String str2 = new String("dhani");
        
        //Bank Continuation
        Scanner sc = new Scanner(System.in);
        BankService bank = new BankService();
		System.out.println("------Amount Deposit Gateway------");
        System.out.println("1. Deposit using Challan");
        System.out.println("2. Deposit using UPI ID");
        System.out.println("3. Deposit using NetBanking ID");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice) {
        //write checking passwords and constraints with if else statements
        case 1:
            bank.deposit("S32D",12345678, 2000);
            break;
        case 2:
            bank.deposit("GP324", 180107, 2000);
            break;
        case 3:
            bank.deposit(63839499, "dhani", 2000);
            break;
        case 4:
            System.out.println("Thank you.");
            break;
        default:
            System.out.println("Invalid choice!");
        }
        sc.close();
        

	}
}

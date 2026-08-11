package inheritance_example;
import java.util.Scanner;
public class HierarchialInheritanceExample {
	public static void main(String[] args) {
//		System.out.println("Credit or Netbanking?");
		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
		
		System.out.println("1. Credit \n2. Netbanking \nEnter your Choice Below: ");
		int choice = sc.nextInt();
		
		switch(choice) {
	    case 1:
	        CreditCardService c1 = new CreditCardService();
	        c1.payWithCreditCard(123456789, 638394998);
	        break;

	    case 2:
	        NetBankingService n1 = new NetBankingService();
	        n1.payWithNetBanking(98765432, 638394998);
	        break;

	    default:
	        System.out.println("Invalid choice");
	        break;
	}
		
//		if(s.equals("Credit")) {
//			CreditCardService c1 = new CreditCardService();
//			c1.payWithCreditCard(123456789, 638394998);
//		}else {
//			NetBankingService n1 = new NetBankingService();
//			n1.payWithNetBanking(98765432, 638394998);
//			
//		}
	}

}

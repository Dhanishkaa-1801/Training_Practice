package inheritance_example;

import java.util.Scanner;

public class HierarchialInheritanceExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Credit \n2. Netbanking \n3. UPI \nEnter your Choice Below: ");

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

        case 3:
            UPIPaymentService u1 = new UPIPaymentService();
            u1.payWithUPI(638394998, "dhani@upi");
            break;

        default:
            System.out.println("Invalid choice");
            break;
        }
    }
}
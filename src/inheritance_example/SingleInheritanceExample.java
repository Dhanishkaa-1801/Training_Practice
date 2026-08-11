package inheritance_example;

public class SingleInheritanceExample {

    public static void main(String[] args) {

        BankServiceV3 service = new BankServiceV3();

        service.deposit(1028993, 1000);
        service.withdraw(1028993, 500);
        service.updateAadharNumber();
        service.updatePANNumber();
        service.applyForHomeLoan(1028993, 500000, 10);
    }
}